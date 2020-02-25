package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Animal;
import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * <? extends Animal> wildcard examples with a java.util.List of Animal.
 * <br><br>
 * The reason why this class is encapsulating AnimalCheckup is because the various scenarios of wildcards will be tested via this class's unit test class.
 */
public class ExtendsExample {

    public class AnimalCheckup {

        public void checkAnimal(List<? extends Animal> animals) {

            animals.forEach(animal -> animal.checkUp());

        }
    }
}
