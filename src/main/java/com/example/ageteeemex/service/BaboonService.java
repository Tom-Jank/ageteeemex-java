package com.example.ageteeemex.service;

import com.example.ageteeemex.model.Baboon;
import com.example.ageteeemex.respository.BaboonRepository;

import java.util.List;

public interface BaboonService {
    List<Baboon> getAllBaboons();
}
