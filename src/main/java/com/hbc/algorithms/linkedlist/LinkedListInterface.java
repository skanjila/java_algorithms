package com.hbc.algorithms.linkedlist;


public interface LinkedListInterface {

    /**
     * Given two numbers represented by two linkedlists add the numbers and return the sum represented
     * by a linked list, the numbers themselves are stored example 4->9->1 added to 7->9->2 yields
     * 491+792 = 1293, namely 1->2->9->3
     * @param firstList
     * @param secondList
     * @return
     */
    public LinkedListNode addTwoNumbers(LinkedListNode firstListNode, LinkedListNode secondListNode);


    /**
     * Given a current list reverse the actual list
     * @param head is the head of the current list
     * @return a pointer to the new list
     */
    public LinkedListNode reverseList(LinkedListNode head);

    /**
     * Find the value of the node which is nth from the end of the list.
     * Leverage two pointers to traverse list, one is n nodes ahead
     * and then the lagging pointer will point to the node needing
     * to be returned.
     * @param head is the head of the current list
     * @param n the nth position from the end
     * @return the node which is at the nth position in the list
     */
    public int nthFromTheEnd(LinkedListNode head, int n);

}
