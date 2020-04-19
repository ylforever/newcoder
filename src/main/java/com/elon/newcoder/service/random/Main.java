package com.elon.newcoder.service.random;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        List<Integer> numList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            if (num <= 0) {
                num = Integer.parseInt(scanner.nextLine());
                numList.clear();
                continue;
            } else {
                numList.add(Integer.parseInt(scanner.nextLine()));
            }

            --num;
            if (num <= 0) {
                List<Integer> orderedList = orderNum(numList);
                for (Integer newNum : orderedList) {
                    System.out.println(newNum);
                }
            }
        }

    }

    private static List<Integer> orderNum(List<Integer> numList) {
        Set<Integer> numSet = new HashSet<>();
        numSet.addAll(numList);

        numList.clear();
        numList.addAll(numSet);
        numList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        });

        return numList;
    }
}
