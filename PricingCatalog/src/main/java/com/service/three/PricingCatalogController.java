package com.service.three;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pricing-catalog")
public class PricingCatalogController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/health/status")
    private ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok("UP port:- "+serverPort);
    }

}
