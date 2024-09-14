package com.hasten.content.biz;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author Hasten
 */
@SpringBootApplication
@EnableSwagger2Doc
@EnableWebMvc
public class ContentApp {
    public static void main(String[] args) {
        SpringApplication.run(ContentApp.class, args);
    }
}
