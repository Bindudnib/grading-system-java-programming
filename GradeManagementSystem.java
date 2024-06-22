import java.util.Scanner;

public class GradeManagementSystem {
    public static void main(String[] args) {
        GradeManager gradeManager = new GradeManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Grade");
            System.out.println("2. Calculate Average");
            System.out.println("3. Display Grades");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    gradeManager.addGrade(scanner);
                    break;
                case 2:
                    gradeManager.calculateAndDisplayAverage();
                    break;
                case 3:
                    gradeManager.displayGrades();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
