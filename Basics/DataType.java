package Basics;


public class DataType {

    public static void main(String[] args) {
        // size of int is 4 bytes and range is -2,147,483,648 to 2,147,483,647
        int x = 5;
        // size of float is 4 bytes and range is 1.4E-45 to 3.4E+38
        float y = 5.99f;
        // size of char is 2 bytes and range is 0 to 65,535
        char z = 'A';
        // size of double is 8 bytes and range is 4.9E-324 to 1.7E+308
        double w = 19.99d;
        // size of boolean is not precisely defined but generally takes 1 bit
        boolean isJavaFun = true;
        // size of long is 8 bytes and range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long bigNumber = 15000000000L;
        // size of short is 2 bytes and range is -32,768 to 32,767
        short smallNumber = 5000;
        // size of byte is 1 byte and range is -128 to 127
        byte verySmallNumber = 100;

        System.out.println("Integer value: " + x);
        System.out.println("Float value: " + y);
        System.out.println("Character value: " + z);
        System.out.println("Double value: " + w);   
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("Long value: " + bigNumber);
        System.out.println("Short value: " + smallNumber);
        System.out.println("Byte value: " + verySmallNumber);
    }
}
