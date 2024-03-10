package com.example.ageteeemex.controller;

import com.example.ageteeemex.model.Baboon;
import com.example.ageteeemex.service.BaboonService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public HttpEntity<Baboon> addNewBaboon(@RequestParam String name, @RequestParam Integer age) {
        return new ResponseEntity<>(new Baboon(name, age, Boolean.TRUE), HttpStatus.OK);
    }
}
