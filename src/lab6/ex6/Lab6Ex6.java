package lab6.ex6;

import java.util.*;

import lab6.ex1.Lab6Ex1;

public class Lab6Ex6 {
	public static List<Integer> votersList (Map<Integer, Integer> map) {
		List<Integer> list = new ArrayList<>();
		map.forEach((key, val) -> {
			if(2023-val>=18)
				list.add(key);
		});
		return list;
	}
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(102, 2006);
		map.put(206, 2000);
		map.put(110, 1970);
		map.put(360, 2010);
		map.put(148, 1994);
		map.put(330, 1997);
		
		List<Integer> elligible = votersList(map);
		System.out.println(elligible);
	}
}
