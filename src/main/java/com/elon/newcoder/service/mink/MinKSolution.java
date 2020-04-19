package com.elon.newcoder.service.mink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinKSolution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {


        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < input.length; ++i) {
            numList.add(input[i]);
        }

        if (input.length < k) {
            return new ArrayList<>();
        }

        numList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.intValue() - o2.intValue();
            }
        });

        return new ArrayList<>(numList.subList(0, k));
    }
}
