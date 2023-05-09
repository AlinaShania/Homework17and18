package Homework;

public class Students {

    String name;
    int grade1;
    int grade2;
    int grade3;
    int grade4;
    Students (String name, int grade1, int grade2, int grade3){
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        System.out.println(name+" has an average grade "+averageGrade());

    }
        int averageGrade (){
        return (grade1+grade2+grade3)/3;
        }

    public static void main(String[] args) {
        Students obj1 = new Students("Aaron",90,89,91);
        Students obj2 = new Students("Anna",80,90,87);
        Students obj3 = new Students("Alina",90,95,99);
        Students obj4 = new Students("Anton",80,79,87);
        Students obj5 = new Students("Abraham",90,89,81);
    }

}
