package com.hbc.algorithms.arrays;

import java.lang.Integer;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.Set;

/** An Integererface which defines the set of methods to be implemented around arrays
 * These include the following:
 * Check if a key is present in every segment of size k in an array
 * Find the minimum and maximum element in an array
 * Write a program to reverse the array
 * Write a program to sort the given array
 * Find the Kth largest and Kth smallest number in an array
 * Find the occurrence of an Integereger in the array
 * Sort the array of 0s, 1s, and 2s
 * Range and Coefficient of array
 * Move all the negative elements to one side of the array
 * Find the Union and Integerersection of the two sorted arrays
 */
public interface ArrayInterface{

    public void addElement(Integer ele);

    /**
     * Given a key defined generically we determine whether or not this key is present
     * every kth sequence in an array
     * @param key the key defined generically , this means it can be Integereger or string
     * @return a flag indicating whether the key is present in one of kth sequences in the array
     */
    public Boolean checkIfKeyPresentForEveryKSegment(Integer key);

    /**
     * Given an array find the min and max elements and return these, the array itself will
     * again be generically defined
     * @return two items, one representing the min and the other the max
     */
    public Integer[] findMinMaxArrayElements();

    /**
     * Given an array reverse it and return the reversed array.
     * @return the entire array reversed
     */
    public Integer[] reverseArray();

    /**
     * Given an array of Integeregers and a value, determine if there are any three Integers
     * in the array whose sum equals the given value.
     * @param arrayOfIntegers
     * @param requiredSum
     */
    public boolean findSumOfThree(ArrayList<Integer> arrayOfIntegers, Integer requiredSum);


    /**
     * Given two sorted arrays find the median of these arrays
     * @param nums1 the first array
     * @param nums2 the second array
     * @return the median of the two arrays
     *
     */
    public Double findMedianOfTwoSortedArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2);

    /**
     * Given a sorted array remove all the duplicates.
     * Do not allocate extra space for another array.
     * You must do this by modifying the input array in-place with O(1) extra memory.
     * @param sortedArray the array with the duplicates
     * @return Return k after placing the final result in the first k slots of nums.
     *
     */
    public Integer removeDuplicatesFromSortedArray(ArrayList<Integer> sortedArray);



    /**
     * You have an array (list) of Integererval pairs as input where each Integererval has a start and end timestamp,
     * sorted by starting timestamps. Merge the overlapping Integerervals and return a new output array.
     * @param initialArray the array that is passed in
     * @return Return the pair corresponding to the merged Integerervals.
     *
     */
    public Interval mergeIntervals(Interval intervals[]);
}
