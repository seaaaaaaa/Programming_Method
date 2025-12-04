package logic;

public class Cup {
    private int drop;
    private int sum;

    public Cup(){
        this.drop = 0;
        this.sum = 0;
    }

    public int getDrop() {
        return drop;
    }

    public void setDrop(int drop) {
        this.drop = drop;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void addSum() {
        this.sum += 1;
    }
}
