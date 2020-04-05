package com.evghenii;

public class Programmer {

    private Mathematician mathematician;

    public Programmer(Mathematician mathematician) {
        this.mathematician = mathematician;
    }

    public Programmer() {
    }

    public Mathematician getMathematician() {
        return mathematician;
    }

    public void setMathematician(Mathematician mathematician) {
        this.mathematician = mathematician;
    }

    public String transferTo2(int zahl) {

  /*      String result = Integer.toBinaryString(zahl);

        System.out.println("In 2 System ist " + result);*/

        return Integer.toBinaryString(zahl);

    }

    public String transferTo8(int zahl) {
        return Integer.toOctalString(zahl);
    }

    public String transferTo16(int zahl) {
        return Integer.toHexString(zahl);
    }


}
