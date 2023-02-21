package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class);
    }


    @RequestMapping("/")
    String helloWorld() {
        return "{\r\n\"Employees\" : [\r\n{\r\n\"userId\":\"rirani\",\r\n\"jobTitleName\":\"Developer\",\r\n\"firstName\":\"Romin\",\r\n\"lastName\":\"Irani\",\r\n\"preferredFullName\":\"Romin Irani\",\r\n\"employeeCode\":\"E1\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"408-1234567\",\r\n\"emailAddress\":\"romin.k.irani@gmail.com\"\r\n},\r\n{\r\n\"userId\":\"nirani\",\r\n\"jobTitleName\":\"Developer\",\r\n\"firstName\":\"Neil\",\r\n\"lastName\":\"Irani\",\r\n\"preferredFullName\":\"Neil Irani\",\r\n\"employeeCode\":\"E2\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"408-1111111\",\r\n\"emailAddress\":\"neilrirani@gmail.com\"\r\n},\r\n{\r\n\"userId\":\"thanks\",\r\n\"jobTitleName\":\"Program Directory\",\r\n\"firstName\":\"Tom\",\r\n\"lastName\":\"Hanks\",\r\n\"preferredFullName\":\"Tom Hanks\",\r\n\"employeeCode\":\"E3\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"408-2222222\",\r\n\"emailAddress\":\"tomhanks@gmail.com\"\r\n}\r\n]\r\n}";
    }

}
