package com.hbc.algorithms.linkedlist;

public class LinkedListImplementation implements  LinkedListInterface {

    @Override
    public LinkedListNode addTwoNumbers(LinkedListNode firstListNode, LinkedListNode secondListNode) {
        //check to make sure both lists are non null
        if (firstListNode == null && secondListNode !=null)
            return secondListNode;
        else if (secondListNode == null && firstListNode !=null)
            return firstListNode;

        int sum = 0;
        int carry = 0;
        LinkedListNode tmp = null;
        LinkedListNode prev = null;
        LinkedListNode finalResult = null;

        //loop through both lists
        while (firstListNode != null || secondListNode != null) {

            sum = carry + firstListNode.data + secondListNode.data;

            //update carry for next calculation
            carry = (sum >= 10) ? 1 : 0;

            // is sum is greater than 10 then update it
            sum = sum % 10;

            tmp = new LinkedListNode(sum);

            if (finalResult == null)
                finalResult = tmp;
            else {
                prev.next = tmp;
            }

            if (firstListNode != null) {
                firstListNode = firstListNode.next;
            }

            if (secondListNode != null) {
                secondListNode = secondListNode.next;
            }

        }
        if (carry > 0) {
            tmp.next = new LinkedListNode(carry);
        }

        return finalResult;
    }

    @Override
    public LinkedListNode reverseList(LinkedListNode head) {
        return null;
    }

    @Override
    public int nthFromTheEnd(LinkedListNode head, int n) {
        LinkedListNode fastPtr = head;
        LinkedListNode slowPtr = head;
        //first move fastPtr along n nodes
        for (int i=0;i<n-1;i++) {
            fastPtr = fastPtr.next;
        }
        while (fastPtr.next!=null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        //now return the value at slowPtr
        return slowPtr.data;
    }

}
