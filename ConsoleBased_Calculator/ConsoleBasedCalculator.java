import java.util.Scanner;

public class ConsoleBasedCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");

            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Percentage");

            System.out.println("6. Factorial");
            System.out.println("7. Square");

            System.out.println("8. Cube");
            System.out.println("9. Square Root");
            System.out.println("10. a Power b");

            System.out.println("11. a Root b");

            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();

                    break;
                case 3:
                    multiplication();
                    break;
                case 4:

                    division();
                    break;
                case 5:
                    percentage();

                    break;
                case 6:

                    factorial();
                    break;
                case 7:
                    square();
                    break;
                case 8:

                    cube();
                    break;
                case 9:
                    squareRoot();
                    break;
                case 10:
                    power();
                    break;
                case 11:

                    root();
                    break;
                case 12:
                    System.out.println("Exiting program. Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.print("\nDo you want to continue? (y/n): ");
        } while (input.next().equals("y"));
        System.out.println("Exiting program. Bye!");
    }

    public static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    public static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");


        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    public static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");

        double num2 = input.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    public static void division() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");

        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
    }


    public static void percentage() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total value: ");
        double total = input.nextDouble();
        System.out.print("Enter the percentage: ");
        double percent = input.nextDouble();


        double result = (percent / 100) * total;
        System.out.println("Result: " + result);
    }
    
    public static void factorial() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative integers.");
        } else {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("Result: " + result);
        }
    }
    
    public static void square() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");


        double num = input.nextDouble();
        double result = num * num;
        System.out.println("Result: " + result);
    }
    
    public static void cube() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");


        double num = input.nextDouble();
        double result = num * num * num;
        System.out.println("Result: " + result);
    }
    

    public static void squareRoot() {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a positive number: ");
        double num = input.nextDouble();
        if (num < 0) {
            System.out.println("Square root is not defined for negative numbers.");
        } else {
            double result = Math.sqrt(num);
            System.out.println("Result: " + result);
        }
    }
    
    public static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = input.nextDouble();


        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();


        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
    
    public static void root() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (a < 0 && b % 2 == 0) {
            System.out.println("a must be a non-negative number when b is even.");
        } else {
            double result = Math.pow(a, 1.0 / b);
            System.out.println("Result: " + result);
        }
    }
}