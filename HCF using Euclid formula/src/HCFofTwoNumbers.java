
public class HCFofTwoNumbers {
//This is a program to find HCF of 60 and 36 
	public static void main(String[] args) {
		
		//x and y are the numbers to find the HCF 
		int x = 60, y = 36, gcd = 1; //initialise two numbers x and y
		
		// we use for loop that runs from 1 to the smallest of both numbers
		for(int i = 1; i <= x && i <= y; i++)  //It executes until the condition returns true
		{  
			
		//returns true if both conditions are satisfied   
		if(x%i==0 && y%i==0)  //used if statement to test the condition
			
		//storing the value i in the variable gcd 
		gcd = i;  
		}  
		
		// now print the value of gcd 
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  //print the final result
		}  
		
	}


