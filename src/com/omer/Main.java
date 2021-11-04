package com.omer;

import java.util.Scanner;

public class Main {

        static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter 2 strings to check if the first string contain the second");
        System.out.println("Please enter first string:");
        String first = scanner.nextLine();
        System.out.println("Please enter second string");
        String second = scanner.nextLine();

        if (first.contains(second)){System.out.println("second string exists in first");}
        else{System.out.println("second string does not exists in first");}

            }
        }

