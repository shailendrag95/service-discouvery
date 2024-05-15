package com.service.one;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "pricing-catalog",path = "/pricing-catalog")
public interface PricingCatalogClient {
    @GetMapping("/health/status")
    ResponseEntity<String> healthStatus();
}
