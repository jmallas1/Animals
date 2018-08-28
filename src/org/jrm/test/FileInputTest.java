package org.jrm.test;

import org.jrm.FileInput;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileInputTest {

    private FileInput fi;

    @BeforeEach
    void setUp() {
        fi = new FileInput("./src/org/jrm/test/FileInputTest.java");
    }

    @AfterEach
    void tearDown() {
    }
/*
    @Test
    void fileRead() {
        // Not sure how to test reading a whole file...
    }
*/
    @Test
    void fileReadLine() {
        assertEquals("package org.jrm.test;", fi.fileReadLine());
    }

/*    @Test
    void fileClose() {
        // How to test a closed file without throwing an exception?
    }
*/

}