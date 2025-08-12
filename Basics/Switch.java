package Basics;

import java.util.Scanner;

public class Switch {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char ch = str.charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("You got above 90 marks");
                break;
            case 'B':
                System.out.println("You got between 80 to 90");
                break;
            case 'C':
                System.out.println("You got between 70 to 80");
                break;
            case 'D':
                System.out.println("You got between 60 to 70");
                break;
            case 'E':
                System.out.println("You got between 33 to 60");
                break;
            default:
                System.out.println("You got below 33");
                break;

        }

    }

}
