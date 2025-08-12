package com.rookies4.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// Application 클래스가 Configuration(설정) 클래스 역할을 한다. @SpringBootConfiguration
// 반드시 해당 클래스를 작성할때 base-package 아래에 작성을 해야 한다. @ComponentScan
// 외부라이브러리에 대한 설명기능을 제공하는 AutoConfiguration을 활성화 해주는 역할. @EnableAutoConfiguration
public class MySpringBoot3ProjectApplication {

	public static void main(String[] args) {


        SpringApplication.run(MySpringBoot3ProjectApplication.class, args);
	}

    @Bean
    public String hello() {
        return "Hello Spring Boot!";
    }
}
