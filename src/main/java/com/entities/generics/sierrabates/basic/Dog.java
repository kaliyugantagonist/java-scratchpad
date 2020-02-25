package com.entities.generics.sierrabates.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends Animal {

    Logger logger = LoggerFactory.getLogger(Dog.class);

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public void checkUp() {
        logger.info("Dog checked is {} ",this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
