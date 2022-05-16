package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RefreshScope
@RestController
public class RateController {

    @Value("${rate}")
    String rate;
    @Value("${connstring}")
    String conn;

    @GetMapping(value = "/getRate")
    public ResponseEntity getRate() {
        Map<String, String> model = new HashMap<>();
        model.put("rate", rate);
        model.put("connstring", conn);
        return new ResponseEntity(model, HttpStatus.OK);
    }
}
