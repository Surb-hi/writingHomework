package WritingHomework;

import java.util.Scanner;
//Calculate Sales amount
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller Name:");
        String name = scanner.next();
        System.out.println("Enter Seller ID:");
        int sellerId = scanner.nextInt();
        System.out.println("Enter Sales Amount:");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        int basicSalary = scanner.nextInt();

        Program7 salesCommission = new Program7();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller's name is :" + name);
        System.out.println("Seller's id is :" + sellerId);
        System.out.println("Seller's sales amount is :" + salesAmount);
        System.out.println("Seller's basic salary is :" + basicSalary);
        System.out.println("Seller's gross salary is:" + grossSalary);
        scanner.close();
    }


    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }
}