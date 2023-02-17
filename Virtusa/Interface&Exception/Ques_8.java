import java.text.SimpleDateFormat;
import java.util.*;

abstract class Account {
    String name;
    int number;
    int balance;
    Date startDate;

    public Account(){}

    public Account(String name, int number, int balance, Date startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
    abstract double calculateInterest(Date dueDate);
}

class CurrentAccount extends Account {
    
    public CurrentAccount(){
        super();
    }

    public CurrentAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double calculateInterest(Date dueDate) {
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();
        c1.setTime(startDate);
        c2.setTime(dueDate);
        int due = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
        double interest = (balance * due * 5)/100;
        System.out.println(interest);
        return interest;
    }
}

class SavingsAccount extends Account {
    
    public SavingsAccount(String name, int number, int balance, Date startDate) {
        super(name, number, balance, startDate);
    }

    public SavingsAccount() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public double calculateInterest(Date dueDate) {
        Calendar c1 = new GregorianCalendar();
        Calendar c2 = new GregorianCalendar();
        c1.setTime(startDate);
        c2.setTime(dueDate);
        int due = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
        double interest = (balance * due * 12)/100;
        System.out.println(interest);
        return interest;
    }
}

public class Ques_8 {

    String name;
    int number;
    int balance;
    Date startDate;

    SavingsAccount sa = new SavingsAccount();
    CurrentAccount ca = new CurrentAccount();

    Ques_8(String name, int number, int balance, Date startDate, SavingsAccount sa) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
        this.sa = sa;
    }

    Ques_8(String name, int number, int balance, Date startDate, CurrentAccount ca) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
        this.ca = ca;
    }
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            int t = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int number = sc.nextInt();
            int balance = sc.nextInt();
            sc.nextLine();
            String sd = sc.nextLine();
            String dd = sc.nextLine();
            Date startDate = formatter.parse(sd);
            Date dueDate = formatter.parse(dd);
            switch (t) {
                case 1: {
                    SavingsAccount sa = new SavingsAccount(name, number, balance, startDate);
                    sa.calculateInterest(dueDate);
                }
                    break;
                case 2: {
                    CurrentAccount ca = new CurrentAccount(name, number, balance, startDate);
                    ca.calculateInterest(dueDate);
                }
                    break;
            }
            sc.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
