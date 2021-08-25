package linecomparisonoops.com;

import java.util.*;

public class UC1CalculateLength {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
   
	public UC1CalculateLength(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	/*
	 *@purpose: To calculate length of two line using formula
	 *@return : No return type 
	 */
	public void calculateLength() {	
		double calculatelength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("length is " + calculatelength);
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1:");
		int x1Value = sc.nextInt();
		System.out.print("Enter x2:");
		int x2Value = sc.nextInt();
		System.out.print("Enter y1:");
		int y1Value = sc.nextInt();
		System.out.print("Enter y2: ");
		int y2Value = sc.nextInt();
		
		UC1CalculateLength length = new UC1CalculateLength(x1Value, x2Value, y1Value, y2Value);
		length.calculateLength();
		
		sc.close();
	}
}


