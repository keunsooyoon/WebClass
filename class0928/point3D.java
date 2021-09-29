package class0928;

public class point3D extends point{
    
    int z;

    point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    } 

    String getLocation() {
        return "x:" + x + "y:" + y + "z:" + z;

    }

}
