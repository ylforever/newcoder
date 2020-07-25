package com.elon.newcoder.service.statcharactor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        int num = statCharactorNum(inputStr);
        System.out.println(num);
    }

    private static int statCharactorNum(String inputStr) {
        Set<Integer> charSet = new HashSet<>();
        for (int i = 0; i < inputStr.length(); ++i) {
            int c = inputStr.charAt(i);
            if (c > 0 && c < 127) {
                charSet.add(c);
            }
        }

        return charSet.size();
    }
}
