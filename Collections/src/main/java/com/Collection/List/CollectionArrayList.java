package com.Collection.List;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		FOR ADDING THE ELEMENTS
		
		int a = 234;
		list.add(a);
		list.add(291);
		list.add(null);
		list.add(1);
		
		System.out.println(list);
		
//		FOR ADDING ELEMENTS AT SPECIFIED INDEX
		
		list.add(1, 90);
		
		System.out.println(list);
		
//		FOR KNOWING THE SIZE OF ARRAY
		
		int size = list.size();
		System.out.println(size);
		
//		FOR SETTING THE ELEMENT AT SPECIFIED INDEX(i.e., REPLACING PREVIOUS ELEMENT)
		
		list.set(2, 9);
		System.out.println(list);
		
//		FOR GETTING ELEMENTS FROM SPECIFED INDEX
		
		int elmnt = list.get(1);
		System.out.println(elmnt);
		
		// ELSE WE CAN ALSO DO : 
		
		for(int i = 0 ; i < list.size(); i++) {
			
			System.out.print(list.get(i));
			
		}
		
//		FOR DELETING THE ELEMENT FROM SPECIFIED INDEX
		
		list.remove(2);
		System.out.println(list);
		
//		FOR SORTING
		
		Collections.sort(list);
		System.out.println(list);
		
	}

}
