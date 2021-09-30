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



}
