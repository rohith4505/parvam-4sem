package com.polymorphism;

class Shape {
    public void draw() {
        System.out.println("drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("DRAWING A RECTANGLE!!!!");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("DRAWING A CIRCLE!!!!!");
    }
}

public class Methodride {
    public static void main(String[] args) {

        Shape s = new Shape();
        Shape r = new Rectangle();
        Shape c = new Circle();

        s.draw();
        r.draw();
        c.draw();
    }
}