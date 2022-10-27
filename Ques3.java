import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's marks (in %):");
        double marks = sc.nextDouble();
        if (marks >= 80) {
            System.out.println("Grade Letter: A\nGrade Point (GP): 5.0");
        } else if (marks >= 75) {
            System.out.println("Grade Letter: B+\nGrade Point (GP): 4.5");
        } else if (marks >= 70) {
            System.out.println("Grade Letter: B\nGrade Point (GP): 4.0");
        } else if (marks >= 65) {
            System.out.println("Grade Letter: C+\nGrade Point (GP): 3.5");
        } else if (marks >= 60) {
            System.out.println("Grade Letter: C\nGrade Point (GP): 3.0");
        } else if (marks >= 55) {
            System.out.println("Grade Letter: D+\nGrade Point (GP): 2.5");
        } else if (marks >= 50) {
            System.out.println("Grade Letter: D\nGrade Point (GP): 2.0");
        } else {
            System.out.println("Grade Letter: F\nGrade Point (GP): 0.0");
        }
    }
}
