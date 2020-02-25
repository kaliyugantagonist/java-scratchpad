package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Animal;
import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnythingExampleTest {

    AnythingExample anythingExample;
    AnythingExample.Anything anything;

    @Before
    public void setUp() throws Exception {

        anythingExample = new AnythingExample();
        anything = anythingExample.new Anything();

    }

    @Test
    /**
     * Pass a list of cats to List<?>
     */
    public void passCatListToAnythingWildcard() {
        List<Cat> cats = List.of(new Cat("Pete"));
        anything.acceptAnyList(cats);
    }

    @Test
    /**
     * Pass a list of any class to List<?>
     */
    public void passAnyClassListToAnythingWildcard (){
        List<Integer> integers = List.of(1, 2, 3);
        anything.acceptAnyList(integers);
    }

    @Test
    /**
     * Addition disallowed with ?
     */
    public void tryAddingToWildcard() {
        List<? extends Animal> animals
                = new ArrayList<Animal>();
        /*Code won't compile, adding prohibited*/
        //animals.add( new Cat () );


        List <?> anyList = new ArrayList <> ();
        /*Code won't compile, adding prohibited*/
        //anyList.add(new Dog() );
    }
}