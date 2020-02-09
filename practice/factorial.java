package practice;

import java.util.Scanner;

public class factorial {
 
		 public static void main(String args[]){  
		  int i,fact=1;  
		  Scanner scanner=new Scanner(System.in);
	        int number=scanner.nextInt();
		//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
		}

