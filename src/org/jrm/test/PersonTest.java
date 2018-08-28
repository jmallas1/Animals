package org.jrm.test;

import org.jrm.Person;
import org.jrm.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/* TODO: Write tests for Person abstract class */

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