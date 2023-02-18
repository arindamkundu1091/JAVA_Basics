import java.util.Scanner;

class ItemType implements Runnable {
    String name;
    double deposit;
    double costPerItem;
    int noOfItems;

    ItemType(String name, double deposit, double costPerItem, int noOfItems) {
        this.name = name;
        this.deposit = deposit;
        this.costPerItem = costPerItem;
        this.noOfItems = noOfItems;
    }
    
    public void run() {
        ItemType it = new ItemType(name, deposit, costPerItem, noOfItems);
        double total = it.costPerItem * it.noOfItems;
        System.out.printf("%.2f\n",total);
    }
}

public class Example_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.next();
            double deposit = sc.nextDouble();
            double costPerItem = sc.nextDouble();
            int noOfItems = sc.nextInt();
            ItemType it = new ItemType(name, deposit, costPerItem, noOfItems);
            Thread t = new Thread(it);
            t.start();
        }
        sc.close();
    }
}
