package WritingHomework;

import java.util.Scanner;
//calculetion
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();

        System.out.println("Enter your EmployeeID:");
        int employeeId=scanner.nextInt();

        System.out.println("Enter Basic Salary:");
        double basicSalary=scanner.nextDouble();

        double hra= calculateHRA(basicSalary);
        double da= calculateDA(basicSalary);
        double ta= calculateTA(basicSalary);
        double pf= calculatePF(basicSalary);

        double grossSalary=basicSalary+hra+da+ta-pf;
        System.out.println("-----------------------------------------------------");
        System.out.println("|Salary slip|");
        System.out.println("|----------------------------------------------------|");
        System.out.println("|         Employee ID:"+employeeId+"                | ");
        System.out.println("|         Employee Name:"+name+"                    |  ");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|Basic Salary:"+basicSalary+"|");
        System.out.println("|HRA 10%:"+hra+"|");
        System.out.println("|TA 8%:"+ta+"|");
        System.out.println("|DA 9%:"+da+"|");
        System.out.println("|PF -20%:"+pf+"|");
        System.out.println("|------------------------------------------------------|");
        System.out.println("|Gross Salary :" +grossSalary+"|");
        System.out.println("|-------------------------------------------------------|");
        scanner.close();
    }
    public static double calculateHRA(double basicSalary){
        return (basicSalary*10)/100;
    }
    public static double calculateDA(double basicSalary){
        return (basicSalary*8)/100;
    }
    public static double calculateTA(double basicSalary){
        return (basicSalary*9)/100;
    }
    public static double calculatePF(double basicSalary){
        return (basicSalary*20)/100;
    }
}
