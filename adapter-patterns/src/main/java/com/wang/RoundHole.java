package com.wang;

/**
 * 圆孔
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public RoundHole() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * 圆钉是否能够通过该孔
     */
    public boolean fits(RoundPeg roundPeg) {
        return this.getRadius() >= roundPeg.getRadius();
    }
}
