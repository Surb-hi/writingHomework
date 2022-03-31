package WritingHomework;

import java.util.Scanner;
//Marksheet
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter Student name:");
        String name = scanner.next();
        System.out.println("Enter student Roll number");
        int rollnum = scanner.nextInt();
        System.out.println("Enter Marks of subject Maths:");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid inpute Marks should between 0 to 100");
            System.out.println("\nPlease enter corretmarks:");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science\t:\t");
        int scienceMarks = scanner.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid inpute marks should between o to 100");
            System.out.println("\nPlease enter correct Marks\t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter marks of subject English\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid input marks should between 0 to 100");
            System.out.println("\nPlease enter correct marks\t\t:\t");
            englishMarks = scanner.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printtheMarkSheet(String.valueOf(name), rollnum, mathsMarks, scienceMarks, englishMarks,total, percentage, result, grade);
        scanner.close();
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "pass";
        }
    }

    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "_";
        }return grade;
    }
    public static void printtheMarkSheet(String name,int rollnum,int mathsMarks,int scincesMarks,int englishMarks,double total,double percentage, String result,
                                         String grade){
        System.out.println("|-----------------------------------_|");
        System.out.println("|                                    |");
        System.out.println("|          |Mark sheet|              |");
        System.out.println("|____________________________________|");
        System.out.println("|        Name:"  +name+"                  |");
        System.out.println("|        Roll No:"+rollnum+"              |");
        System.out.println("|_____________________________________|");
        System.out.println("|        Subjects: Marks              |");
        System.out.println("|________________________________________|");
        System.out.println("|        Math:"+mathsMarks+"                    |");
        System.out.println("|       Science:"+scincesMarks+"                 |");
        System.out.println("|       English:" +englishMarks+"                |");
        System.out.println("|        Total:"+total+"                         |");
        System.out.println("|      Percentage:|"+percentage+"                |");
        System.out.println("|           Result:"+result+"                    |");
        System.out.println("|             Grade:"+grade+"                    |");
        System.out.println("|_______________________________________________|");
    }
}