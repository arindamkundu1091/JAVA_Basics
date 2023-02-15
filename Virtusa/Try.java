import java.util.Scanner;

class Person {
    String name;
    String birthYear;
    Person(String name, String birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
}

class Student extends Person {
    String dept;
    int atd;
    Student(String name, String birthYear, String dept, int atd) {
        super(name, birthYear);
        this.dept = dept;
        this.atd = atd;
        showStudentData();
    }
    void showStudentData() {
        System.out.println("Name : " + name + "\nBirthYear : " + birthYear + "\nDepartment : " + dept);
        if (atd >= 75) {
            System.out.println("Eligible : Yes");
        } else {
            System.out.println("Eligible : No");
        }
    }
}

class Staff extends Person {
    double salary;
    Staff(String name, String birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }
}

class TeachingStaff extends Staff {
    String subject;
    double result;
    TeachingStaff(String name, String birthYear, String subject, double result, double salary) {
        super(name, birthYear, salary);
        this.subject = subject;
        this.result = result;
    }
    void showTeachingData() {
        System.out.println("Name : " + name + "\nBirthYear : " + birthYear + "\nOld Salary : " + salary + "\nSubject : "
                + subject);
        double newSalary = salary + (salary * (result / 1000));
        System.out.println("New Salary : " + newSalary);
    }
}

class NonTeachingStaff extends Staff {
    String lab;
    int exp;
    NonTeachingStaff(String name, String birthYear, String lab, int exp, double salary) {
        super(name, birthYear, salary);
        this.lab = lab;
        this.exp = exp;
    }
    void showNonTeachingData() {
        System.out.println("Name : " + name + "\nBirthYear : " + birthYear + "\nOld Salary : " + salary + "\nSubject : "
                + lab);
        double newSalary = salary + (salary * (exp / 100));
        System.out.println("New Salary : " + newSalary);
    }
}

class Prof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        switch (t) {
            case 1: {
                String name = sc.nextLine();
                String birthYear = sc.nextLine();
                String dept = sc.nextLine();
                sc.nextLine();
                int atd = sc.nextInt();
                Student std = new Student(name, birthYear, dept, atd);
                std.showStudentData();
            }
            break;
            case 2: {
                String name = sc.nextLine();
                String birthYear = sc.nextLine();
                String subject = sc.nextLine();
                sc.nextLine();
                int result = sc.nextInt();
                double salary = sc.nextDouble();
                TeachingStaff ts = new TeachingStaff(name, birthYear, subject, result, salary);
                ts.showTeachingData();
            }
            break;
            case 3: {
                String name = sc.nextLine();
                String birthYear = sc.nextLine();
                String lab = sc.nextLine();
                sc.nextLine();
                int exp = sc.nextInt();
                double salary = sc.nextDouble();
                NonTeachingStaff nts = new NonTeachingStaff(name, birthYear, lab, exp, salary);
                nts.showNonTeachingData();
            }
            break;
        }
        sc.close();
    }
}
