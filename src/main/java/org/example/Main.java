package org.example;

import main.java.org.example.Lib;

public class Main {
    public static void main(String[] args) {

        System.out.println(Lib.getGreeting());
        var httpLib = new HttpLib();

        System.out.println(httpLib.getExampleDotCom());
    }
}