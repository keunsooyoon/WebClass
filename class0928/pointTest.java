package class0928;

public class pointTest {
    public static void main(String[] args) {
        point3D p3 = new point3D(1,2,3);

        // 에러가 발생한다. 이유는 point3D 클래스의 생성자에서 부모 클래스의 생성자인 Point()을 찾을 수 없다는 내용이다. 
        //Implicit super constructor point() is undefined.
        //point3D클래스의 생성자의 첫줄이 생성자를 호출하는 문장이 아니기 때문에 자바가 자동으로  super()를 넣어준다.
        //부모 클래스에 super() 없다. 생성자가 하나라도 이미 있으면 자동으로 디폴트 생성자를 생성하지는 않는다. 
        //이 에러를 수정하려면  point 클래스에 디폴트 생성자를 추가해주거나 또는 point3D 생성자의 첫줄에서 point(int x, int y)를 호출하도록 변경하면 된다. 
    }
}
