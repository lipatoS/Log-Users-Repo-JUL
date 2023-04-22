package org.example.app.views;


import java.util.Scanner;

public class UserCreateView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);


        String title = "Enter login: ";
        System.out.print(title);
        String login = scanner.nextLine();

        title = "Enter password: ";
        System.out.print(title);
        String pass = scanner.nextLine();

        title = "Enter email in format example@mail.com: ";
        System.out.print(title);
        String email = scanner.nextLine();

        return new String[]{login, pass, email};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
