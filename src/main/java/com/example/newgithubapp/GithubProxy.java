package com.example.newgithubapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "github-client", url = "https://docs.github.com/en")
public interface GithubProxy {

    // GET https://docs.github.com/en/rest?apiVersion=2022-11-28
    @GetMapping("/search")
    String search(
            @RequestParam("apiVersion") Integer apiVersion
    );
}
