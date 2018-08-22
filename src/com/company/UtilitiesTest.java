package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;

    @Before
    public void setup() {
        this.utilities = new Utilities();
    }

    @Test
    public void everyNthChar() {
        assertArrayEquals(new char[] {'e', 'l'} , this.utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'} , 2));
    }

    @Test
    public void everyNthChar2() {
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'} , this.utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'} , 7));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", this.utilities.removePairs("AABCDDEFF"));
    }

    @Test
    public void removePairs2() {
        assertEquals("ABCABDEF", this.utilities.removePairs("ABCCABDEEF"));
    }

    @Test
    public void removePairs4() {
        assertNull(this.utilities.removePairs(null));
    }

    @Test
    public void removePairs5() {
        assertEquals("", this.utilities.removePairs(""));
    }

    @Test
    public void removePairs6() {
        assertEquals("A", this.utilities.removePairs("A"));
    }

    @Test
    public void removePairs7() {
        assertEquals("A", this.utilities.removePairs("AA"));
    }


    @Test
    public void converter() {
        assertEquals(300, this.utilities.converter(10,5));
    }

    @Test(expected = ArithmeticException.class)
    public void converter2() {
        assertEquals(300, this.utilities.converter(10,0));
    }

    @Test
    public void nullIfOddLength() {
        assertNull(this.utilities.nullIfOddLength("aaa"));
    }

    @Test
    public void nullIfOddLength2() {
        assertNotNull(this.utilities.nullIfOddLength("aaaa"));
    }
}