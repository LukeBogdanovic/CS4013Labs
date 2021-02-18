import java.util.ArrayList;
import java.util.Scanner;

public class TestGeometricObject {
    
    private static ArrayList<GeometricObject> GO = new ArrayList<GeometricObject>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int j = s.nextInt();
        s.close();
        Triangle t = new Triangle();
        GO.add(t);
        Rectangle R = new Rectangle();
        GO.add(R);
        Triangle t1 = new Triangle(3, 4, 3);
        GO.add(t1);
        Rectangle R1 = new Rectangle(5,6);
        GO.add(R1);
        for(GeometricObject G : GO){
            if(j >= 0){
                if(G == t || G == t1){
                    System.out.println(G.getArea());
                    System.out.println(G.getPerimeter());
                }
            } else{
                if(G == R || G == R1){
                    System.out.println(G.getArea());
                    System.out.println(G.getPerimeter());
                }
            }
        }
    }

}
