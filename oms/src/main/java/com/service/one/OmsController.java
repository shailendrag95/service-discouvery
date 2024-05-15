package com.service.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oms")
@RefreshScope
@Configuration
public class OmsController {

    @Value("${server.nick.name:default}")
    private String nickName;

    @Autowired
    private ProductCatalogClient twoClient;

    @Autowired
    private PricingCatalogClient threeClient;

    @GetMapping("/health/status")
    public ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok().body("UP");
    }
    @GetMapping("/nick-name")
    public ResponseEntity<String> getNickName(){ return ResponseEntity.ok(nickName);}

    @GetMapping("/health/status/product-catalog")
    public ResponseEntity<String> healthStatusTwo(){
        return twoClient.healthStatus();
    }

    @GetMapping("/health/status/pricing-catalog")
    public ResponseEntity<String> healthStatusThree(){
        return threeClient.healthStatus();
    }
}


