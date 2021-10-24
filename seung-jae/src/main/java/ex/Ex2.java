package ex;

public class Ex2 {

    private int a;
    private int b;
    private int temp = 0;

    public Ex2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap() {
        temp = a;
        a = b;
        b = temp;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
