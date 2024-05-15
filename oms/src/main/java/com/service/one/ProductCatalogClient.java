package com.service.one;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "product-catalog",path = "/product-catalog")
public interface ProductCatalogClient {
    @GetMapping("/health/status")
    ResponseEntity<String> healthStatus();
}
