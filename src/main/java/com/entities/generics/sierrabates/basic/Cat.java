package com.entities.generics.sierrabates.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat extends Animal {

    Logger logger = LoggerFactory.getLogger(Cat.class);

    private String name;
    private String breed;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat() {

    }

    @Override
    public void checkUp() {
        logger.info("Cat checked is {}",this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
