package ra.dev;

import java.util.Scanner;

public class Cylinder extends Circle{
    private double whidth;


    public Cylinder() {
    }

    public Cylinder(double radius, String color, double whidth) {
        super(radius, color);
        this.whidth = whidth;
    }



    public double getWhidth() {
        return whidth;
    }

    public void setWhidth(double whidth) {
        this.whidth = whidth;
    }

    public double tinhTheTich(){
       return super.tinhDienTich()*this.whidth;
    }


}
