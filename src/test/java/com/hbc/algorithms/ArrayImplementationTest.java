package com.hbc.algorithms;


import com.hbc.algorithms.arrays.ArrayImplementation;
import com.hbc.algorithms.arrays.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A set of methods that test the array implementation
 */
public class ArrayImplementationTest {

    @Test
    public void sumOfThreeUnHappyPath()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        ArrayList<Integer> results = new ArrayList<Integer>();
        results.add(1);
        results.add(10);
        results.add(20);
        results.add(42);
        Integer requiredSum = new Integer(23);
        boolean resultsOfCall = curImpl.findSumOfThree(results, requiredSum);
        assertFalse( resultsOfCall );
    }

    @Test
    public void sumOfThreeHappyPath()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        ArrayList<Integer> results = new ArrayList<Integer>();
        results.add(1);
        results.add(10);
        results.add(20);
        results.add(42);
        Integer requiredSum = new Integer(31);
        boolean resultsOfCall = curImpl.findSumOfThree(results, requiredSum);
        assertTrue( resultsOfCall );
    }
    @Test
    public void moreSumOfThreeHappyPath()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        ArrayList<Integer> results = new ArrayList<Integer>();
        results.add(1);
        results.add(10);
        results.add(20);
        results.add(42);
        Integer requiredSum = new Integer(63);
        boolean resultsOfCall = curImpl.findSumOfThree(results, requiredSum);
        assertTrue( resultsOfCall );
    }

    @Test
    public void mergedIntervalsHScenarioOne()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(1,9);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);

        Interval resultsOfCall = curImpl.mergeIntervals(arr);
        assertTrue( resultsOfCall.start == 1 );
        assertTrue( resultsOfCall.end == 9 );
    }

    @Test
    public void mergedIntervalsHScenarioTwo()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(6,8);
        arr[1]=new Interval(3,11);
        arr[2]=new Interval(2,4);
        arr[3]=new Interval(4,7);

        Interval resultsOfCall = curImpl.mergeIntervals(arr);
        assertTrue( resultsOfCall.start == 2 );
        assertTrue( resultsOfCall.end == 11 );
    }


    @Test
    public void removeDuplicatesInSortedArrayHappyPath()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(6);
        arr.add(8);
        Integer resultsOfCall = curImpl.removeDuplicatesFromSortedArray(arr);
        assert(resultsOfCall == 4);
    }

    @Test
    public void removeDuplicatesInSortedArrayAnotherHappyPath()
    {
        ArrayImplementation curImpl = new ArrayImplementation();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(7);
        arr.add(4);
        arr.add(3);
        arr.add(8);
        arr.add(9);
        arr.add(3);
        arr.add(10);
        Collections.sort(arr);
        Integer resultsOfCall = curImpl.removeDuplicatesFromSortedArray(arr);
        assert(resultsOfCall == 8);
    }


    @Test
    public void testMergedSortedArray()
    {
        int [] firstArray = new int[]{9,14,21,34,75};
        int [] secondArray = new int[]{1,6,7,77,104};;
        ArrayImplementation curImpl = new ArrayImplementation();
        int [] resultsOfCall = curImpl.mergeTwoSortedArrays(firstArray, secondArray);
        assert(resultsOfCall[0] == 1);
        assert(resultsOfCall[1] == 6);
        assert(resultsOfCall[2] == 7);
        assert(resultsOfCall[2] == 9);
    }

}
