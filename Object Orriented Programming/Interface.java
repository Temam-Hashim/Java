interface Drawable {
    public static final double PI = 3.14;

    double findArea();
}

interface Drawable2 extends Drawable {

    double findPerimeter();

}

class Rectangle implements Drawable2 {
    public int width, height;

    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double findArea() {
        double area = height * width;
        return area;
    }

    @Override
    public double findPerimeter() {
        double p = 2 * (height + width);
        return p;
    }
}

class Circle implements Drawable2 {
    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        double area = 2 * (PI * radius * radius);
        return area;
    }

    @Override
    public double findPerimeter() {
        double cir = 2 * (PI * radius);
        return cir;
    }
}

public class Interface {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(5);

        // rectangle
        System.out.println("Area of Rectangle:" + r.findArea());
        System.out.println("Perimeter of Rectangle:" + r.findPerimeter());
        // circle
        System.out.println("Area of Circle:" + c.findArea());
        System.out.println("Circumference of Circle:" + c.findPerimeter());

    }

}
