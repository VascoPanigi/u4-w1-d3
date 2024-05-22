package es1;

import es1.entities.Rectangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(25, 20);
        Rectangle rectangle2 = new Rectangle(30, 20);

        int perimeterRec1 = rectangle1.rectanglePerimeter();
        int areaRec1 = rectangle1.rectangleArea();
        rectangle1.stampRectangle();
        System.out.println(perimeterRec1);
        System.out.println(areaRec1);

        Rectangle.stampTwoRectangles(rectangle1, rectangle2);
    }


}
