package com.elon.newcoder.service.splitstr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        List<String> splitList = splitStr(str1);
        List<String> splitList2 = splitStr(str2);
        splitList.addAll(splitList2);

        for (String str : splitList) {
            System.out.println(str);
        }
    }

    private static List<String> splitStr(String str) {
        List<String> splitList = new ArrayList<>();

        int start = 0;
        int length = str.length();

        while (start < length) {
            if (start + 8 <= length) {
                splitList.add(str.substring(start, start + 8));
            } else {
                String subStr = str.substring(start, length);
                int subStrLength = subStr.length();
                for (int i = 0; i < 8 - subStrLength; ++i) {
                    subStr += "0";
                }

                splitList.add(subStr);
            }

            start += 8;
        }

        return splitList;
    }
}
