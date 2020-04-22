package com.wang;

public class Circle extends Shape {
    private double r;

    public Circle() {
    }

    private Circle(Circle target) {
        super(target);
        if (target != null) {
            this.r = target.r;
        }
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public Shape getClone() {
        return new Circle(this);
    }
}
