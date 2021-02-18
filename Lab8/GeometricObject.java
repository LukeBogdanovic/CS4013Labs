public abstract class GeometricObject implements Comparable<GeometricObject> {
  protected String color;
  protected double weight;

  // Default construct
  protected GeometricObject() {
    color = "white";
    weight = 1.0;
  }

  // Construct a geometric object
  protected GeometricObject(String color, double weight) {
    this.color = color;
    this.weight = weight;
  }

  // Getter method for color
  public String getColor() {
    return color;
  }

  // Setter method for color
  public void setColor(String color) {
    this.color = color;
  }

  // Getter method for weight
  public double getWeight() {
    return weight;
  }

  // Setter method for weight
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // Abstract method
  public abstract double getArea();

  // Abstract method
  public abstract double getPerimeter();

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

  public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
    if (o1.compareTo(o2) == 0) {
      return o1;
    } else if (o1.compareTo(o2) == -1) {
      return o2;
    } else {
      return o1;
    }
  }

  public void howToColor() {
    return;
  }

}
