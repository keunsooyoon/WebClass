package class0928;

public class superExam {
    //super 자식 클래스 에서 부모 가르키는데 사용되는 참조하는 변수이다. 멤버 변수와 지역변수의 이름이 같을때 this 붙여서 구별했듯이 상속받은 멤버와 자기 자신의 멤버 이름이 같은 경우 super로 구별 할 수 있다. 
    public static void main(String[] args) {
        child c = new child();
        c.method();
    }


}
