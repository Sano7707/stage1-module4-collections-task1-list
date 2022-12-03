package com.epam.mjc.collections.list;

import java.util.Comparator;

import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        double a1 = Math.pow(Integer.parseInt(a), 2) * 5 + 3;
        double b1 = Math.pow(Integer.parseInt(b), 2) * 5 + 3;
        if(a1 > b1){
            return 1;
        }
       else
           return -1;
    }

}
