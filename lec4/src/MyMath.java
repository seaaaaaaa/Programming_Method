


public class MyMath {
    public static void main(String[] args) {
        //Shapeable s = new Shapeable();
        Shapeable[] shapes = new Shapeable[3];
        shapes[0] = new Circle(7);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Rectangle(7,8);
        System.out.println(((Circle)shapes[0]).getDiameter());
    }

    public static void printInfo(Shapeable s){
        System.out.println(s.getArea()+","+s.getPerimieter());
    }
}
