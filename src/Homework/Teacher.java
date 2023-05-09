package Homework;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Teacher {
    String name = "Susan";
    String subject = "Math";
    int yearsOfExperience = 25;
    boolean isGood;
    void method1 (){
        System.out.println("aaa");
    }
    void method2 (){
        System.out.println("bbb");
    }
    void method3(){
        System.out.println("ccc");
    }
    void method4 (){
        System.out.println("ddd");
    }
}
class MathTeacher extends Teacher {
    String name = "Aaron";
    void method (){
        System.out.println(this.name);
    }
}
class ChemistryTeacher extends Teacher{
}
class PianoTeacher extends Teacher{
}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.name = "Stacy";
        mathTeacher.subject = "Math";
        mathTeacher.isGood = true;
        System.out.println(mathTeacher.name);
        mathTeacher.method1();

        ChemistryTeacher chemistryTeacher = new ChemistryTeacher();
        chemistryTeacher.name = "Kira";
        chemistryTeacher.yearsOfExperience = 13;
        System.out.println(chemistryTeacher.yearsOfExperience);
        chemistryTeacher.method2();

        PianoTeacher pianoTeacher = new PianoTeacher();
        pianoTeacher.name = "Olga";
        pianoTeacher.yearsOfExperience = 13;
        pianoTeacher.isGood = false;
        System.out.println(pianoTeacher.isGood);
        pianoTeacher.method4();

    }
}
