import java.util.Scanner;

public class Calculator {

    public void Calculator() {

    }

    public int add(int num1, int num2) {
        return (num1 + num2);
    }

    public int subtract(int num1, int num2) {
        return (num1 - num2);
    }

    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    public int divide(int num1, int num2) {
        return (num1 / num2);
    }

    public int modulo(int num1, int num2) {
        return (num1 % num2);
    }
    public double power(int num1, int num2) {
        return (Math.pow(num1,num2));
    }
    public static void main(String[] args) {

        int num1, num2;

        Calculator myCalculator = new Calculator();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        System.out.println("Addition of " + num1 + " & " + num2 + " = " + myCalculator.add(num1, num2));
        System.out.println("Subtraction of " + num1 + " & " + num2 + " = " + myCalculator.subtract(num1, num2));
        System.out.println("Multiplication of " + num1 + " & " + num2 + " = " + myCalculator.multiply(num1, num2));
        System.out.println("Divison of " + num1 + " & " + num2 + " = " + myCalculator.divide(num1, num2));
        System.out.println("Modulo of " + num1 + " & " + num2 + " = " + myCalculator.modulo(num1, num2));
        System.out.println("power of " + num1 + "^" + num2 + " = " + myCalculator.power(num1, num2));

        input.close();
    }
}
