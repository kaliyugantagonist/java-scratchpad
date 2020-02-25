package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Animal;
import com.entities.generics.sierrabates.basic.Cat;
import com.entities.generics.sierrabates.basic.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <? super Animal-subclass> wildcard examples with a java.util.List of Dog, Cat. <br><br>
 * The reason why this class is encapsulating AnimalCheckup is because the various scenarios of wildcards will be tested via this class's unit test class.
 */
public class SuperExample {

    public class AnimalCheckup {

        Logger logger = LoggerFactory.getLogger(SuperExample.class);

        public void checkDogOrHigher(List<? super Dog> dogsOrHigher) {

            /*Why doesn't the below code compile?
              Well, 'super' implies it can be a List of Animal or even Object types. Now, does Object class have a checkUp() ?
            * */
            //dogsOrHigher.forEach(animal -> animal.checkUp());

            dogsOrHigher.add(new Dog("Droopy"));

            /*Won't compile
            Cat is at the level of Dog, NOT higher(super)
            * */
            //dogsOrHigher.add(new Cat());

            /*Won't compile
            While Object is higher in hierarchy than Dog, one cannot add an Object to a List<Dog> but other way is fine!
            * */
            //dogsOrHigher.add(new Object());

            dogsOrHigher.stream().forEach(element -> logger.debug("Element is {} ",element));

        }
    }
}
