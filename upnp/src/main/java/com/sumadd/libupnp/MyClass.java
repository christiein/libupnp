package com.sumadd.libupnp;

import java.io.Reader;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args)
    {
        System.out.println("main...");

        Scanner s = new Scanner(System.in);
        String ss = null;
        while (!(ss = s.next()).equals("1")) {
            System.out.println("ss === " + ss);
        }
    }
}
