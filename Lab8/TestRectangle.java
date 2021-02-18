public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4);
        Rectangle r2 = new Rectangle(3, 5);
        Circle c1 = new Circle(4);
        Circle c2 = new Circle(6);

        System.out.println(GeometricObject.max(r1, c1).toString());
        System.out.println(GeometricObject.max(r2, c2).toString());
        System.out.println(GeometricObject.max(r1, r2).toString());
        System.out.println(GeometricObject.max(c1, c2).toString());
    }

}
