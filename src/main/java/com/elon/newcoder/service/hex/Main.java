package com.elon.newcoder.service.hex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Integer> hexChar2Num = new HashMap<>();
    static {
        hexChar2Num.put("A", 10);
        hexChar2Num.put("B", 11);
        hexChar2Num.put("C", 12);
        hexChar2Num.put("D", 13);
        hexChar2Num.put("E", 14);
        hexChar2Num.put("F", 15);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String hexStr = scanner.nextLine();
            String octStr = hex2oct(hexStr);
            System.out.println(octStr);
        }
    }

    private static String hex2oct(String hex) {
        int oct = 0;
        int pow = 0;
        for (int i = hex.length() - 1; i > 1; --i) {
            String hexChar = String.valueOf(hex.charAt(i));
            if (hexChar2Num.containsKey(hexChar)) {
                int hexNum = hexChar2Num.get(hexChar);
                oct += hexNum * Math.pow(16, pow);
            } else {
                int hexNum = Integer.parseInt(hexChar);
                oct += hexNum * Math.pow(16, pow);
            }

            ++pow;
        }

        return String.valueOf(oct);
    }
}
