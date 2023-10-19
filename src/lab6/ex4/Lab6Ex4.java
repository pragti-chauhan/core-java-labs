package lab6.ex4;

import java.util.*;

public class Lab6Ex4 {
	public static Map<Integer, String> getStudents (Map<Integer, Integer> marks) {
		Map<Integer, String> medal = new HashMap<>();
		marks.forEach((key, value) -> {
            if(value>=90)
            	medal.put(key, "Gold");
            else if(value<90 && value>=80)
            	medal.put(key, "Silver");
            else if(value<80 && value>=70)
            	medal.put(key, "Bronze");
        });
		return medal;
	}
	public static void main(String[] args) {
		Map<Integer, Integer> marks = new HashMap<>();
		marks.put(102, 85);
		marks.put(206, 91);
		marks.put(110, 96);
		marks.put(360, 72);
		marks.put(148, 79);
		marks.put(330, 69);
		Map<Integer, String> medal = getStudents(marks);
		System.out.println(medal);
	}
}
