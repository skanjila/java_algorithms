package com.hbc.algorithms;


import com.hbc.algorithms.arrays.ArrayImplementation;
import com.hbc.algorithms.arrays.Interval;
import com.hbc.algorithms.linkedlist.LinkedListImplementation;
import com.hbc.algorithms.linkedlist.LinkedListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A set of methods that test the linkedlist implementation
 */
public class LinkedListImplementationTest {

    @Test
    public void nthFromTheEnd()
    {
        LinkedListImplementation curImpl = new LinkedListImplementation();
        LinkedListNode nodeOne = new LinkedListNode(20);
        LinkedListNode nodeTwo = new LinkedListNode(46);
        LinkedListNode nodeThree = new LinkedListNode(72);
        LinkedListNode nodeFour = new LinkedListNode(92);
        LinkedListNode nodeFive = new LinkedListNode(22);
        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next = nodeFive;
        nodeFive.next= null;
        int nthFromEnd = curImpl.nthFromTheEnd(nodeOne, 3);
        assert(nthFromEnd == 72);
    }


}
