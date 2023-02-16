
// You are using Java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Line = sc.nextLine();
        AccountBO A = new AccountBO();
        A.getAccountDetail(Line);
        sc.close();
    }
}

class Account {
    protected String accountNumber;
    protected Double balance;
    protected String accountHolderName;
}

class SavingAccount extends Account {
    protected Double minimumBalance;
}

class FixedAccount extends SavingAccount {
    protected Integer lockingPeriod;
}

class AccountBO {
    public void getAccountDetail(String detail) {
        String[] s = detail.split(",");
        String accountNumber = s[0];
        Double balance = Double.parseDouble(s[1]);
        String AccountHolderName = s[2];
        Integer minimumBalance = Integer.parseInt(s[3]);
        Integer lockingPeriod = Integer.parseInt(s[4]);
        System.out.format("%-20s %-10s %-20s %-20s %s", "Account Number", "Balance", "Account holder name",
                "Minimum balance", "Locking period");
        System.out.println();
        System.out.format("%-20s %-10s %-20s %-20s %s", accountNumber, balance, AccountHolderName, minimumBalance,
                lockingPeriod);
    }
}