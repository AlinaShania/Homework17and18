package Homework;

public class StaticConstructor {
   static String a;
   static int b;
   static char c;
   static double d;

   static StaticConstructor(String a, int b, char c) {
       System.out.println("Testing static constructor");
    }
    // we can not define a static constructor
}
