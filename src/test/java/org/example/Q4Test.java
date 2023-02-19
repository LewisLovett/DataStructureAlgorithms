package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Q4Test {

    Q4 q4 = new Q4();

    @Test
    public void DuplicateTest1 (){
        int[] numArray = {2,2,4,3};
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        assertEquals(q4.dups(numArray),expectedResult );
    }

    @Test
    public void DuplicateTest2 (){
        int[] numArray = {2,2,4,5,5};
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(5);
        assertEquals(q4.dups(numArray),expectedResult );
    }
}
