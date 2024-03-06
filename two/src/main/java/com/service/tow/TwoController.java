package com.service.tow;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class TwoController {
    @GetMapping("/health/status")
    private ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok("UP");
    }
}
