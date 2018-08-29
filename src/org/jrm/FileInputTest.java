package org.jrm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileInputTest {

    private FileInput fi;

    @BeforeEach
    void setUp() {
        fi = new FileInput("./src/org/jrm/FileInputTest.java");
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
        assertEquals("package org.jrm;", fi.fileReadLine());
    }

/*    @Test
    void fileClose() {
        // How to test a closed file without throwing an exception?
    }
*/

}