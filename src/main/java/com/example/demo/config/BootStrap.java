package com.example.demo.config;

import io.github.biezhi.anima.Anima;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by LSK.Reno on 2019/5/17 22:17.
 */
@Component
public class BootStrap implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception{
        Anima.open("jdbc:mysql://47.93.33.253/aio_schema?serverTimezone=UTC", "root", "p932w8wt34tl2d3g47k9gh");
    }
}
