package com.company;

//Remove Duplicates In A Sorted Linked List

public class RemoveDuplicatesInSortedLinkedList {
   
    public void removeDuplicates(Linkedlist l ){
        Linkedlist res = new Linkedlist();

        while(l.size() > 0){
            int val = l.getFirst();
            l.removeFirst();

            if(res.size() == 0 || val != res.tail.data){
                res.addLast(val);
            }
        }

        l.head = res.head;
        l.tail = res.tail;
        l.size = res.size;
    }

}
