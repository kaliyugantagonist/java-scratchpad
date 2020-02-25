package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Animal;
import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

//TODO: Convert to JUnit5
public class ExtendsExampleTest {

    private Logger logger = LoggerFactory.getLogger(ExtendsExampleTest.class);

    private ExtendsExample extendsExample;
    private ExtendsExample.AnimalCheckup animalCheckup;

    @Before
    public void setUp() throws Exception {
        extendsExample = new ExtendsExample();
        animalCheckup = extendsExample.new AnimalCheckup();
    }

    /*@After
    public void printDemarcation (){
        logger.debug("***************************************************************************************");
    }*/

    @Test
    /**
     * Add different animals to a List<Animal> and send to a method which accepts Animals and it's subclasses*/
    public void addSubclassesToSuperList(){

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Garfield"));
        animals.add(new Dog("Odie"));

        animalCheckup.checkAnimal(animals);

        logger.info("***************************************************************************************");
    }

    @Test
    /**
     * Send a list of subclasses of Animal.
     */
    public void sendSubclassList () {
        List <Cat> cats = List.of(new Cat("TC"), new Cat("Chuchu"));
        List <Dog> dogs = List.of(new Dog("Spyke"));

        animalCheckup.checkAnimal(cats);
        animalCheckup.checkAnimal(dogs);

        logger.info("***************************************************************************************");
    }

    @Test
    /**
     * A wildcard with extends clause cannot add an element to the list.*/
    public void attemptAddingToAWildcardList (){
        List <? extends Animal> animals = new ArrayList<> ();

        /*Incorrect code, won't compile.*/
        //animals.add(new Cat("NoCat"));
    }
}