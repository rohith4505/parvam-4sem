package com.polymorphism;

abstract class Shapee {

    public String color;

    public void displaycolor() {
        System.out.println("COLOR: " + color);
    }

    public abstract double carea();

    public abstract void draw();
}

class Corcle extends Shapee {

    double r;

    public Corcle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    @Override
    public double carea() {
        return 3.14 * r * r;
    }

    @Override
    public void draw() {
        System.out.println("drawing a circle!!");
    }
}

class Rectangl extends Shapee {

    double l;
    double w;

    public Rectangl(double l, double w, String color) {
        this.l = l;
        this.w = w;
        this.color = color;
    }

    @Override
    public double carea() {
        return l * w;
    }

    @Override
    public void draw() {
        System.out.println("drawing a rectangle!!!");
    }
}

public class Abstraction_class {

    public static void main(String[] args) {

        Rectangl r = new Rectangl(10, 20, "Blue");
        Corcle c = new Corcle(3, "Red");

        c.displaycolor();
        r.displaycolor();

        System.out.println("Circle Area: " + c.carea());
        System.out.println("Rectangle Area: " + r.carea());

        c.draw();
        r.draw();
    }
}