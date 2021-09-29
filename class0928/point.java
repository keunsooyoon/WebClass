package class0928;

public class point {
    int x,y;

    point() {
        
    }
    point(int x, int y){  //생성자
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x:" + x + "y:" + y ;
    }
}
