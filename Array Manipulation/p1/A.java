package p1;

public class A {
    private int a;
    private int b;

    A get() {
        return this;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public int add() {
        return a + b;
    }

}
