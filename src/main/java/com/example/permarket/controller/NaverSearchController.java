package com.example.permarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/news/search")
public class NaverSearchController {

    @GetMapping
    public String getSearch() {

        return "";
    }


}
