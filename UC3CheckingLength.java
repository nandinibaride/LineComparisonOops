	package linecomparisonoops.com;
	
	import java.util.*;
	
	public class UC3CheckingLength {
		/*
		 * @purpose: To calculate length using formula
		 * @return: double data type
		 */
		
		static double calculateLength() {
			
			Scanner sc= new Scanner(System.in);     
			System.out.print("Enter x1  ");  
			int x1 = sc.nextInt();  
			System.out.print("Enter y1 ");  
			int y1 = sc.nextInt();  
			System.out.print("Enter x2 ");  
			int x2 = sc.nextInt();  
			System.out.print("Enter y2 ");  
			int y2 = sc.nextInt();
			
			double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			
			return length;
		}
		/*
		 * @purpose: To check this length will be equal , grater,less
		 * @return: No return value
		 */
		static void Is_equal()
		{
			double lengthOfLine1 = calculateLength ();
			double lengthOfLine2 = calculateLength ();
			if (lengthOfLine1 == lengthOfLine2 ) 
			    System.out.println("Two lines are equal");
			else if (lengthOfLine1 < lengthOfLine2) 
				System.out.println("Length of line one is less than second line");
			else if (lengthOfLine1 > lengthOfLine2) 
				System.out.println("Length of line one is grater than second line");
				
			 else 
				System.out.println("Two lines are not equal");
			}
		
		    public static void main(String args[]) {
		    	UC3CheckingLength length = new UC3CheckingLength ();
		    	length.calculateLength();
			     Is_equal ();
			}
	}
	
	
	
