package com.elon.newcoder.service.countcharnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();

        int num = countCharNum(str.toLowerCase(), subStr.toLowerCase());
        System.out.println(num);
    }

    private static int countCharNum(String str, String subStr) {
        if (!str.contains(subStr)) {
            return 0;
        }

        String newStr = str.replaceFirst(subStr, "");
        return 1 + countCharNum(newStr, subStr);
    }
}
