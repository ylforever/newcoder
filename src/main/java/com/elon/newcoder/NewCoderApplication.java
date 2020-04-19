package com.elon.newcoder;

import com.elon.newcoder.service.mergesortedlist.MergeSortedListSolution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewCoderApplication {
    public static void main(String[] args) {
        new MergeSortedListSolution().test();
        SpringApplication.run(NewCoderApplication.class);
        System.out.println("Start up NewCoderApplication success.");
    }
}
