import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String s) {
        super("InvalidAgeForDrivingLicenseException: " + s);
    }
}

class MarkException extends Exception {
    MarkException(String s) {
        super("InvalidMarkForDrivingLicenseException: " + s);
    }
}

class Ques_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        int marks = sc.nextInt();
        sc.close();
        if (age < 0) {
            try {
                throw new AgeException("Invalid age");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        } else if (age > 0 && age < 18) {
            try {
                throw new AgeException("Age should be more than 18 years old");
            } catch (AgeException e) {
                System.out.println(e.getMessage());
            }
        } else if (marks < 0) {
            try {
                throw new MarkException("Invalid mark");
            } catch (MarkException e) {
                System.out.println(e.getMessage());
            }
        } else if (marks > 0 && marks < 80) {
            try {
                throw new MarkException("Mark should be more than 80");
            } catch (MarkException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.print("Approved");
        }
    }
}
