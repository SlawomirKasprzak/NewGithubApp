package com.example.newgithubapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableFeignClients
public class NewGithubAppApplication {

    @Autowired
    GithubProxy githubProxy;

    public static void main(String[] args) {
        SpringApplication.run(NewGithubAppApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void makeRequestToGithubEndPoint() {

    }

}
