package WritingHomework;

import java.util.Arrays;

//sort a numeric array and a string array
public class Program17 {
    public static void main(String[] args) {
        int[] numarray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        String[] strArray = {
                "Alpha", "Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numarray));
        Arrays.sort(numarray);
        System.out.println("Sorted Numerical Array is: " + Arrays.toString(numarray));
        System.out.println("");
        System.out.println("Actual String Array was: " + Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is: " + Arrays.toString(strArray));
    }

}


