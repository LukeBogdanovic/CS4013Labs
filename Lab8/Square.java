public class Square extends GeometricObject implements Colorable {

    double length;

    public Square(double l) {
        this.length = l;
    }

    public Square() {
    }

    @Override
    public void howToColor() {
        System.out.println("Square:Colour all four sides");
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        double result = 0;
        for (int i = 0; i < 4; i++) {
            result = result + length;
        }
        return result;
    }

    @Override
    public int compareTo(GeometricObject o) {
        int result = 0;
        if (getArea() == o.getArea()) {
            result = 0;
        } else if (getArea() < o.getArea()) {
            result = -1;
        } else {
            result = 1;
        }
        return result;
    }

}
