package corejava3.controlStments;

public class Switchcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float currency = 1;
		int country_code = 1;
		
		switch(country_code){
		
			case 1:
				
				float dollar_rate_in_INR = 82.83f;
				System.out.println(currency + " Dollars in INR = " + dollar_rate_in_INR * currency);
				break;
			
			case 2:
				
				float euro_rate_in_INR = 90.92f;
				System.out.println(currency + " Euros in INR = " + euro_rate_in_INR * currency);
				break;
			
			case 3:
				
				float pound_rate_in_INR = 105.713f;
				System.out.println(currency + " Bitish Pound in INR = " + pound_rate_in_INR * currency);
				break;
				
			default:
				System.out.println("Check country code");
		}
	}

}
