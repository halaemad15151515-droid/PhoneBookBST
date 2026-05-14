/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phonebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PhoneBookBST phonebook = new PhoneBookBST();

        int choice;

        do {

            System.out.println("\n1- Insert");
            System.out.println("2- Search");
            System.out.println("3- Size");
            System.out.println("0- Exit");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = input.nextLine();

                    System.out.print("Phone: ");
                    String phone = input.nextLine();

                    phonebook.insert(new Contact(name, phone));
                    break;

                case 2:
                    System.out.print("Search Name: ");
                    name = input.nextLine();

                    phonebook.search(name);
                    break;

                case 3:
                    System.out.println("Size = " + phonebook.size());
                    break;
            }

        } while (choice != 0);

        input.close();
    }
}