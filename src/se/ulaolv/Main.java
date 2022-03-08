package se.ulaolv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean on = true;

        do{
            Scanner scanner = new Scanner(System.in);
            char choose;
            menu();
            System.out.println("Specify the type of calculation: ");
            choose = scanner.next().charAt(0);

            if(choose == '+'){
                addition();
            }


        }while(on);

    }

    private static void addition() {
        Scanner scanner = new Scanner(System.in);
        double answer = 0;
        char c;
        boolean ok = true;

        System.out.println("Enter a number: ");
        answer += scanner.nextDouble();
        System.out.println("One more please: ");
        answer += scanner.nextDouble();

        do{
            System.out.println("Do you want to add another number? ( y / n ): ");
            c = scanner.next().charAt(0);

            if(c == 'y'|| c == 'Y'){
                System.out.println("Add another number please: ");
                answer += scanner.nextDouble();
            }
            else if(c == 'n' || c == 'N'){
                break;
            }
        }while(ok);

        System.out.println("The answer is: " + answer);
    }

    private static void menu() {
        System.out.println("******           OLAS CALCULUS           ******");
        System.out.println("***               ADDITION (+)              ***");
        System.out.println("***              SUBTRACTION (-)            ***");
        System.out.println("***             MULTIPLICATION (*)          ***");
        System.out.println("***                DIVISION (/)             ***");
        System.out.println("***********************************************");
    }

}
