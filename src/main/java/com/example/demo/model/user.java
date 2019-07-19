package com.example.demo.model;

import io.github.biezhi.anima.Model;
import io.github.biezhi.anima.annotation.Column;
import io.github.biezhi.anima.annotation.Table;


/**
 * Created by LSK.Reno on 2019/3/14 16:14.
 */


@Table(name = "user")
public class user extends Model {
    private int id;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password")
    private String password;

    public user(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}


