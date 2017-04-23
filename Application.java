package com.javacodenet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @Autowired
    ApplicationArguments applicationArguments;

    @RequestMapping("/")
    public String programArguments() {
        String output = "Application Startup Program arguments:";
        for (String arg: applicationArguments.getOptionNames()) {
            output = output + " " + arg;
        }
        return output;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}