package sample1;

import java.util.function.BinaryOperator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryOperator<String> longestString = (s1, s2) -> 
         (s1.length() >= s2.length()) ? s1 : s2;

 System.out.println(longestString.apply("Beatiful", "flowers")); 
}
}
	


