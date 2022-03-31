package WritingHomework;

import java.util.Scanner;

//Calcutore
public class Program10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = scanner.nextInt();
        System.out.println("Enter the second number:");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol +,-,*,/");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        scanner.close();
    }

    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        }
        if (symbol == '*') {
            System.out.println(x + " * " + y + " = " + (x * y));
        }
        if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }
}