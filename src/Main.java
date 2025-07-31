import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = input.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Course: ");
        String course = input.nextLine();

        System.out.print("Enter Section: ");
        String section = input.nextLine();

        System.out.println("\n STUDENT INFORMATION ");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);


        System.out.print("\nEnter Midterm Exam Score (out of 100): ");
        int midterm = input.nextInt();

        System.out.print("Enter Final Exam Score (out of 100): ");
        int finalExam = input.nextInt();

        System.out.print("Enter Project Score (out of 100): ");
        int project = input.nextInt();

        System.out.print("Enter Attendance Percentage (out of 100): ");
        int attendance = input.nextInt();

        int totalScore = midterm + finalExam + project + attendance;
        double averageScore = totalScore / 400.0 * 100;

        System.out.println("\n SCORES ");
        System.out.println("Midterm Exam: " + midterm);
        System.out.println("Final Exam: " + finalExam);
        System.out.println("Project: " + project);
        System.out.println("Attendance: " + attendance);
        System.out.printf("Average Score: %.2f\n", averageScore);

        if (averageScore < 75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED ");
        }
    }
}
