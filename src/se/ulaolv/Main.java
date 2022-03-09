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
            if(choose == '-'){
                subtraction();
            }
            if(choose == '*'){
                multiplication();
            }
            if(choose == '/'){
                division();
            }
            if(choose == 'P'){
                powerOf();
            }



        }while(on);

    }
    private static void powerOf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a base: ");
        double base = scanner.nextDouble();
        System.out.println("Enter an exponent: ");
        double exponent = scanner.nextDouble();

        double answer = Math.pow(base, exponent);
        System.out.println("The " + exponent + " power of " + base + " is: " + answer);
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
    private static void subtraction() {
        Scanner scanner = new Scanner(System.in);
        double answer = 0;
        char c;
        boolean ok = true;

        System.out.println("Enter a number: ");
        answer += scanner.nextDouble();
        System.out.println("One more please: ");
        answer -= scanner.nextDouble();

        do{
            System.out.println("Do you want to subtract another number? ( y / n ): ");
            c = scanner.next().charAt(0);

            if(c == 'y'|| c == 'Y'){
                System.out.println("One more number please: ");
                answer -= scanner.nextDouble();
            }
            else if(c == 'n' || c == 'N'){
                break;
            }
        }while(ok);

        System.out.println("The answer is: " + answer);
    }
    private static void multiplication() {
        Scanner scanner = new Scanner(System.in);
        double answer = 0;
        char c;
        boolean ok = true;

        System.out.println("Enter a number: ");
        answer += scanner.nextDouble();
        System.out.println("One more please: ");
        answer *= scanner.nextDouble();

        do{
            System.out.println("Do you want to multiply another number? ( y / n ): ");
            c = scanner.next().charAt(0);

            if(c == 'y'|| c == 'Y'){
                System.out.println("One more number please: ");
                answer *= scanner.nextDouble();
            }
            else if(c == 'n' || c == 'N'){
                break;
            }
        }while(ok);

        System.out.println("The answer is: " + answer);
    }

    private static void division() {
        Scanner scanner = new Scanner(System.in);
        double answer = 0;
        double nominator = 0;
        double denominator = 0;
        char c;
        boolean ok = true;

        System.out.println("Enter a numerator: ");
        nominator = scanner.nextDouble();
        System.out.println("And a denominator: ");
        denominator = scanner.nextDouble();

        if(denominator == 0){
            System.out.println("You can't divide by zero, try another number: ");
        }
        else{
            answer = nominator/denominator;
        }


        do{
            System.out.println("Do you want to continue dividing? ( y / n ): ");
            c = scanner.next().charAt(0);

            if(c == 'y'|| c == 'Y'){
                System.out.println("Divide by: ");
                denominator = scanner.nextDouble();
                if(denominator == 0){
                    System.out.println("You can't divide by zero, try another number: ");
                }
                else{
                    answer /= denominator;
                }
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
        System.out.println("***                 MODULO (%)              ***");
        System.out.println("***                POWER OF (P)             ***");
        System.out.println("***              SQUARE ROOT (S)            ***");
        System.out.println("***                DIVISION (/)             ***");


        System.out.println("***********************************************");
    }

}
