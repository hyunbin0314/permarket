package com.example.permarket.controller;

import com.example.permarket.service.NaverSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/news/search")
public class NaverSearchController {

    @Autowired
    private NaverSearchService naverSearchService;

    @GetMapping
    public Map<String, Object> search(@RequestParam String query) {
        return naverSearchService.searchNews(query);
    }

}
