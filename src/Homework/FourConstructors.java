package Homework;

import java.io.FileOutputStream;

public class FourConstructors {
    String a;
    int b;
    char c;
    double d;

    FourConstructors (String a){
        System.out.println("This constructor is default");
    };

    private FourConstructors (int b){
        System.out.println("This constructor is private");
    };
    protected FourConstructors (char c){
        System.out.println("This constructor is protected");
    };
    public FourConstructors (double d){
        System.out.println("This constructor is public");
    };

    public static void main(String[] args) {
        FourConstructors obj1 = new FourConstructors("Hello!");
    }
}
class newClass {
    public static void main(String[] args) {
        FourConstructors obj2 = new FourConstructors(13.5);
    }
}
//package TestPackage;
//
//import Homework.FourConstructors;
//
//public class TestClass {
//    FourConstructors obj3 = new FourConstructors(13.5);
//}
