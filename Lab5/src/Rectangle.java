public class Rectangle extends GeometricObject{
    
    double width,height;

    public Rectangle(){
        this.width = 2;
        this.height = 1;
    }

    public Rectangle(double w,double h){
        this.width = w;
        this.height = h;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return (height * 2) + (width * 2);
    }

    public String toString(){
        return super.toString();
    }

}
