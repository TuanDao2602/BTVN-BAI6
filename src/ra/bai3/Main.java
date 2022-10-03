package ra.bai3;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(3,4);
        System.out.println(point);
        MovablePoint moveablePoint=new MovablePoint(3,4,5,5);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);

    }
}
