package com.example.utils;
import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5);
        double area1 = Math.PI*cir.getRadius();
        System.out.println(area1);

        Rectangle ract = new Rectangle(2, 4);
        double area2 = ract.getLength()*ract.getLength(); 
        System.out.println(area2);
    }
}
