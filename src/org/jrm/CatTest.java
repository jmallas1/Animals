package org.jrm;

import org.jrm.Cat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    private Cat someCat;

    @BeforeEach
    void setUp() {
        someCat = new Cat(3, "Felix");
    }

    @AfterEach
    void tearDown() {
        someCat = null;
    }

    @Test
    void getMousesKilled() {
        assertEquals(3, someCat.getMousesKilled(), "There should be three killed mice");
    }

    @Test
    void addMouse() {
        someCat.addMouse();
        assertEquals(4, someCat.getMousesKilled(), "After adding one, there should be four mice");
    }

    @Test
    void talk() {
        assertSame("Meow", someCat.talk(), "Cats say Meow");
    }

    @Test
    void getName() {
        assertSame("Felix", someCat.getName(), "This cats name is Felix");
    }
}