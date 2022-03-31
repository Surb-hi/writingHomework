package WritingHomework;

import java.util.Scanner;

//Find year is leap year or not
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter The Year:");
        int year=scanner.nextInt();
        Program2 leapyear=new Program2();
        leapyear.isItLeapYear(year);
        scanner.close();



    }
    public void isItLeapYear(int year){
        if(year%4==0 && year % 100 !=0 || year % 400==0){
            System.out.println("The year " + year + " is leap year.");
        }else{
            System.out.println("The year "+ year + "is not a leap year.");
        }
    }
}