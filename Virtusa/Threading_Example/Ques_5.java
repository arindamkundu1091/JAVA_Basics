import java.util.ArrayList;
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

class Thread_5 {
    public static void main(String[] args) {
        ArrayList<String> na = new ArrayList<>();
        ArrayList<Double> de = new ArrayList<>();
        ArrayList<Double> co = new ArrayList<>();
        ArrayList<Integer> no = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.next();
            double deposit = sc.nextDouble();
            double costPerItem = sc.nextDouble();
            int noOfItems = sc.nextInt();
            na.add(name);
            de.add(deposit);
            co.add(costPerItem);
            no.add(noOfItems);
        }
        for (int i = 0; i < n; i++){
            String name = na.get(i);
            double deposit = de.get(i);
            double costPerItem = co.get(i);
            int noOfItems = no.get(i);
            ItemType it = new ItemType(name, deposit, costPerItem, noOfItems);
            Thread t = new Thread(it);
            t.start();
        }
        sc.close();
    }
}
