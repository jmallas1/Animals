package org.jrm.test;

import org.jrm.Dog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    private Dog someFriendlyDog;
    private Dog someMeanDog;

    @BeforeEach
    void setUp() {
        someFriendlyDog = new Dog(true, "Trooper");
        someMeanDog = new Dog(false, "Fluffy");
    }

    @AfterEach
    void tearDown() { someFriendlyDog = null; }

    @Test
    void isFriendly() {
        assertTrue(someFriendlyDog.isFriendly());
        assertFalse(someMeanDog.isFriendly());
    }

    @Test
    void talk() {
        assertEquals("Bark", someFriendlyDog.talk());
        assertEquals("Bark", someMeanDog.talk());
    }

    @Test
    void getName() {
        assertEquals("Trooper", someFriendlyDog.getName());
        assertEquals("Fluffy", someMeanDog.getName());
    }
}