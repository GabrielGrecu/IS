package com.is;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Instructions instructions = new Instructions();

        while (true) {
            System.out.println("Introduceți un string ('hello', 'info', 'exit'): ");

            String input = scanner.nextLine();

            if (input.equals("hello")) {
                instructions.afisare();
            } else if (input.equals("info")) {
                instructions.info();
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("Stringul citit: " + input);
            }
        }

        scanner.close();
        
        instructions.afisare();
        instructions.info();

        System.out.println("lll");
    }
}
