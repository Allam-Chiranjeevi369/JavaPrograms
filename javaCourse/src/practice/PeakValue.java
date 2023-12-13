package practice;

public class PeakValue {

	public static void main(String[] args) {
		
	    int a[] = {0,2,3,6,5,3,1};
	    int size = 7;
	    
	    int start = 0, end = (size - 1);
	    while(start <= end){

	        int mid = start + (end - start)/2;
	        if((a[mid] < a[mid + 1]) && (0 < (mid + 1) << size)){

	            start = mid + 1;

	        }
	        else if((a[mid] > a[mid + 1]) && (0 < (mid + 1) << size)){

	            end = mid;

	        }

	    };
	    
		System.out.println(end);
		
	}

}
