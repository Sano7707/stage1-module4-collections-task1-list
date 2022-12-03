package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newLinkedList = new LinkedList<>();
        for (Integer i: sourceList) {
            if(i % 2 == 1){
                newLinkedList.addFirst(i);
            }
            else
                newLinkedList.addLast(i);
        }
        return newLinkedList;
    }
}
