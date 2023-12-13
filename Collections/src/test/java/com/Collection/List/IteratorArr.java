package com.Collection.List;

import java.util.Iterator;
import java.util.List;

public class IteratorArr extends ArrayListAdd{
	
	public static void main(String[] args){
		
		IteratorArr obj = new IteratorArr();
		obj.Adding();
		List<Integer> arr = obj.array;
		
		for(int i = 0 ; i <= (arr.size() - 1) ; i++) {
			
			System.out.println(arr.get(i));
			
		}
		
//		USING FOR EACH
		
		for(Integer e : arr) {
			
			System.out.print(e + " ");			
			
		}
		System.out.println("\n");
		
		Iterator<Integer> it = arr.iterator();
		
		while(it.hasNext()) {
			
			System.out.print(it.next() + " ");
			
		}
		
	}

}
