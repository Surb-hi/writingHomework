package WritingHomework;

import java.util.Scanner;
//Old even number
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int number=scanner.nextInt();
        Program6 OddEven=new Program6();
        System.out.println(number + " is "+ OddEven.isItEvenOddNumber(number));
        scanner.close();
    }
    public String isItEvenOddNumber(int number){
        if(number%2==0){
            return "Even";
        }else {
            return "odd";
        }
    }
}
