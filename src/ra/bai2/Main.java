package ra.bai2;

import ra.bai3.Point;

public class Main {
    public static void main(String[] args) {
        Point2D point2D =new Point2D(5,6);
        System.out.println(point2D);

            Point3D point3D=new Point3D(point2D.getX(), point2D.getY(), 5);
        System.out.println(point3D);
    }
}
