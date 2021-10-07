package y20211005;

import java.util.HashMap;

public class mapExam {
	
	public static void main(String[] args) {
		HashMap<String, String>map = new HashMap<String, String>();
		map.put("people","사람");
		map.put("baseball","야구");
		System.out.println(map.size());
		System.out.println(map.get("people"));
		System.out.println(map.containsKey("people"));
		System.out.println(map.remove("people"));
		System.out.println(map.size());
	}
	
	
	
	
/* map 
 * 파이썬의 딕셔너리 와 동일하다. 
 * 이름=홍길동, 나이=19, 성별=남  키와 밸류로 구성되어 
 * 대응관계를 쉽게 표현할 수 있다. 
 * 
 *  key     | value
 *  people     사람
 *  baseball   야구
 *  
 *  map은 순서가 없이 key를 통해 value를 얻는다. 
 *  맵의 가장 큰 특징은 key로만 value 얻는다것 중요하다. 검색할때
 *  순차적으로 찾는게 아니라 키값으로 바로 접근할수 있다. 
 *  
 *  put 
 *  
 *  map.put("people","사람");
 *  map.put("baseball","야구");
 *  
 *  get
 *  
 *  System.out.println(map.get("people"));
 *  System.out.println(map.get("baseball"));
 *  
 *  containsKey 맵에 어떤 키가 있는지 조사
 *  
 *  System.out.println(map.containsKey("people")); //True
 *  System.out.println(map.containsKey("student")); //False
 *  
 *  remove  맵에 항목을 삭제하는 메서드 해당 key값에 해당하는 key와 value 모두 삭제
 *  System.out.println(map.remove("people"));
 *  
 *  size map의 갯수를 알아낸다. 
 *  
 *  System.out.println(map.size());
 */
	
}
