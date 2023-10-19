package lab6.ex1;

import java.util.*;

//Lab 6: Collection Framework

//Exercise 1: Create a method which accepts a hash map and 
// return the values of the map in sorted order as a List.

public class Lab6Ex1 {
	
	public List<Integer> getValues(HashMap<Integer, Integer> hashMap) {
		
		List<Integer> mapValues = new ArrayList<>(hashMap.values());
		Collections.sort(mapValues);
		return mapValues;
	}
	
	public static void main(String[] args) {
//		Lab6Ex1 obj = new Lab6Ex1();
//		obj.getValues(null);
		// Example usage
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(3, 29);
		hashMap.put(1, 15);
		hashMap.put(2, 6);
		hashMap.put(4, 47);
		
		System.out.println("Before sorting: " + hashMap.values());
		
		Lab6Ex1 obj = new Lab6Ex1();
		List<Integer> sortVal = obj.getValues(hashMap);
		
		// Print the sorted values
		System.out.println("After sorting: " + sortVal);
	}

}