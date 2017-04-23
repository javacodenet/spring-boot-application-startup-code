package com.javacodenet;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Startup Program arguments");
        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
