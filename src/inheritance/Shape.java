package inheritance;

public abstract class Shape {

    protected int a;
    protected int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int getPerimeter();
}
