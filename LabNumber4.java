package LabNumber4;
import java.util.Scanner;

public class LabNumber4 {
	public static void main(String[] args) {
				
		String contin = "yes";
		
		
		while(contin.equalsIgnoreCase("yes")) {
			System.out.println("Enter an integer: ");
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();		
			
			System.out.printf("%15s %15s %15s", "Number", "Squared", "Cubed");
			System.out.println();
			System.out.printf("%15s %15s %15s", "======", "======", "======");
			System.out.println();
			
			
			for (int i = 1; i <= input; i++) { 
									
				int squared = i * i;
				int cubed = i * squared; 
			
				System.out.printf("%10s %15s %15s", i, squared, cubed);
				System.out.println();
			
			}
			
				
			
			
				System.out.println();
				System.out.println("Do you want to continue? (yes/no)");
			
			
			contin = sc.next();
			
									
		}
	}
}

		
			
			
			
		

		
								
	
		/*String heading1 = "Number";
		String heading2 = "Squared";
		String heading3 = "Cubed";
					
		System.out.println("");
		System.out.printf("%4d%4d%n",heading1,heading2);*/
		
