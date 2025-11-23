import java.awt.*;

public class Circle implements Shapeable,Comparable<Shapeable> {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    @Override
    public double getPerimieter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public int compareTo(Shapeable o) {
        if (this.getArea() > o.getArea()) return -1;
        else if (this.getArea() < o.getArea()) return 1;
        else return 0;
    }
}
