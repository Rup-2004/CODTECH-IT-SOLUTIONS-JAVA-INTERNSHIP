// Create a Java program that acts as a basic calculator. It should prompt the user to
// enter two numbers and choose an operation (addition, subtraction, multiplication,
// division). Then, it should perform the selected operation and display the result to the
// user.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        char continueLoop='y';
        do{
        System.out.println();
        System.out.print("first_oparand=");
        double first_oparand=scanner.nextDouble();
        System.out.print("second_oparand=");
        double second_oparand=scanner.nextDouble();
        System.out.println("The operations to be performed=");
        System.out.println("1) addition");
        System.out.println("2) subtraction");
        System.out.println("3) multiplication");
        System.out.println("4) division");
        System.out.println("5) exit");
        System.out.println();
        System.out.print("choice=");
        int choice=scanner.nextInt();
        System.out.println();
        switch(choice){
            case 1:
                System.out.println("addition result="+(first_oparand+second_oparand));
                continueLoop='y';
                break;
            case 2:
                System.out.println("subtraction result(first_oparand-second_oparand)="+(first_oparand-second_oparand));
                System.out.println("subtraction result(second_oparand-first_oparand)="+(second_oparand-first_oparand));
                continueLoop='y';
                break;
            case 3:
                System.out.println("multiplication result="+(first_oparand*second_oparand));
                continueLoop='y';
                break;
            case 4:
                System.out.println("division result(first_oparand/second_oparand)="+(first_oparand/second_oparand));
                System.out.println("division result(second_oparand/first_oparand)="+(second_oparand/first_oparand));
                continueLoop='y';
                break; 
            case 5:
                System.out.println("you have exited successfully.");
                continueLoop='n';
                break;
            default: 
                System.out.println("you have given wrong choice,retry...");
                continueLoop='y';  
        }

        }while(continueLoop=='y');
    }
}
