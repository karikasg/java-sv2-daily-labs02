package day02;

import day01.Human;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int sideA;
        int sideB;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem az egyik oldalt: ");
        sideA = scanner.nextInt();scanner.nextLine();
        System.out.print("Kérem a másik oldalt: ");
        sideB = scanner.nextInt();scanner.nextLine();

        Rectangle rectangle = new Rectangle(sideA, sideB);

        System.out.println("\nA téglalap területe "+rectangle.calculateArea());
    }
}
