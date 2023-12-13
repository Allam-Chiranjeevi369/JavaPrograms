package corejava3.controlStments;

import java.util.Scanner;

public class ForLoop5 {

	public static void main(String[] args) {// stack memory step 1
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("No. of roties : ");
		int noOfRoties = scan.nextInt(); // 2nd
		
		for(int i = 1 ; i <= noOfRoties ; i++) {
			
			System.out.println("Picked ball from plate ");
			System.out.println("Rolled roti");
			System.out.println("Baked roti");
			System.out.println("--------------------------" + i);
			
		}
		
	}

}
