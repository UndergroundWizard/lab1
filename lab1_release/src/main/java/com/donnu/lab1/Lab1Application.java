package com.donnu.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class Lab1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value="myName",defaultValue = "World") String name) {
        return String.format("Hello %s!",name);

    }

    @GetMapping("/options")
    public String showOptions(@RequestParam(value="myOptions",defaultValue = " not an option ") String options) {
        return String.format("Option:  %s!",options);

    }

    @GetMapping("/about")
    public String showAbout(@RequestParam(value="myAbout",defaultValue = " us ") String about) {
        return String.format("about:  %s!",about);

    }



}
