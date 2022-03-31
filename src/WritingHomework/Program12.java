package WritingHomework;

import java.util.Scanner;
//character is alphabet or character
public class Program12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any Character:");
        char ch=scanner.next().charAt(0);
        Program12 inputvalue=new Program12();
        inputvalue.checkInputeIsAlphabetNumberOrSymbol(ch);
        scanner.close();
    }

    public void checkInputeIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "is a DIGIT.");
        } else {
            System.out.println(ch + "is a SYMBOL");
        }
    }
}
