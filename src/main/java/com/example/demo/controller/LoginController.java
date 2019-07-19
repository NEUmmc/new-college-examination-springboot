package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.user;
import com.example.demo.utils.Response;
import io.github.biezhi.anima.Anima;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by LSK.Reno on 2019/3/14 16:13.
 */

@RestController
@RequestMapping("/home")
public class LoginController {

    @RequestMapping(value = "/login")
    public String Login(@RequestBody Map<String,String> param) {
        int code = 0;
        System.out.println("请求触发的路由：/home/login");
        System.out.println("得到的userName参数值：" + param.get("userName"));
        System.out.println("得到的password参数值：" + param.get("password"));
        String userName = param.get("userName");
        String password = param.get("password");
        List<user> userList= Anima.select().from(user.class).where("userName=?",userName).all();
        List<user> matchUser= Anima.select().from(user.class).where("userName=?",userName).where("password=?",password).all();
        String response = "";

        if (userList.size()==0){
            code = 123; //123表示无此用户，用户名错误
            response = "无"+userName+"用户";
        }else if (matchUser.size()==0){
            code = 124;
            response = userName+"用户密码错误";
        }else if (matchUser.size()==1){
            code = 200;
            response = userName+"用户登录成功";
        }
        System.out.println(JSON.toJSONString(new Response<>(code,response)));
        return JSON.toJSONString(new Response<>(code,response));
    }
}

