package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = s.nextInt();
        System.out.println("Fact is: " +         fact(num));


    }
    public  static int fact(int n){
        if (n==1){
            return 1;
        }
            return n*fact(n-1);

    }
}
