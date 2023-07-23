package week7.console;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        while (true) {
            try {
                System.out.println("Choose option 1 to add student info or 2 for result: ");
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();

                switch (option) {
                    case 1:
                        AddStudent add = new AddStudent();
                        studentList = add.addStudent();
                        break;
                    case 2:
                        FetchStudentData data = new FetchStudentData();
                        data.studentData(studentList);
                        break;
                    default:
                        System.out.println("Wrong input.Please choose 1 or 2: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.Please choose 1or 2:");
            }
        }
    }
}
