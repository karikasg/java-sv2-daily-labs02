package day01;

import java.util.Scanner;

public class HumanMain {

    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kérem a nevet: ");
        name = scanner.nextLine();
        System.out.print("Kérem az életkort: ");
        age = scanner.nextInt();

        Human human = new Human(name, age);

        System.out.println("\nA személy adatai:  név: "+human.getName()+", életkora: "+human.getAge());
    }
}
