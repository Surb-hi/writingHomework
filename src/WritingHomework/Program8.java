package WritingHomework;

import java.util.Scanner;
//PRINT CITY NAME A TO F;
public class Program8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F:");
        char city = scanner.next().charAt(0);
        Program8 cityName = new Program8();
        cityName.printCityName(city);
        scanner.close();
    }

    public void printCityName(char city) {
        if (city == 'A' || city == 'a') {
            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Edinburgh");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Feltham");
        } else {
            System.out.println("The alphabet you enter is not between A to F:");
        }
    }
}