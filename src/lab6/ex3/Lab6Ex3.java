package lab6.ex3;

import java.util.*;


public class Lab6Ex3 {
	public static Map<Integer, Integer> getSquares (int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int num: array) {
			map.put(num, num*num);
		}
		return map;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Map<Integer, Integer> numSquares = getSquares(arr);
		System.out.println(numSquares);
	}
}
