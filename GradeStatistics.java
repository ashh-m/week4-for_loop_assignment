import java.util.Scanner; 

public class GradeStatistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int numGrades = 10;
        
        double[] grades = new double[numGrades];

        double totalSum = 0.0;

        System.out.println("Please enter 10 floating-point grades:");

        for (int i = 0; i < numGrades; i++) {

            while (true) {
                System.out.print("Enter grade #" + (i + 1) + ": ");
                String input = scanner.nextLine();
                
                try{ 

                    double grade = Double.parseDouble(input);

                    grades[i] = grade;

                    totalSum += grade;

                    break;
                    
                } catch (NumberFormatException e) {

                    System.out.println("Invalid input. Please enter a valid floating-point number:");
                }
            }
        }

        scanner.close();


        double maximum = grades[0];
        double minimum = grades[0];

        for (int i = 1; i < numGrades; i++) {
            if (grades[i] > maximum) {
                maximum = grades[i];
            }
            if (grades[i] < minimum) {
                minimum = grades[i];
            }
        }

        double average = totalSum / numGrades;
        
        System.out.println("\n" + "==========================");
        System.out.println("--- Grade Statistics ---");        
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Maximum: " +  maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("==========================");
    }
}

