import java.util.Scanner;

public class StudentGrade {
    static Scanner input = new Scanner(System.in); 
    
    public static String getUserName() {
        System.out.print("Enter student name: ");
        return input.nextLine();
    }

    public static String getStudentSubject() {
        System.out.println("Enter student subject: ");
        return input.nextLine();
    }

    public static String getStudentGradePerSubject(String subject) {
        System.out.print("Enter grade for " + subject + ": ");
        return input.nextLine();
    }

    public static int getTotal(String subject, int total) {
        System.out.print("Enter total score for " + subject + ": ");
        return input.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        int studentNumber = input.nextInt();
        input.nextLine(); 
        
        for (int i = 0; i < studentNumber; i++) {
            System.out.println("\nStudent " + (i + 1));
            String name = getUserName();
            String subject = getStudentSubject();
            String grade = getStudentGradePerSubject(subject);

	    int totalScore = getTotal(subject, 100);

            System.out.println("Student Name: " + name);
            System.out.println("Subject: " + subject);
            System.out.println("Grade: " + grade);
            System.out.println("Total Score: " + totalScore);
        }
    }
}