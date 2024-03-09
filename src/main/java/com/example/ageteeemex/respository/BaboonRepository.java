package com.example.ageteeemex.respository;

import com.example.ageteeemex.model.Baboon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaboonRepository {

    public List<Baboon> getBaboons() {
        Baboon rico = new Baboon("Rico", 10, Boolean.TRUE);
        Baboon maka = new Baboon("Maka", 3, Boolean.FALSE);

        return List.of(rico, maka);
    }
}
