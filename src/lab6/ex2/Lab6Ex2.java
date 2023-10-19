package lab6.ex2;
import java.util.*;

public class Lab6Ex2 {
	public static Map<Character, Integer> countChars (char[] array) {
		Map<Character, Integer> map = new HashMap<>();
		for(char ch: array) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		return map;
	}
	public static void main(String[] args) {
		char[] arr = {'a', 'c', 'e', 'a', 'd', 'c', 'a', 'e', 'g'};
		Map<Character, Integer> countChar = countChars(arr);
		System.out.println(countChar);
	}
}
