package org.piotr.lesson7.school;

import java.util.Scanner;

public class SchoolApplication {
    enum Menu {
        MAIN, TEACHER, STUDENT
    }

    private static Scanner scanner = new Scanner(System.in);
    private static School school = new School();
    private static Menu menu = Menu.STUDENT;

    public static void main(String[] args) {
        while (true) {
            switch (menu) {
                case MAIN:  handleMainMenu();                           break;
                case TEACHER:  handleTeacherMenu();                     break;
                case STUDENT:  handleStudentMenu();                     break;
                default:    System.out.println("Menu nieobslugiwane");  break;
            }
        }
    }

    private static void handleMainMenu() {
        System.out.println("1. Zaloguj sie");
        System.out.println("2. Zarejestruj sie");
        System.out.println("3. Zakoncz");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1: handleLogin();                                  break;
            case 2: handleRegister();                               break;
            case 3: exit();                                         break;
            default: System.out.println("Operacja nieobslugiwana"); break;
        }
    }

    private static void handleLogin() {

    }

    private static void handleRegister() {

    }

    private static void handleTeacherMenu() {

    }

    private static void handleStudentMenu() {

    }

    private static void exit() {
        System.exit(0);
    }
}
