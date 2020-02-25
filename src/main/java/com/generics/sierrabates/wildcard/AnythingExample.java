package com.generics.sierrabates.wildcard;

import com.entities.generics.sierrabates.basic.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;

/**
 * <?> wildcard examples with a java.util.List.
 * <br><br>
 * The reason why this class is encapsulating Anything is because the various scenarios of wildcards will be tested via this class's unit test class.
 */
public class AnythingExample {

    private Logger logger = LoggerFactory.getLogger(AnythingExample.class);

    public class Anything {

        public void acceptAnyList (List <?> anyList) {

            anyList.stream().forEach(listItem -> logger.debug("List item is {} ", listItem));
        }
    }
}
