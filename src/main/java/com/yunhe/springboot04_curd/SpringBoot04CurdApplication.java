package com.yunhe.springboot04_curd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class SpringBoot04CurdApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot04CurdApplication.class, args);
    }


    @Bean
    public ViewResolver myViewResolver(){
        return new myViewResolver() ;
    }

    public static class myViewResolver implements  ViewResolver{


        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
