package lab6.ex5;

import java.util.*;

public class Lab6Ex5 {
	public static int getSecondSmallest (Integer[] array) {
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		Collections.sort(list);
		int size = list.size();
		int ss = list.get(size - 2);
		return ss;
	}
	public static void main(String[] args) {
		Integer[] arr = {14, 21, 63, 44, 57, 29};
		int ans = getSecondSmallest(arr);
		System.out.println(ans);
	}
}
