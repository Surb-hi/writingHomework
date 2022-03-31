package WritingHomework;

import java.util.Scanner;

//Inpute number old or even
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number:");
        int number=scanner.nextInt();
        isItoddorEvenNumber(number);
        scanner.close();

    }
    public static void isItoddorEvenNumber(int number){
        String evenOrOdd=(number%2==0)? "Even" : "Odd";
        System.out.println("The " +number+ " Is " +evenOrOdd+ " number");
    }
}
