package ra.dev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle circle =new Circle();
        circle.setRadius(2);
        System.out.println("diện tích là "+circle.tinhDienTich());
        Cylinder cylinder =new Cylinder();
        cylinder.setRadius(2);
        cylinder.setWhidth(5);
        System.out.println("thể tích là "+ cylinder.tinhTheTich());

    }

}
