import java.util.Scanner;

public class Prof {

    static void student() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int by = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        int age = sc.nextInt();
        String elg = "No";
        if (age >= 18) {
            elg = "Yes";
        } else {
            elg = "No";
        }
        System.out.println("Name : "+name + "\nBirthYear : " + by + "\nDepartment : " + dept + "\nEligible : " + elg);
        sc.close();
    }

    static void teaching() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int by = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        int age = sc.nextInt();
        double sal = sc.nextInt();
        double r =(double) age / 1000;
        double newSal =(sal + r * sal);
        System.out.println("Name : "+name + "\nBirthYear : " + by +"\nOld Salary : "+sal+ "\nSubject : " + dept + "\nNew Salary : " + newSal);
        sc.close();
    }

    static void nonTeaching() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int by = sc.nextInt();
        sc.nextLine();
        String dept = sc.nextLine();
        int ex = sc.nextInt();
        int sal = sc.nextInt();
        double r =(double) ex / 100;
        double newSal =(sal + r * sal);
        System.out.println("Name : "+name + "\nBirthYear : " + by +"\nOld Salary : "+sal+ "\nLab : " + dept + "\nNew Salary : " + newSal);
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        switch (t) {
            case 1:
                student();
                break;
            case 2:
                teaching();
                break;
            case 3:
                nonTeaching();
                break;
        }
        sc.close();
    }
}
