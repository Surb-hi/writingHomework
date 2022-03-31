package WritingHomework;

import java.util.Locale;
import java.util.Scanner;
//Alphabet A to F
public class Program9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a alphabet from A to F:");
        String city=scanner.next().toUpperCase(Locale.ROOT);
        Program9 alphabet=new Program9();
        alphabet.printcityName(city);
        scanner.close();
    }

    public void printcityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
