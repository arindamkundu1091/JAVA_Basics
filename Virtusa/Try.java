import java.util.Scanner;

class Person{
    String name;
    String birthYear;
    Person(String name, String birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }
}

class Student extends Person{
    String dept;
    int atd;
    Student(String name, String birthYear, String dept, int atd){
        super(name, birthYear);
        this.dept = dept;
        this.atd = atd;
    }
}