package es1.entities;

public class Rectangle {

    private int height;
    private int width;


    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static void stampTwoRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        int perimeter1 = rectangle1.rectanglePerimeter();
        int area1 = rectangle1.rectangleArea();

        int perimeter2 = rectangle2.rectanglePerimeter();
        int area2 = rectangle2.rectangleArea();

        System.out.println("Rectangle 1 - Perimeter: " + perimeter1 + ", Area: " + area1);
        System.out.println("Rectangle 2 - Perimeter: " + perimeter2 + ", Area: " + area2);
        System.out.println("The sum of both perimeters is: " + (perimeter1 + perimeter2) + ", the sum of both areas is: " + (area1 + area2));

    }

    public int rectanglePerimeter() {
        return (this.height + this.height) * 2;
    }

    public int rectangleArea() {
        return this.height * this.width;
    }

    public void stampRectangle() {
        System.out.println("The rectangle's perimeter is: " + rectanglePerimeter() + ". The area is: " + rectangleArea());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
