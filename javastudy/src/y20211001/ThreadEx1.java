package y20211001;

public class ThreadEx1 {
	
	/* 쓰레드를 구현하는 방법 
	 * 1 Thread 클래스를 상속 받는 방법
	 * 2 Runnable 인터페이스를 구현하는 방법  *
	 * 
	 * 상속을 받으면 다른 클래스를 상속 받을 수 없기 때문에 Runnable 
	 * 인터페이스 사용을 선호한다. 
	 * 
	 */
	
	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
	}
}
