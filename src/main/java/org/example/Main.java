package org.example;

public class Main {
    public static void main(String[] args) {

        int i = 9;
        int factorial =1 ;
        for (int j=1; j<=i; j++) {
            factorial = factorial*j;
        }

        System.out.println("Hello world! " + factorial);
    }
}
