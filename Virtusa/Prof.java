// You are using Java
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
    boolean eligible(){
        if(atd >= 75){
            return true;
        }else{
            return false;
        }
    }
}

class Staff extends Person{
    double salary;
    Staff(String name, String birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }
}

class TeachingStaff extends Staff{
    String subject;
    double result;
    TeachingStaff(String name, String birthYear, double salary, String subject, double result){
        super(name, birthYear, salary);
        this.subject = subject;
        this.result = result;
    }
}



