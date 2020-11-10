package org.piotr.lesson7.school;

import org.piotr.lesson7.school.user.Student;
import org.piotr.lesson7.school.user.Teacher;
import org.piotr.lesson7.school.user.User;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SchoolApplication {
    enum Menu {
        MAIN, TEACHER, STUDENT
    }

    private static Scanner scanner = new Scanner(System.in);
    private static School school = new School();

    private static Student student = null;
    private static Teacher teacher = null;

    private static Menu menu = Menu.MAIN;

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
        System.out.println("Podaj username: ");
        String username = scanner.next();

        System.out.println("Podaj haslo: ");
        String password = scanner.next();

        if (school.isUsernameAndPasswordCorrect(username, password)) {
            // sprawdzic czy zalogowal sie student czy nauczyciel i przeniesc do konkretnego menu
            User user = school.getUserByUsername(username);
            if (user instanceof Student) {
                student = (Student) user;
                menu = Menu.STUDENT;
            } else if (user instanceof Teacher) {
                teacher = (Teacher) teacher;
                menu = Menu.TEACHER;
            } else {
                System.out.println("Blad - uzytkownik nieobslugiwany");
            }

        } else {
            System.out.println("Blad - zle dane logowania lub uzytkownik nie istnieje");
        }
    }

    private static void handleRegister() {
        System.out.println("Podaj imie: ");
        String name = scanner.next();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.next();

        System.out.println("Podaj login: ");
        String username = scanner.next();

        if (school.isUsernameTaken(username)) {
            System.out.println("Blad - nazwa uzytkownika zajeta");
            return;
        }

        System.out.println("Podaj haslo: ");
        String password = scanner.next();

        System.out.println("1. rejestruj jako student");
        System.out.println("2. rejestruj jako nauczyciel");

        int choice = scanner.nextInt();
        switch (choice){
            case 1: {
                school.getStudentList().add(new Student(name, surname, username, password));
                break;
            }
            case 2: {
                school.getTeacherList().add(new Teacher(name, surname,username,password));
                break;
            }
            default:
                System.out.println("zla opcja");
        }
    }

    private static void handleTeacherMenu() {
        System.out.println("1.Pokaz liste wykladanych przedmiotow: ");
        System.out.println("2.Pokaz liste prowadzonych uczniow: ");
        System.out.println("3.Pokaz liste ocen uczniow: ");
        System.out.println("4.Pokaz liste obecnosci: ");
        System.out.println("5. Wystaw ocene");
        System.out.println("5. Wyloguj: ");

        int choice = scanner.nextInt();
        switch(choice){
            case 1: handleShowSubjects(); break;
            case 2: handleShowLeedStudents(); break;
            case 3: handleShowListGradeStudent(); break;
            case 4: handleShowListPresent(); break;
            case 5: handleNewMark(); break;
            case 6: logout(); break;
            default: System.out.println("Blad - niepoprawny wybor");
        }


    }

    private static void handleShowListGradeStudent() {
    }

    private static void handleShowLeedStudents() {
    }

    private static void handleNewMark() {
        System.out.println("Wybierz studenta, dla ktorego chcesz wystawic ocene");
        for (int i = 0; i < school.getStudentList().size(); i++) {
            Student s = school.getStudentList().get(i);
            System.out.printf("%d. %s %s - %s\n", i+1, s.getName(), s.getSurname(), s.getUsername());
        }
        int studentChoice = scanner.nextInt();
        Student student = school.getStudentList().get(studentChoice - 1);

        System.out.println("Wybierz przedmiot");
        Subject[] subjects = Subject.values();
        for (int i = 0; i< subjects.length; i++) {
            System.out.printf("%d. %s", i+1, subjects[i].name());
        }
        int subjectChoice = scanner.nextInt();
        Subject subject = subjects[subjectChoice - 1];

        System.out.println("Wybierz wartosc oceny");
        Mark.Value[] values = Mark.Value.values();
        for(int i=0; i<values.length; i++){
            System.out.printf("%d. %s\n", i+1, values[i].name());
        }
        int valueChoice = scanner.nextInt();
        Mark.Value value = values[valueChoice - 1];

        Mark mark = new Mark(value, subject, teacher, student, LocalDateTime.now());
        student.getMarks().add(mark);
    }

    private static void handleStudentMenu() {
        System.out.println("1.Pokaz liste przedmiotow: ");
        System.out.println("2.Pokaz oceny z przedmiotow: ");
        System.out.println("3.Pokaz zdane egzaminy: ");
        System.out.println("4.Pokaz liste obecnosci: ");
        System.out.println("5. Wyloguj");

        int choice = scanner.nextInt();
        switch(choice){
            case 1: handleShowSubjects(); break;
            case 2: handleShowMarks(); break;
            case 3: handleShowPassExam(); break;
            case 4: handleShowListPresent(); break;
            case 5: logout();
            default: System.out.println("Blad - niepoprawny wybor");
        }
    }

    private static void logout() {
        student = null;
        teacher = null;
        menu = Menu.MAIN;
    }

    private static void handleShowListPresent() {

    }

    private static void handleShowPassExam() {
    }

    private static void handleShowSubjects() {
        Subject[] values = Subject.values();
        for(int i=0; i<values.length;i++){
            System.out.println(values[i]);
        }
    }

    private static void handleShowMarks() {
        for (Mark mark : student.getMarks()) {
            Teacher teacher = mark.getTeacher();
            System.out.printf("Nauczyciel: %s %s\n" , teacher.getName(), teacher.getSurname());
            System.out.printf("Wystawiona cena: %f\n", mark.getMarkValue().getValue());
            System.out.printf("Ocena z przedmiotu: %s\n ", mark.getSubject().name());
            System.out.printf("Kiedy wystawiono ocene %s\n\n", mark.getDateTime());
        }
    }

    private static void exit() {
        System.exit(0);
    }
}
