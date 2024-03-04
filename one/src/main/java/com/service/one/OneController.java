package com.service.one;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/one")
public class OneController {

    @GetMapping("/health/status")
    public ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok().body("UP");
    }
}


