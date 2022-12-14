package ra.bai2;

public class Point3D extends Point2D{
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] arr2 = {super.getX(),super.getY(),this.z};
        return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x ="+ super.getX()+
                "y ="+ super.getY()+
                "z=" + z +
                '}';
    }
}

