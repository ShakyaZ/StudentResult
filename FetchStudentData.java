package week7.console;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class FetchStudentData{
     void studentData(List<Student> studentList) {
        try {
            System.out.println("Enter symbol no:");
            Scanner sno = new Scanner(System.in);
            int sn = sno.nextInt();
            boolean check = false;
            for (Student student : studentList) {
                if (sn == student.getSymbolNo()) {
                    check =true;
                    student.studentInfo();
                    break;
                }
            }
            if(!check){
                System.out.println("student not found");
            }
        }
        catch (InputMismatchException e) {
            System.out.println("enter a valid symbol no: ");
        }
    }
}
