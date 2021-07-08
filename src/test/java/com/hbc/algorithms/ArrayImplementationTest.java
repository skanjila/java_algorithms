package com.hbc.algorithms;


import com.hbc.algorithms.arrays.ArrayImplementation;
import com.hbc.algorithms.arrays.Interval;
import org.junit.Test;

import java.util.ArrayList;

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

}
