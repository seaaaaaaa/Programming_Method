public class MyProgram {
    public static void main(String[] args) {
        double myHP = 10;
        Shapeable s1 = new Circle(7);
        Shapeable s2 = new Shapeable(){
            @Override
            public int compareTo(Shapeable o) {
                return 0;
            }

            @Override
            public double getPerimieter() {
                return myHP*2;
            }

            @Override
            public double getArea() {
                return myHP*4;
            }
        };
        System.out.println(s2.getArea());
    }
}
