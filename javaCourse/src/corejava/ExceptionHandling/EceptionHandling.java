package corejava.ExceptionHandling;
import java.util.*;

public class EceptionHandling {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter property value : ");
		int value = sc.nextInt();
		
		System.out.print("Enter the shares : ");
		int share = sc.nextInt();
		
		int result = 0;
		
		try {
			
			result = value/share;
			
		}
		catch(Exception e) {
			
			
		}
		
		
		System.out.println("Result : " + (value/share));
	}

}
