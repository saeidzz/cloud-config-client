package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RateController {

    @Value("${rate}")
    String rate;

    @GetMapping(value = "/getRate")
    public ResponseEntity getRate() {
        Map<String, String> model = new HashMap<>();
        model.put("rate", rate);
        return new ResponseEntity(model, HttpStatus.OK);
    }
}
