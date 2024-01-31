abstract class TwoDshape {
    private double width;
    private double height;
    private String name;

    public TwoDshape() {
        width = 0;
        height = 0;
        name = "null";
    }

    public TwoDshape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void showDimensions() {
        System.out.println("Width: " + width + ", Height: " + height);
    }

    public abstract double area();
}

class Triangle extends TwoDshape {
    public Triangle() {
        super();
    }

    public Triangle(double w, double h) {
        super(w, h, "Triangle");
    }

    @Override
    public double area() {
        return 0.5 * getWidth() * getHeight();
    }
}

class Rectangle extends TwoDshape {
    public Rectangle() {
        super();
    }

    public Rectangle(double w, double h) {
        super(w, h, "Rectangle");
    }

    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}

public class q3 {
    public static void main(String[] args) {
        TwoDshape shape1 = new Triangle(5, 3);
        TwoDshape shape2 = new Rectangle(4, 6);

        System.out.println("Area of " + shape1.getName() + " is " + shape1.area());
        System.out.println("Area of " + shape2.getName() + " is " + shape2.area());
    }
}
