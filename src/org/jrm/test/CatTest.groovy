package org.jrm.test

import org.jrm.Cat
import org.junit.jupiter.api.Test

class CatTest extends GroovyTestCase {

    public Cat testCat

    void setUp() {
        super.setUp()
        testCat = new Cat(3, "Felix")
    }

    void tearDown() {
    }

    @Test
    void testGetMousesKilled() {
        assertEquals("There should be three mice killed", 3, testCat.getMousesKilled())
    }

    void testAddMouse() {
    }

    void testTalk() {
    }

    void testToString() {
    }

    void testGetName() {
    }
}
