package JavaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class runner{
   public static void main(String[] args) {
        //boolean passed = isPassed();

        Scanner scanner = new Scanner(System.in);
        Student students[] = new Student[3];
        System.out.println("Enter students information");
        for (int studentNumber = 0; studentNumber < 3; studentNumber++) {

            System.out.println("Enter student name");
            String studentName = scanner.next();

            System.out.println("Enter id");
            int id = scanner.nextInt();

            System.out.println("Enter grade1");
            double grade1 = scanner.nextDouble();

            System.out.println("Enter grade2");
            double grade2 = scanner.nextDouble();

            System.out.println("Enter grade3");
            double grade3 = scanner.nextDouble();

            students[studentNumber] = new Student(studentName, id, grade1, grade2, grade3, 0);
            students[studentNumber].calculateAverage();
            System.out.println("  *************  ");

        } scanner.close();
        for (int studentNumber = 0; studentNumber < 3; studentNumber++) {
            students[studentNumber].displayInfo();
        }
    }
}
