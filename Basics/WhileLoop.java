package Basics;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String args[]) {

        int attempts = 0;

        int maxAttempts = 3;

        Scanner sc = new Scanner(System.in);

        String password = "654321";

        String userInputPassword = "";

        // password = "654321";

        while (!userInputPassword.equals(password) && attempts < maxAttempts) {
            System.out.println("Enter your password");
            userInputPassword = sc.nextLine();
            attempts++;
            if (!userInputPassword.equals(password)) {
                System.out.println("Incorrect Password, please try again");
            }
        }

        if (userInputPassword.equals(password)) {
            System.out.println("User logged in successfully");
        } else {
            System.out.println("Max login attempts reached, please try again after 10 minutes");
        }

    }

}
