package com.springhow.example.getemployeedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EmployeeData extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EmployeeData.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(EmployeeData.class);
    }

    @RequestMapping("/")
    String getData() {
        return "{\r\n\"Employees\" : [\r\n{\r\n\"userId\":\"swaroop\",\r\n\"jobTitleName\":\"Manager\",\r\n\"firstName\":\"Swaroop\",\r\n\"lastName\":\"Panigrahy\",\r\n\"preferredFullName\":\"Swaroop Panigrahy\",\r\n\"employeeCode\":\"D1\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"888-5351660\",\r\n\"emailAddress\":\"romin.k.irani@gmail.com\"\r\n},\r\n{\r\n\"userId\":\"nirani\",\r\n\"jobTitleName\":\"Developer\",\r\n\"firstName\":\"Neil\",\r\n\"lastName\":\"Irani\",\r\n\"preferredFullName\":\"Neil Irani\",\r\n\"employeeCode\":\"E2\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"408-1111111\",\r\n\"emailAddress\":\"neilrirani@gmail.com\"\r\n},\r\n{\r\n\"userId\":\"thanks\",\r\n\"jobTitleName\":\"Program Directory\",\r\n\"firstName\":\"Tom\",\r\n\"lastName\":\"Hanks\",\r\n\"preferredFullName\":\"Tom Hanks\",\r\n\"employeeCode\":\"E3\",\r\n\"region\":\"CA\",\r\n\"phoneNumber\":\"408-2222222\",\r\n\"emailAddress\":\"sudheer@yahoo.com\"\r\n}\r\n]\r\n}";
    }

}
