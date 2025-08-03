import java.util.Scanner;
import banking.bankingClass;

public class Appsecb {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                bankingClass bc = new bankingClass();
                
                int attempts = 0;
                boolean accountVerified = false;

                while(attempts < 3 && !accountVerified) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    
                    if(accountNo == bc.setAccount()) {
                        accountVerified = true;

                        
                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();

                        if(bc.verifyAccount(accountNo, pin)) {
                            System.out.println("LOGIN SUCCESS!");
                        } else {
                            System.out.println("WRONG PIN! Access Denied.");
                        }

                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! Attempts left: " + (3 - attempts));
                        
                        if(attempts == 3) {
                            System.out.println("Too many failed attempts. System will exit.");
                            System.exit(0);
                        }
                    }
                }
                break;

            case 2:
              
                break;

            case 3:
                
                break;

            default:
                System.out.println("Invalid Selection!");
        }

        sc.close();
    }
}

