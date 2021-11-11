/*
 * OSSE Praktikum 5
 * @author Joshua Gramlich
 * @version 1.0
 */


import java.util.Scanner;

public class Haupt {
	/*
	 * Main class
	 */
    public static void main(String[] args){
    	/*
    	 * Gets line input from console
    	 * prints input in uppercase
    	 */
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.toUpperCase();
        System.out.println(input);
    }
}
