public class TestArray {

    public static void main(String[] args) {
        GeometricObject[] GO = new GeometricObject[5];
        Rectangle r = new Rectangle(4, 5);
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Square s1 = new Square();
        Square s2 = new Square();
        GO[0] = r;
        GO[1] = c1;
        GO[2] = c2;
        GO[3] = s1;
        GO[4] = s2;
        for (int i = 0; i < GO.length; i++) {
            GO[i].howToColor();
        }
    }

}
