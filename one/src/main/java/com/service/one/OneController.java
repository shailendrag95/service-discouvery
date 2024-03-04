package com.service.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/one")
@RefreshScope
public class OneController {

    @Value("${server.nick.name:default}")
    private String nickName;

    @GetMapping("/health/status")
    public ResponseEntity<String> healthStatus(){
        return ResponseEntity.ok().body("UP");
    }

    @GetMapping("/nick-name")
    public ResponseEntity<String> getNickName(){ return ResponseEntity.ok(nickName);}
}


