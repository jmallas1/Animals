package org.jrm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PersonTest {

    private Person somePerson;

    @BeforeEach
    void setUp() { somePerson = new Student(42, "Jared"); }

    @AfterEach
    void tearDown() { somePerson = null; }

    @Test
    void getName() {
        assertEquals("Jared", somePerson.getName());
    }

    @Test
    void setName() {
        somePerson.setName("Brian");
        assertNotEquals("Jared", somePerson.getName());
        assertEquals("Brian", somePerson.getName());
    }
}