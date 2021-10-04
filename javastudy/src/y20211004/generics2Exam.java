package y20211004;

import java.util.ArrayList;

class Fruit2 implements Eatable2{
	public String toString() {
		return "Fruit2";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "Apple2";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "Grape2";
	}
}

class Toy2{
	public String toString() {
		return "Toy2";
	}
}

interface Eatable2 {}

class FruitBox2<T extends Fruit2 & Eatable2> extends Box2<T> {
	
}

class Box2<T> {
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

public class generics2Exam {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox2 = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox2 = new FruitBox2<Apple2>();
		FruitBox2<Grape2> grapeBox2 = new FruitBox2<Grape2>();
//		FruitBox2<Grape2> grapeBox3 = new FruitBox2<Apple2>(); //타입 불일치
// 		FruitBox(Toy2) toyBox2 = new FruitBox2<Toy2>();  //에러, 상속 아님
		
		fruitBox2.add(new Fruit2());
		fruitBox2.add(new Apple2());
		fruitBox2.add(new Grape2());	
		appleBox2.add(new Apple2());
//		appleBox2.add(new Grape2());  //grape2 은 apple2의 자식이 아님
		grapeBox2.add(new Grape2());
		
		System.out.println(fruitBox2);
		System.out.println(appleBox2);
		System.out.println(grapeBox2);

		
	}
/* 타입 문자로 사용할 타입을 명시하면  한 종류의 타입만 저장 할수 있도록 제한 할 수 있지만 
 * 그래도 여전히 모든 종료의 타입을 지정할 수 있다는 것은 변함이 없다. 그러면 지정할 수 있는 타입을
 * 제한 할 수는 없을까!!!
 * 
 * FruitBox<Toy> fruitBox = new FruitBox<Toy>;
 * fruitBox.add(new Toy());
 * 
 * 제네릭스 타입에서 extends 을 사용하면 특정 타입의 객체들만 대입할 수 있게 제한 할 수 있다. 
 * 
 * class FruitBox<T extends Fruit> { //Fruit의 자식만 타입으로 인정한다. 
 * 
 * }
 * 
 * FruitBox<Apple> appleBox = new FruitBox<Apple>();
 * FruitBox<Grape> grapeBox = new FruitBox<Grape>();
 * FruitBox<Toy> toyBox = new FruitBox<Toy>;  //에러 , toy는 자식이 아니다. 
 * 
 */
	
	
	
}
