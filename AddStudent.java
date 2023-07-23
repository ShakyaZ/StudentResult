package week7.console;

import java.util.*;

public class AddStudent {
    static List<Student> students = new ArrayList<>();
    static HighestMarks highestMarks = new HighestMarks();
    List<Subject> subjects = new ArrayList<>();
    static int count = 0;
    List<Student> addStudent() {
        try {
            Scanner studentScan = new Scanner(System.in);
            System.out.println("Adding student");
            System.out.print("Name of student: ");
            String studentName = studentScan.nextLine();
            System.out.print("Address of student: ");
            String studentAddress = studentScan.nextLine();
            System.out.print("symbol no. of student: ");
            int studentNo = studentScan.nextInt();
            for (Student student : students) {
                if (studentNo == student.getSymbolNo()) {
                    System.out.println("Same symbol no. exists");
                    return students;
                }
            }
            Scanner subjectScan = new Scanner(System.in);
            System.out.print("Marks obtained in Math: ");
            int math = subjectScan.nextInt();
            System.out.print("Marks obtained in science: ");
            int science = subjectScan.nextInt();
            System.out.print("Marks obtained in nepali: ");
            int nepali = subjectScan.nextInt();
            if (math > 100 || science > 100 || nepali > 100) {
                System.out.println("Invalid marks.");
                return students;
            }
            Subject subject = new Subject();
            subject.setMathMarks(math);
            subject.setScienceMarks(science);
            subject.setNepaliMarks(nepali);
            float percentage = (float) ((subject.getMathMarks() + subject.getScienceMarks() + subject.getNepaliMarks()) * 100) / 300;
        if (percentage >= 80) {
            subject.division = "distinction";
        } else if (percentage >= 60) {
            subject.division = "first div";
        } else if (percentage >= 45) {
            subject.division = "second div";
        } else {
            subject.division = "Fail!!";
        }
//            float percentage = calcPercent(subject);
//            subject.setPercentage(percentage);
            if (count == 0) {
                highestMarks.nepaliHigh = nepali;
                highestMarks.mathHigh = math;
                highestMarks.scienceHigh = science;
                count++;
            }
            if (math >= 40 && science >= 40 && nepali >= 40) {
                subject.result = "Passed";
            } else {
                subject.result = "Failed!";
            }
            if (math > highestMarks.mathHigh) {
                highestMarks.mathHigh = math;
            }
            if (nepali > highestMarks.nepaliHigh) {
                highestMarks.nepaliHigh = nepali;
            }
            if (science > highestMarks.scienceHigh) {
                highestMarks.scienceHigh = science;
            }
            subject.setHighestMarksList(highestMarks);
            subjects.add(subject);
            Student student = new Student();
            student.setName(studentName);
            student.setAddress(studentAddress);
            student.setSymbolNo(studentNo);
            student.setSubjects(subjects);
            student.setPercentage(percentage);
            students.add(student);
            System.out.println("Student Added Successfully");

            Collections.sort(students);
            for (int i=0; i<students.size(); i++){
                Student s = students.get(i);
                s.setRank(i+1);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Try again...");
        }
        return students;
    }

//    float calcPercent(Subject subject) {
//        float percentage = (float) ((subject.getMathMarks() + subject.getScienceMarks() + subject.getNepaliMarks()) * 100) / 300;
//        subject.setPercentage(percentage);
//        if (percentage >= 80) {
//            subject.division = "distinction";
//        } else if (percentage >= 60) {
//            subject.division = "first div";
//        } else if (percentage >= 45) {
//            subject.division = "second div";
//        } else {
//            subject.division = "Fail!!";
//        }
//        return percentage;
//    }
}
