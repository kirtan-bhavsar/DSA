package Test;

import java.util.Scanner;

public class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("You are allowed to enter this site");
        } else {
            System.out.println("You are not allowed to enter this site");
        }
    }
}

/*
 * ---Integers---
 * int - 4bytes
 * long - 8bytes
 * short - 2bytes
 * byte - 1byte
 * ---Float---
 * float - 4bytes
 * double - 8bytes
 * ---character---
 * char - 2bytes
 * ---boolen---
 * boolean
 * 
 */