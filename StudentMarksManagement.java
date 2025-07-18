import java.util.Scanner;

public class StudentMarksManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] studentNames = new String[n];
        int[] studentMarks = new int[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();

            System.out.print("Enter marks of " + studentNames[i] + ": ");
            studentMarks[i] = sc.nextInt();
        }
        System.out.println("\n----- Student Records -----");
        int total = 0;
        for (int i = 0; i < n; i++) {
            String grade = getGrade(studentMarks[i]);
            total += studentMarks[i];
            System.out.println((i + 1) + ". " + studentNames[i] +
                               " - Marks: " + studentMarks[i] +
                               ", Grade: " + grade);
        }

        double average = (double) total / n;
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
}
