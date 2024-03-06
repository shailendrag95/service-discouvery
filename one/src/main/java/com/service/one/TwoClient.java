package com.service.one;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-two",path = "/two")
public interface TwoClient {
    @GetMapping("/health/status")
    public ResponseEntity<String> healthStatus();
}
