package org.generics;

public class Main {
    public static void main(String[] args)
    {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doubleprinter = new Printer<>(12.0);
        doubleprinter.print();

//        System.out.println("Hello world!");
    }
}