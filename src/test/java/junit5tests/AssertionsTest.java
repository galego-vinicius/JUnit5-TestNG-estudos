package junit5tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void assertEqualsTest(){
        assertEquals("firstString", "secondString",
                "The String values were not equal");
    }

    @Test
    void assertEqualsListTest(){
        List<String> expectedValues = Arrays.asList("firstString", "secondString",
                "thirdString");
        List<String> actualValues = Arrays.asList("firstString", "secondString");
        assertEquals(expectedValues, actualValues);
        // assertNotEquals
    }

    @Test
    void assertArraysEqualsTest(){
        int[] expectedValues = {1,3};
        int[] actualValues = {1,2,3};

        assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void assertTrueTest(){
        //assertFalse
        assertTrue(false, "This boolean condition did not evaluate to true");
    }

    @Test
    void assertThrowsTest(){
        assertThrows(NullPointerException.class, null);
    }

    @Test
    void asertAllTest(){
        assertAll(
                () -> assertEquals("firstString", "secondString",
                        "The String values were not equal"),
                () -> assertThrows(NullPointerException.class, null),
                () -> assertTrue(false, "This boolean condition did not evaluate to true")
        );
    }

}
