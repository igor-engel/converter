package org.example;

public class App 
{
    public static void main(String[] args) {
        DigitConverter converter = new DigitConverterImpl();
        System.out.println(converter.convert(125, 10));
        System.out.println(converter.convert(0.25, 10, 5));
    }
}
