public class test extends Thread{
    /*
        쓰레드
            동작하고 있는 프로그램을 프로세스라고 한다. 보통 한개의 프로세스는 한가지 일을 한다. 쓰레드를 이용하면 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 할 수 있다.  
    */
    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        test t1 = new test();
        t1.start();
    }

}
