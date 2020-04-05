package com.evghenii;

public class Operation {

    private Geometry geometry;

    public Operation() {
    }

    public Operation(Geometry geometry) {
        this.geometry = geometry;
    }

    public int add(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public int div(int zahl1, int zahl2) {
        return zahl1 / zahl2;
    }

    public int miltipl(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }

    public int minus(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

}
