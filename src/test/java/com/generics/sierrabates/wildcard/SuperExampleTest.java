package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SuperExampleTest {

    SuperExample superExample;
    SuperExample.AnimalCheckup animalCheckup;

    @Before
    public void setUp() throws Exception {
        superExample = new SuperExample();
        animalCheckup =  superExample.new AnimalCheckup();
    }

    @Test
    /**
     * Test <? super Dog> with a List Dog instances.
     */
    public void passDogList() {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog ("Dripple"));
        animalCheckup.checkDogOrHigher(dogs);
    }

    @Test
    /**
     * Test <? super Dog> with a List Cat instances.
     */
    public void passCatList() {
        List<Cat>cats = List.of(new Cat());
        /*Won't compile
        Cat IS-NOT Dog
        * */
        //animalCheckup.checkDogOrHigher(cats);
    }

    @Test
    /**
     * Test <? super Dog> with a List Object instances.
     */
    public void passObjectList() {
        List<Object>objects = new ArrayList<>();
        objects.add(new Object());
        animalCheckup.checkDogOrHigher(objects);
    }
}