package com.example.ageteeemex.service;

import com.example.ageteeemex.model.Baboon;
import com.example.ageteeemex.respository.BaboonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaboonServiceImpl implements BaboonService {

    private final BaboonRepository baboonRepository;

    BaboonServiceImpl(BaboonRepository baboonRepository) {
        this.baboonRepository = baboonRepository;
    }

    @Override
    public List<Baboon> getAllBaboons() {
        return baboonRepository.getBaboons();
    }
}
