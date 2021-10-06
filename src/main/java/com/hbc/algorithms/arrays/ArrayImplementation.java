package com.hbc.algorithms.arrays;

import java.util.*;

public class ArrayImplementation implements ArrayInterface {

    @Override
    public void addElement(Integer ele) {

    }

    @Override
    public Boolean checkIfKeyPresentForEveryKSegment(Integer key) {
        return null;
    }

    @Override
    public Integer[] findMinMaxArrayElements() {
        return new Integer[0];
    }

    @Override
    public Integer[] reverseArray() {
        return new Integer[0];
    }

    @Override
    public boolean findSumOfThree(ArrayList<Integer> arrayOfIntegers, Integer requiredSum) {
        int fixedElement = 0;
        int leftOverSum = 0;
        Collections.sort(arrayOfIntegers);
        for (int i=0;i<arrayOfIntegers.size();i++) {
            fixedElement = arrayOfIntegers.get(i);
            leftOverSum = requiredSum - fixedElement;
            ArrayList<Integer> remainingList = new ArrayList<>(arrayOfIntegers.size());
            for (int j=0;j<arrayOfIntegers.size();j++) {
                remainingList.add(arrayOfIntegers.get(j));
            }
            remainingList.remove(i);
            ArrayList<Integer> remainingSums = calculateRemainingSum(remainingList);
            if (remainingSums.contains(leftOverSum)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findSumOfThreeAlternate(int [] arrayOfIntegers, Integer requiredSum) {
        //first we sort the array
        Arrays.sort(arrayOfIntegers);

        for (int i=0;i<arrayOfIntegers.length;i++) {
            int remainingSum = requiredSum - arrayOfIntegers[i];
            if (findSumOfTwo(arrayOfIntegers, remainingSum, i+1))
                return true;
        }
        return false;
    }

    private boolean findSumOfTwo(int [] arrayOfIntegers, int remainingSum, int startIndex) {
        int localSum = 0;
        int i= startIndex;
        int j= arrayOfIntegers.length - 1;
        while (i<j) {
            localSum = arrayOfIntegers[i] + arrayOfIntegers[j];
            if (remainingSum == localSum)
                return true;
            else if (localSum < remainingSum)
                i++;
            else if (localSum > remainingSum)
                j--;
        }
        return false;
    }

    @Override
    public Double findMedianOfTwoSortedArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return null;
    }

    @Override
    public Integer removeDuplicatesFromSortedArray(ArrayList<Integer> sortedArray) {
        int i=0;
        if (sortedArray.size() == 0) return 0;
        for (int j=1; j < sortedArray.size(); j++) {
            if (sortedArray.get(i) != sortedArray.get(j)) {
                i++;
                sortedArray.set(i , sortedArray.get(j));
            }
        }
        return i+1;
    }

    @Override
    public Interval mergeIntervals(Interval intervals[]) {
        if (intervals.length == 0)
            return null;

        Stack<Interval> stack = new Stack<>();

        // sort the intervals in increasing order of start time
        Arrays.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start-i2.start;
            }
        });

        stack.push(intervals[0]);

        // Start from the next interval and merge if necessary
        for (int i = 1 ; i < intervals.length; i++)
        {
            // get interval from stack top
            Interval top = stack.peek();

            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < intervals[i].start)
                stack.push(intervals[i]);

            // Otherwise update the ending time of top if ending of current
                // interval is more
            else if (top.end < intervals[i].end)
            {
                top.end = intervals[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        return stack.pop();
    }

    @Override
    public int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedResult = new int[arr1.length+arr2.length];
        int arr1Position = 0;
        int arr2Position = 0;
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int mergedPosition =0;

        while (arr1Position < arr1Length && arr2Position < arr2Length) {
            if (arr1[arr1Position] < arr2[arr2Position]) {
                mergedResult[mergedPosition++] = arr1[arr1Position++];
            } else if (arr2[arr2Position] < arr1[arr1Position]) {
                mergedResult[mergedPosition++] = arr2[arr2Position++];
            }
        }

        while (arr1Position < arr1Length) {
            mergedResult[mergedPosition++] = arr1[arr1Position++];
        }

        while (arr2Position < arr2Length) {
            mergedResult[mergedPosition++] = arr2[arr2Position++];
        }
        return mergedResult;
    }

    private ArrayList<Integer> calculateRemainingSum(ArrayList<Integer> list) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int sum = list.get(i) + list.get(i + 1);
            sums.add(sum);
        }
        return sums;
    }

}
