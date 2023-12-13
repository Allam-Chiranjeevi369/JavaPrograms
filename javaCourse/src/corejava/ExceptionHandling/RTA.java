package corejava.ExceptionHandling;

public class RTA {
	
	void appD1(int age)throws DrivingLicenceException{
		
		if(age < 18){
			
			throw new DrivingLicenceException("Invalid age");
			
		}
		
	}

	public static void main(String[] args) {
		
		RTA rta = new RTA();
		try {
			
			rta.appD1(16);
			
		}
		catch(DrivingLicenceException d1) {
			
			String message = d1.getMessage();
			System.out.println(message);
			
		}
	}

}
