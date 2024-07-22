package com.perso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        List<Integer> reversedList = new ArrayList<>();

        for (int i = 1; i < 21; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (Integer i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        System.out.println(evenList);
        System.out.println(oddList);

        Collections.reverse(list);
        reversedList.addAll(list);
        System.out.println(reversedList);
    }
}