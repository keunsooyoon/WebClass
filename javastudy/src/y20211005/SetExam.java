package y20211005;

import java.util.*;

public class SetExam {
/*
 * Set 중복된 요소를 저장하지 않는다. add, addAll 중복요소 제거용으로 많이 사용된다. 
 *     순서를 유지 하지 않는다. 
 */
	public static void main(String[] args) {
		Object[] objArr = {"1","2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for (int i = 0 ; i < objArr.length; i ++) {
			set.add(objArr[i]);
		}
		System.out.println(set);
	}
	
	
	
}
