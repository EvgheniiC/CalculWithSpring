package com.evghenii;

public class Geometry {

    private Mathematician mathematician;

    public Geometry() {
    }

    public Geometry(Mathematician mathematician) {
        this.mathematician = mathematician;
    }

    public double sin(int zahl) {
        return Math.sin(zahl) ;
    }

    public double cos(int zahl) {
        return Math.cos(zahl);
    }

    public double tan(int zahl) {
        return Math.tan(zahl);
    }

    public double cotan(int zahl) {
        return 1.0 / Math.tan(zahl);
    }
}
