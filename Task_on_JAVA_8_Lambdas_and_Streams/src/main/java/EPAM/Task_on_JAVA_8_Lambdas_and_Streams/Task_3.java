package EPAM.Task_on_JAVA_8_Lambdas_and_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task_3 {
	
	
	  public static boolean isPalindrome(String originalString) {
		  
	        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
	 
	        return IntStream.range(0, tempString.length() / 2)
	            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));
	 
	    }
	
	
	
	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
		  ArrayList<String> list = new ArrayList<>();
		  
		  List<String> filtered = new ArrayList<>();
		  
		  System.out.println("Enter the size of array");
		  int n =  sc.nextInt();
		  
		  System.out.println("Enter the Strings");
		  
		  for(int i=0; i<=n; i++)
		  {
			  list.add(sc.nextLine());
		  }
			
		  
		  filtered = list.stream().filter(x -> isPalindrome(x)).collect(Collectors.toList());
		  
		 
		
			
		System.out.println("The Palindrome Strings are : ");
		
		for(String s: filtered)
		{
			 System.out.println(s);
		}
		
		
		
		
	}
}
