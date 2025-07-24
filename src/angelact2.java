import java.util.Scanner;

public class angelact2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number;
            
            
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            checkNumber(number);
            
            
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            checkNumber(number);
            
            
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            checkNumber(number);
        }
    }

    private static void checkNumber(int num) {
        if (num == 0) {
            System.out.println("Inputted number is Zero");
        } else if (num % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
    }
}

