public class MyProgram3 {
    public static void main(String[] args) {
        Compute add = new Compute() {
            @Override
            public double doIt(double a, double b) {
                return a+b;
            }
        };

        Compute mul = (double a, double b) -> a*b;
        Compute minus = (double a, double b) -> a-b;

        double m = 10, n = 2;
        System.out.println(add.doIt(m,n));
        System.out.println(mul.doIt(m,n));
        System.out.println(minus.doIt(m,n));
    }
}
