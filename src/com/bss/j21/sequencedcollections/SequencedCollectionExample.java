package com.bss.j21.sequencedcollections;

import java.util.*;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        SequencedCollection<String> sequencedList = new ArrayList<>();

        sequencedList.add("Middle1");
        sequencedList.add("Middle");
        sequencedList.add("Middle2");
        sequencedList.addFirst("First");
        sequencedList.add("Middle3");
        sequencedList.addLast("Last"); //addLast() should be last line of adding


        System.out.println("Original List: " + sequencedList);
        System.out.println("First Element: " + sequencedList.getFirst());
        System.out.println("Last Element: " + sequencedList.getLast());

        SequencedCollection<String> reversedList = sequencedList.reversed();
        System.out.println("Reversed List: " + reversedList);

        SequencedSet<String> sequencedSet = new LinkedHashSet<>();
        sequencedSet.add("AAAAA");
        sequencedSet.add("BBBBB");
        sequencedSet.addFirst("First");
        sequencedSet.addLast("Last"); // tobe a last add stmt
        sequencedSet.add("CCCCC");
        System.out.println("Original Set: " + sequencedSet);

    }
}
