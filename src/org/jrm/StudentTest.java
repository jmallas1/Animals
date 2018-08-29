package org.jrm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StudentTest {

    private Student someStudent;

    @BeforeEach
    void setUp() { someStudent = new Student(42, "Jared"); }

    @AfterEach
    void tearDown() { someStudent = null; }

    @Test
    void getAge() {
        assertEquals(42, someStudent.getAge());
    }

    @Test
    void setAge() {
        someStudent.setAge(43);
        assertNotEquals(42, someStudent.getAge());
        assertEquals(43, someStudent.getAge());
    }

    @Test
    void talk() {
        assertEquals("Can we talk about my grade.", someStudent.talk());
    }

    @Test
    void getName() {
        assertEquals("Jared", someStudent.getName());
    }

    @Test
    void setName() {
        someStudent.setName("Gary");
        assertNotEquals("Jared", someStudent.getName());
        assertEquals("Gary", someStudent.getName());
    }
}