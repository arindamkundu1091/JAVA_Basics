import java.util.ArrayList;
import java.util.Scanner;

class Stall implements Runnable {
    String stallName;
    String details;
    double stallArea;
    String owner;
    double stallCost;

    Stall(String stallName, String details, double stallArea, String owner) {
        this.stallName = stallName;
        this.details = details;
        this.stallArea = stallArea;
        this.owner = owner;
    }

    public void run() {
        stallCost = stallArea * 150.0;
        System.out.println(stallCost);
    }
}


class Thread_Ques1 {
    public static void main(String[] args) {
        try {
            ArrayList<String> sn = new ArrayList<>();
            ArrayList<String> d = new ArrayList<>();
            ArrayList<Double> sa = new ArrayList<>();
            ArrayList<String> o = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++){
                String sname = sc.nextLine();
                String details = sc.nextLine();
                double sarea = sc.nextDouble();
                sc.nextLine();
                String owner = sc.nextLine();
                sn.add(sname);
                d.add(details);
                sa.add(sarea);
                o.add(owner);
            }
            for (int i = 0; i < n; i++) {
                String sname = sn.get(i);
                String details = d.get(i);
                double sarea = sa.get(i);
                String owner = o.get(i);
                Stall s = new Stall(sname, details, sarea, owner);
                Thread t = new Thread(s);
                t.start();
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
