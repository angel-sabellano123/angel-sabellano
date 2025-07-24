import java.util.Scanner;

public class angelact3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number1 = scanner.nextInt();
            checkNumber(number1);
            
            
            System.out.print("Enter a number: ");
            int number2 = scanner.nextInt();
            checkNumber(number2);
            
            
            System.out.print("Enter a number: ");
            int number3 = scanner.nextInt();
            checkNumber(number3);
        }
    }

    private static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println("Inputted number Zero");
        }
    }
}

