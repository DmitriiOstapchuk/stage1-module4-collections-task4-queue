package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        Comparator <String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        PriorityQueue queue = new PriorityQueue<>(comparator);
        for (String string : firstList) {
            queue.add(string);
        }
        for (String string : secondList) {
            queue.add(string);
        }
        return queue;
    }
}
