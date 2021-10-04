package y20211004;

import java.util.*;


class Fruit{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}


public class genericsExam {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); //에러 발생, 타입 불일치;
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
//		appleBox.add(new Toy());//에러발생 Box(Apple)에는 Apple만 담을 수 있다. 
	
		toyBox.add(new Toy());
//		toyBox.add(new Apple());
	
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);

		
		
	/*제네릭스
	 * '담을 수 있는 자료형은 String/int... 타입 뿐이다' 라는 식으로 특정 타입을 강제한다. 
	 * 제너릭스를 사용하여 좀 더 명확하게 타입 체크가 가능해진다. 
	 * 
	 * 제너릭스를 사용하면 그 이후로는 자료형에 대한 형변환이 필요없다. 이미 제너릭스를 통해서
	 * 특정 자료형만 추가 되어야 한다는 것을 선언했기 때문이다. 
	 * 불필요한 코딩 잘못된 형변환등의 오류를 피할 수 있다. 
	 */
	
//	ArrayList<String> aList = new ArrayList<String>();
//	aList.add("web");
//	aList.add("developer");	
//	aList.add("123");
//	
//	String web = aList.get(0);
//	String developer = aList.get(1);	
//	String num = aList.get(2);	
//	System.out.println(web);
//	System.out.println(developer);
//	System.out.println(num);
	
		/*
		 * 제네릭스 장점
		 * 1. 타입 안정성 확보
		 * 2. 타입 체크와 형변환을 생략할 수 있어 코드가 간결해 진다. 
		 * 
		 * 제네릭스 클래스 선언...
		 * 
		 * [without generics]
		 * 
		 * class Box {
		 * 	Object item;
		 * 
		 * 	void setItem(Object item) {
		 * 		this.item = item;
		 *  }
		 *  
		 *  Object getItem() {
		 *  return item;
		 *  }
		 *  
		 *  
		 * [with generics]
		 * class Box<T> {
		 * 	T item;
		 * 
		 *  void setItem(T item){
		 *  this.item = item;
		 *  }
		 *  T getItem() {
		 *  return item;
		 * }
		 * 
		 * <T> 타입변수 'T'의 첫글자에서 따온것이며 다른 것으로 사용해도 된다. 
		 * 
		 * Box<String> b = new Box<String>(); // 실제 객체 생성시에는 실제 타입을 지정한다. 
		 * b.setItem(new Object());  // 에러발생!!!  String  이외는 지정 불가..
		 * b.setItem("abc");         // 문제 없음 String
		 * String item = b.getItem(); 형변환이 필요없다. 
		 * 
		 * 
		 * Box<String> b = new Box<String>(); 
		 * 객체 생성시에 String을 지정했기 때문에 아래와 같은 의미가 된다. 
		 * 
		 * class Box {
		 * 	String item;
		 * 
		 *  void setItem(String item){
		 *  this.item = item;
		 *  }
		 *  
		 *  String getItem() {
		 *  return item;
		 * }
		 * 
		 * 제네릭스가 도입되기 이전의 코드와 호환을 위해서 제네릭스 클라스 임에도 예전의 방식으로
		 * 객체를 생성하는 것은 허용된다. 하지만 경고는 발생된다. 
		 * 
		 * 제네릭스의 용어
		 * 제네릭의 용어들은 헤깔리기 쉽다. 
		 * 
		 * class Box<T> {}
		 * 
		 * Box<t> 제네릭스 클래스. 't의 박스' 또는 't박스' 로 읽는다.
		 * t 타입변수 타입 매개변수  (t와 다른 알파벳을 쓸 수는 있지만 t로 사용하다. )
		 * 
		 * Box<Apple> applebox = new Box<Apple>(); // Apple 객체만 사용 가능
		 * Box<Grape> grapebox = new Box<Grape>(); // Grape 객체만 사용 가능
		 * 
		 */
		
		
		
		
		
	}
	
}
