package com.generics.sierrabates.basic;

import com.entities.generics.sierrabates.basic.Animal;
import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;

import java.util.ArrayList;
import java.util.List;

/**
 * Refer Chapter 'Collections' from SCJP guide by Sierra-Bates
 */
public class FirstLook {

    public static void main(String[] args) {

    /*Start:
    1. Type of variable declaration/reference must match the object type passed */
        /* Correct code */
        List<Animal> animalsReferenceType = new ArrayList<Animal>();
        /*Incorrect code, won't compile*/
        //List <Animal> anotherAnimalsReferenceType = new ArrayList <Cat> ();
    /*End:
     1. Type of variable declaration/reference must match the object type passed */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*Start:
    2. You can add a subtype in a supertype collection. Even if such a list is received as an argument(refer AnimalCheckup.checkAnimal()), one can add subtype objects*/
        List<Animal> animalsSuper = new ArrayList<Animal>();
        animalsSuper.add(new Cat());
        animalsSuper.add(new Dog());
    /*End:
    2. You can add a subtype in a supertype collection. Even if such a list is received as an argument(refer AnimalCheckup.checkAnimal()), one can add subtype objects*/


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*Start:
    3. Corollary of 1, here we call a method that accepts a generic list.
     */

        AnimalCheckup animalCheckup = new AnimalCheckup();
        /* Correct code */
        List<Animal> animalsRefType = new ArrayList<Animal>();
        animalCheckup.checkAnimal(animalsRefType);

        /* Incorrect code, won't compile */
        List<Cat> anotherAnimalsRefType = new ArrayList<Cat>();
        //animalCheckup.checkAnimal(anotherAnimalsRefType);

    /*End:
    3. Corollary of 1, here we call a method that accepts a generic list.
     */


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    }

    private static class AnimalCheckup {

        public void checkAnimal(List<Animal> animals) {

            animals.forEach(animal -> animal.checkUp());

        }
    }
}
