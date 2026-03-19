
import java.util.Scanner;

class Calculator{

     static int add(int a , int b){
        return a + b;
    }

    static int subtract(int a , int b){
        return a - b;
    }

    static int multiply(int a , int b){
        return a * b;
    }

    static int divide(int a , int b){
        return a / b;
    }

}

public class Simple_calc{
    public static void main(String args[])  {

        Scanner sc = new Scanner(System.in);
        
            System.out.println("===Calculator===");
            System.out.println("Which Operation Do you want to Perform?");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Divison");
            System.out.println("5.Exit");
            System.out.println();

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Values for Addition: ");

                    int sum = Calculator.add(sc.nextInt(), sc.nextInt());
                    System.out.println("Addition : " + sum);

                }
                case 2 -> {
                    System.out.println("Enter Values for Subtraction: ");
                    int subtract = Calculator.subtract(sc.nextInt(), sc.nextInt());
                    System.out.println("Subtraction : " + subtract);
                    break;
                }

                case 3 -> {
                    System.out.println("Enter Values for Multiplication: ");

                    int multiply = Calculator.multiply(sc.nextInt(), sc.nextInt());
                    System.out.println("Product : " + multiply);
                    break;
                }

                case 4 -> {
                    System.out.println("Enter Values for Division: ");

                    double Division = Calculator.divide(sc.nextInt(), sc.nextInt());
                    System.out.println("Addtion : " + Division);
                    break;
                }

                default -> System.out.println("Invalid Choice.");

            }
        sc.close();
    }
}