package com.service.tow;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Configuration
@RequestMapping("/product-catalog")
public class ProductCatalogController {

    @Value("${product.nick.name}")
    private String nickName;

    @GetMapping("/health/status")
    private ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok("UP");
    }

    @GetMapping("/nick-name")
    public ResponseEntity<String> getNickName(){ return ResponseEntity.ok(nickName);}
}
