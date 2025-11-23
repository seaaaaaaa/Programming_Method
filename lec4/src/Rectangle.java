import java.awt.*;

public class Rectangle implements Shapeable,Comparable<Shapeable> {
    double w,h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;

    }


    @Override
    public double getPerimieter() {
        return 2*(w+h);
    }

    @Override
    public double getArea() {
        return w*h;
    }



    @Override
    public int compareTo(Shapeable o) {
        if(this.getArea() > o.getArea()) return -1;
        else if(this.getArea() < o.getArea()) return 1;
        else return 0;
    }
}
