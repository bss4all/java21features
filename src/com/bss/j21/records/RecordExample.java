package com.bss.j21.records;

record Point(int x, int y) {}

record Point1(double x, double y) {}

record ColoredPoint(Point p, String color) {}

public class RecordExample {
    public static void main(String[] args) {
        Object obj = new Point(10, 20);

        if (obj instanceof Point(int x, int y)) {
            System.out.println("X: " + x + ", Y: " + y);
        }

        obj = new Point1(10, 20);
        if (obj instanceof Point1(double x, double y)) {
            System.out.println(Math.toDegrees(Math.atan2(y, x)));
        }

        obj = new ColoredPoint(new Point(5, 15), "Red");
        if (obj instanceof ColoredPoint(Point(int x, int y), String color)) {
            System.out.println("X: " + x + ", Y: " + y + ", Color: " + color);
        }

    }
}
