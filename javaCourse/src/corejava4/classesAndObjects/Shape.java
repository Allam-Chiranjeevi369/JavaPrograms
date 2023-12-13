package corejava4.classesAndObjects;

public class Shape {

		
	int dimension1, dimension2;
		
	void area2D(){//Non-Parameterized function.
			
		dimension1 = 10;// hard coded values.
		dimension2 = 20;
		int area = dimension1*dimension2;
		System.out.println("Area : " + area);
			
	}
	
	void area(int dim1, int dim2){//Parameterized function.
		
		dimension1 = dim1;
		dimension2 = dim2;
		int area = dimension1*dimension2;
		System.out.println("Area : " + area);
			
	}
	
	public static void main(String[] args){
		
		Shape rectangleShape = new Shape();
		rectangleShape.area2D();// No arguments
		
		rectangleShape.area(30, 40);// Arguments(30,40) are being passed.
		
	}
		

}
