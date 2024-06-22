import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeManager {
    private List<Grade> grades = new ArrayList<>();

    public void addGrade(Scanner scanner) {
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        System.out.print("Enter grade: ");
        double gradeValue = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        grades.add(new Grade(subject, gradeValue));
        System.out.println("Grade added successfully!");
    }

    public void calculateAndDisplayAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
            return;
        }

        double total = 0;
        for (Grade grade : grades) {
            total += grade.getValue();
        }

        double average = total / grades.size();
        String letterGrade = getLetterGrade(average);

        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Letter Grade: " + letterGrade);
    }

    public void displayGrades() {
        if (grades.isEmpty()) {
            System.out.println("No grades available.");
            return;
        }

        System.out.println("Grades:");
        for (Grade grade : grades) {
            System.out.println(grade);
        }
    }

    private String getLetterGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}
