package EPAM.Task_on_JAVA_8_Lambdas_and_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_2 {

	public static void main(String[] args) {
		
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
		  ArrayList<String> list = new ArrayList<>();
		  
	      List<String> filtered = new ArrayList<>();
		  
		  System.out.println("Enter the size of array");
		  int n =  sc.nextInt();
		  
		  System.out.println("Enter the values");
		  
		  for(int i=0; i<=n; i++)
		  {
			  list.add(sc.nextLine());
		  }
			
		  
		  filtered = list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		  
		  
		System.out.println("The Strings whose size is equals to 3 and starts with 'a' are: ");
		for(String s: filtered)
		{
			 System.out.println(s);
		}
		
		
		
	
	}
}
