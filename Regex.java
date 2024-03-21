import java.util.regex.Pattern;
import java.util.Scanner;
//Write a Java program to check whether a string contains 
//only a certain set of characters (in this case a-z, A-Z and 0-9).
public class Regex {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name:");
	String name = scan.next();
	
//	
//	// single character which is y or n

	//boolean result = Pattern.matches("[yn]", ch);
	//System.out.println(result);
	
	// single character in the range a-z or A-Z
	System.out.println(Pattern.matches("[a-zA-Z]+",name));
	System.out.println(Pattern.matches("[A-Z]{5}\\d{4}[A-Z]+",name));
	System.out.println(Pattern.matches("[a-zA-Z0-9]+",name));
	}

}
