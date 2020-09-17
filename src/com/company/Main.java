package com.company;

public class Main {

    public static void main(String[] args) {
        // some primitive data types:
        int x;
        float y=5.9F;
        double s=0;
        boolean adevar=!false;
        char litera_d='D';
        byte bytenum=2;
        // non primitive data types:
        Integer b=700;
        Double a=502.49D;
        String[] colors={"Blue","White","Red","Green"};
        Boolean fals=false;

        if (adevar || false) s=multiplication(a,y);
        System.out.println("Rezultatul inmultirii a*y="+s);

        if (s>b) showcolors(colors);
        colors[3]="Black";
        showcolors(colors);
        //cast example
        x=(int)y;
        System.out.println("-----------------");
        System.out.println("x="+x);
        System.out.println();
        System.out.println(litera_d);
        System.out.println(litera_d+5);

    }

    static double multiplication(double x,float y){
        double s;
        s=x*y;

        return s;
    }

    static void showcolors(String[] x){
        System.out.println("--------Show colors-----------");
        for (String i:x){   //for each loop
            System.out.println(i);
        }

    }
}
