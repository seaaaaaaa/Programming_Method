import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MyProgram2 {
    public static void main(String[] args) {
        ArrayList<Shapeable> shapes = new ArrayList<Shapeable>();
        shapes.add(new Circle(7));
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(2,3));
        Collections.sort(shapes);
        for(Shapeable shape : shapes) {
            System.out.println(shape.getArea());
        }


    }
}
