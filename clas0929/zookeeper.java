public class zookeeper {
    // public void feed(tiger t1) {
    //     System.out.println("feed apple");
    // }
    // public void feed(lion l1) {
    //     System.out.println("feed banana");
    // }
    public void feed(predator p1) {
        System.out.println("feed "+ p1.getFood());
    }

    //tiger lion 각각 predator인터페이스의 객체이기도 하다. 
    //이와 같이 객체가 하나 이상의 자료형 타입을 갖게 되는 특성을 다형성 이라고한다. 
public static void main(String[] args) {

    zookeeper k1 = new zookeeper();
    tiger t1 = new tiger();
    lion l1 = new lion();
    crocodile c1 = new crocodile();

    k1.feed(t1);
    k1.feed(l1);   
    k1.feed(c1);
    
}


}
