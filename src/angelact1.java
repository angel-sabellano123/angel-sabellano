import java.util.Scanner;

public class angelact1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter marks in Science: ");
            int scienceMarks = scanner.nextInt();
            
            System.out.print("Enter marks in History: ");
            int historyMarks = scanner.nextInt();
            
            System.out.print("Enter marks in Math: ");
            int mathMarks = scanner.nextInt();
            
            System.out.print("Enter marks in Soc: ");
            int socMarks = scanner.nextInt();
            
            System.out.print("Enter marks in Arts: ");
            int artsMarks = scanner.nextInt();
            
            
            int totalMarks = scienceMarks + historyMarks + mathMarks + socMarks + artsMarks;
            double percentage = (double) totalMarks / 5;
            
            
            String remarks;
            String message;
            
            if (percentage < 70) {
                remarks = "Fail";
                message = "Try Again";
            } else if (percentage <= 75) {
                remarks = "Poor";
                message = "Try Again";
            } else if (percentage <= 80) {
                remarks = "Fair";
                message = "Congrats " + name + ", you Passed.";
            } else if (percentage <= 85) {
                remarks = "Good";
                message = "Congrats " + name + ", you Passed.";
            } else if (percentage <= 90) {
                remarks = "Very Good";
                message = "Congrats " + name + ", you Passed.";
            } else {
                remarks = "Excellent";
                message = "Congrats " + name + ", you Passed.";
            }
            
            
            System.out.println("\nTotal Marks: " + totalMarks);
            System.out.printf("Total percentage: %.2f\n", percentage);
            System.out.println("Remarks: " + remarks);
            System.out.println(message);
        }
    }
}
