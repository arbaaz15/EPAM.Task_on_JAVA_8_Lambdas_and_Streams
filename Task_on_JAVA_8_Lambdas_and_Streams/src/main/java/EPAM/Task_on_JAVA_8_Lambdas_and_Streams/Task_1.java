package EPAM.Task_on_JAVA_8_Lambdas_and_Streams;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
		  @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		  ArrayList<Double> numberlist = new ArrayList<>();
		  
		  System.out.println("Enter the size of array");
		  int n =  sc.nextInt();
		  
		  System.out.println("Enter the Numbers");
		  for(int i=0; i<n; i++)
		  {
			  numberlist.add(sc.nextDouble());
		  }
		  
		    Double average = numberlist.stream().mapToDouble(val -> val).average().orElse(0.0);
		    
		    System.out.println("Average : " + average);
	}

}
