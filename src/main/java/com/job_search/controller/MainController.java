package com.job_search.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping("/main")
    public String main(Map<String, Object> param) throws Exception {
       return "main";
    }
}
