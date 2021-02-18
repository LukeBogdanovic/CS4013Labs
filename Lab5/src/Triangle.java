public class Triangle extends GeometricObject {
    
    double s1,s2,s3;

    public Triangle(){
        this.s1 = 1.0;
        this.s2 = 1.0;
        this.s3 = 1.0;
    }

    public Triangle(double a, double b, double c){
        this.s1 = a;
        this.s2 = b;
        this.s3 = c;
    }

    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
    }

    public double getPerimeter(){
        return s1 + s2 + s3;
    }

    public String toString(){
        return super.toString();
    }

}
