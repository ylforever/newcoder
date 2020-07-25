package com.elon.newcoder.service.reverseint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        List<String> inputList = reverseInt(inputInt);

        StringBuilder sb = new StringBuilder();
        for (String in : inputList) {
            sb.append(in);
        }

        System.out.println(Integer.parseInt(sb.toString()));
    }

    private static List<String> reverseInt(int inputInt) {
        List<String> inputList = new ArrayList<>();
        String inputStr = String.valueOf(inputInt);
        for (int i = inputStr.length() - 1; i >= 0; --i) {
            String str = String.valueOf(inputStr.charAt(i));
            if (inputList.contains(str)) {
                continue;
            }

            inputList.add(str);
        }

        return inputList;
    }
}
