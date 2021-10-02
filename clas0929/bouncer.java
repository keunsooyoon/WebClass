public class bouncer {
    
    // public void barkAnimal(animal a1){
    //     if (a1 instanceof tiger) {
    //         System.out.println("어흥");
    //     }else if (a1 instanceof lion) {
    //         System.out.println("으르렁");
    //     }else if (a1 instanceof crocodile) {
    //         System.out.println("쩝쩝");
    //     }
    // }

    public void barkAnimal(bark a1){
        a1.barkable();
    }


    public static void main(String[] args) {
        tiger t1 = new tiger();
        lion l1 = new lion();

        bouncer b1 = new bouncer();
        b1.barkAnimal(t1);
        b1.barkAnimal(l1);
    }


    // barkAnimal 매서드는 입력으로 받은 animal객체가 tiger클래스의 인스턴스인 경우 '어흥'
    // lion클래스의 인스턴스 인 경우에는 '으르렁'을 출력하게 된다. 

    // t1, l1 객체들은 각각 tiger, lion 클래스의 객체이기도 하지만 animal과 bark, predator의 객체이기도하다. 이런 이유로 barkAnimal메소드의 입력 자료형을 animal 에서 bark로 바꾸어 사용할 수 있다. 

    //이렇게 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 바로 다형성이라고 한다. 

    //  tiger t1 = new tiger();
    //  animal a1 = new tiger();
    //  predator p1 = new tiger();
    //  bark b1 = new tiger();

}
