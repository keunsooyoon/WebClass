package class0928;

public class child2 extends parent2{
    int x = 20;

    void method() {
        System.out.println("x = " + x);   //20
        System.out.println("this.x = " + this.x);   //20
        System.out.println("super.x = " + super.x);  //10

    }
}
