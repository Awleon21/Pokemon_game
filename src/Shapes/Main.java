package Shapes;

public class Main {

    // Write a program that prints out the areas of a square and rectangle
    // Use the Shape Inheritance
    // For help look at the circle example
    // Print out the square and rectangle side and areas
    // Challenge: Add another shape of your choosing and add that object (make it a fun one!)
    public static void main(String[] args){
        Circle circle = new Circle(11);
        System.out.println("Circle sides: " + circle.sides() + " - Cirlce area: " + circle.area());
    }
}
