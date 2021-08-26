		package linecomparisonoops.com;
		
		import java.util.*;
		
		public class UC2CheckEqualityOfLength {
			/*
			 * @purpose : To check equality of two lines.
			 * @return : double data type
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
			 * @purpose : To check lengthofline1 is equal to lengthofline2
			 * @return : No return type
			 */
		
			static void Is_equal()
			{
				double lengthOfLine1 = calculateLength ();
				double lengthOfLine2 = calculateLength ();
				if (lengthOfLine1 == lengthOfLine2 ) 
					System.out.println("Two lines are equal");
				else 
					System.out.println("Two lines are not equal");
				}
			
		      public static void main(String args[]) {
		    	  
				 UC2CheckEqualityOfLength length = new UC2CheckEqualityOfLength ();
					length.calculateLength();
		            Is_equal ();
		        }
		  }
		
		
