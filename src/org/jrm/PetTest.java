package org.jrm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PetTest {

    private Pet somePet;

    @BeforeEach
    void setUp() { somePet = new Cat(7, "Urza");
    }

    @AfterEach
    void tearDown() { somePet = null; }

    @Test
    void getName() {
        assertEquals("Urza", somePet.getName());
    }
}