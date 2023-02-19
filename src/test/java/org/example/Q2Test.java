package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Q2Test {


    Q2 q2 = new Q2();

    @Test
    public void TestFindMedian1(){
        int[] numbers1 = {2,4,6,5,7};
        int[] numbers2 = {7,6,34,2,1};
        assertEquals(q2.findMedian(numbers1,numbers2),6);

    }
    @Test
    public void TestFindMedian2(){
        int[] numbers1 = {5,4,6,7,8};
        int[] numbers2 = {32,56,4,2,7,8};
        assertEquals(q2.findMedian(numbers1,numbers2),6.5);

    }
}
