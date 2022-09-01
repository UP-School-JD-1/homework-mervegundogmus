package org.mervegundogmus.oopj.week4.Point;

public class PointTest {

    public static void main(String[] args) {
         
        Point p = new Point(6,8);
        
        p.setX(10);
        System.out.println("X coordinate point1: " + p.getX());
        p.setY(20);
        System.out.println("Y coordinate point1: " + p.getY());
}
}