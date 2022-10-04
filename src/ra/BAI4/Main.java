package ra.BAI4;

public class Main {
    public static void main(String[] args) {
        Shape shape =new Shape("green",true);
        System.out.println(shape);
        Triangle triangle = new Triangle(3,4,5);

        System.out.println(triangle.toString());

    }


}
