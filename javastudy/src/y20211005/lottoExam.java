package y20211005;

import java.util.*;

public class lottoExam {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i = 0 ; set.size() < 6 ; i++){
			int num = (int)(Math.random()*45) + 1;
			System.out.println(num);
			set.add(num);
			System.out.println(set);
		}
	}

}
