package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicates {

	public static void main(String[] args) {
String input = "PayPal India";
Set<Character> charset = new LinkedHashSet<Character>();

for (int i = 0; i < input.length(); i++) {

	//	System.out.println(input.charAt(i));
charset.add(input.charAt(i));
	}

//System.out.println(charset);

for (Character eachChar : charset) {
	if(eachChar!= ' ')
	System.out.println(eachChar);
	
}








	}

}
