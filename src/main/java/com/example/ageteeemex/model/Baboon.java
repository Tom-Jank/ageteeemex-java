package com.example.ageteeemex.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.hateoas.RepresentationModel;

// Even tho no annotations and no db this is Entity class for now
public class Baboon {
    public String name;
    public Integer age;
    public Boolean gender;

    @JsonCreator
    public Baboon(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
