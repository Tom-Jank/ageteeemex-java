package com.example.ageteeemex.controller;

import com.example.ageteeemex.model.Baboon;
import com.example.ageteeemex.service.BaboonService;
import com.example.ageteeemex.service.BaboonServiceImpl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/baboon")
public class BaboonController {

    private final BaboonService baboonService;

    BaboonController(BaboonService baboonService) {
        this.baboonService = baboonService;
    };

    @GetMapping
    public HttpEntity<List<Baboon>> getAllBaboons() {
        return new ResponseEntity<>(baboonService.getAllBaboons(), HttpStatus.OK);
    }
}
