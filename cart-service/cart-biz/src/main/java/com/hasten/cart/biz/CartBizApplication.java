package com.hasten.cart.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {"com.hasten.content.api"})
public class CartBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(CartBizApplication.class, args);
    }

}
