package com.test;

import java.util.Scanner;

/**
 *  test scanner
 */
public class TestScanner {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("please input a number : ");
//        String str = scanner.next();
//        System.out.println("Your input a number is " + str);
        String str = "11111111r2222222";
        Scanner scanner = new Scanner(str);
        String java = scanner.findInLine("[0-9]*");

        System.out.println(java);

        java = scanner.findInLine("[0-9]*");

        System.out.println(java);


    }
}
