package class0928;

public class superTest {
    public static void main(String[] args) {
        child2 c = new child2();
        c.method();


        // 멤버 변수가 부모클래스인 parent 에도 있고 자식 클래스인
        // child 에도 있을 때는 super.x와 this.x가 서로 다른 값을
        // 참조하게 된다. this.x는 자식 클래스에 선언된 멤버 변수를 의미한다. 



    }
}
