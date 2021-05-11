package com.zfcraft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableScheduling
//@MapperScan("com.zfcraft.web.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Scheduled(cron="0/5 * * * * ?")
//    public void task(){
//        System.out.println("task - 20秒执行一次");
//    }
}
