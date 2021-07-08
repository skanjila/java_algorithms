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

    private ArrayList<Integer> calculateRemainingSum(ArrayList<Integer> list) {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < list.size() - 1; i++) {
            int sum = list.get(i) + list.get(i + 1);
            sums.add(sum);
        }
        return sums;
    }

}
