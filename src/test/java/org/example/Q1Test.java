package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {


        Q1 q1 = new Q1();


    @Test
    public void testMove1(){
        int[] test1ExpectedResponseArray = {0,3};
        assertArrayEquals(q1.move("UUU"),test1ExpectedResponseArray);
    }

    @Test
    public void testMove2(){
        int[] test2ExpectedResponseArray = {0,3};
        assertArrayEquals(q1.move("UUU"),test2ExpectedResponseArray);
    }

    @Test
    public void testMove3(){
        int[] test3ExpectedResponseArray = {0,0};
        assertArrayEquals(q1.move("UUDRLLRD"),test3ExpectedResponseArray);
    }

    @Test
    public void testMove4(){
        int[] test4ExpectedResponseArray = {1,-1};
        assertArrayEquals(q1.move("Up Down Left 2xRight Down"),test4ExpectedResponseArray);
    }
}