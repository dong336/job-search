package com.job_search.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/test")
    public ResponseEntity<Map<String, Object>> test() throws Exception {
        Map<String, Object> response = Map.of("message", "테스트 성공");
        //ss
        return ResponseEntity.ok(response);
    }
}
