package org.example.app.views;

import java.util.Scanner;

public class UserUpdateView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Enter contact's ID: ";
        System.out.print(title);
        System.out.print(title);
        String id = scanner.nextLine();

        title = "Enter new password: ";
        System.out.print(title);
        String pass = scanner.nextLine().trim();

        return new String[] {id, pass};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}