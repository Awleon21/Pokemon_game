package Shapes;

public class Circle implements Shape {

    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        double pi = Math.PI;
        return (this.radius * this.radius) * pi;
    }

    @Override
    public int sides() {
        return 0;
    }
}
