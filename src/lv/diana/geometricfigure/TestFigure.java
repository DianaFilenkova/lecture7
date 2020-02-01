package lv.diana.geometricfigure;

public class TestFigure {
    public static void main (String[]args) {
        Circle c = new Circle();
        Circle c1 = new Circle(5.3);
        Circle c2 = new Circle(5.4, "green");

        System.out.println(c.getRadius() +" "+ c.getColor());
        System.out.println(c1.getRadius()+" "+ c1.getColor());
        System.out.println(c2.getRadius()+" "+c2.getColor());

        System.out.println("Area of figure is: "+c.getArea());
        System.out.println(c2.toString());

    }
}
