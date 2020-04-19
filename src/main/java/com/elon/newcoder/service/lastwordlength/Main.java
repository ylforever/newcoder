package com.elon.newcoder.service.lastwordlength;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length = lastWordLength(str);
        System.out.println(length);
    }

    public static int lastWordLength(String str) {
        String[] words = str.split(" ");

        if (words.length == 0) {
            return 0;
        }

        return words[words.length - 1].trim().length();
    }
}
