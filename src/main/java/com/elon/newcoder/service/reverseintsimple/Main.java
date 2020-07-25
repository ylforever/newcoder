package com.elon.newcoder.service.reverseintsimple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        String inputStr = String.valueOf(inputInt);
        StringBuilder sb = new StringBuilder();
        for (int i = inputStr.length() - 1; i >= 0; --i) {
            sb.append(inputStr.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
