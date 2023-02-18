import java.util.*;

class HallBooking implements Runnable {
    private String hallName;
    private Double cost;
    private Integer hallCapacity, seatsBooked;

    public HallBooking() {
    }

    public HallBooking(String hallName, Double cost, Integer hallCapacity, Integer seatsBooked) {
        this.hallName = hallName;
        this.cost = cost;
        this.hallCapacity = hallCapacity;
        this.seatsBooked = seatsBooked;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setSeatsBooked(Integer seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public void setHallCapacity(Integer hallCapacity) {
        this.hallCapacity = hallCapacity;
    }

    public String getHallName() {
        return hallName;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getHallCapacity() {
        return hallCapacity;
    }

    public Integer getSeatsBooked() {
        return seatsBooked;
    }

    public void run() {
        HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
        Integer sb = hb.getSeatsBooked();
        Double c = hb.getCost();
        boolean result = (sb * 100 > c);
        if (result) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }
}

class Example_2 {
    static int n = 0;
    static String hallName ;
    static Double cost ;
    static Integer hallCapacity ;
    static Integer seatsBooked;
    
    // static int i = 0;
    // static boolean check = false;
    // static ArrayList<String> hname = new ArrayList<>();
    // static ArrayList<Double> c = new ArrayList<>();
    // static ArrayList<Integer> hc = new ArrayList<>();
    // static ArrayList<Integer> sb = new ArrayList<>();

    // void setValue() {
    //     synchronized (this) {
    //         while (i < n) {
    //             if (check) {
    //                 try {
    //                     wait();
    //                 } catch (Exception e) {
    //                     e.printStackTrace();
    //                 }
    //             } else {
    //                 HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
    //                 hb.setHallName(hname.get(i));
    //                 hb.setCost(c.get(i));
    //                 hb.setHallCapacity(hc.get(i));
    //                 hb.setSeatsBooked(sb.get(i));
    //                 i++;
    //                 check = true;
    //                 notify();
    //             }
    //         }
    //     }
    // }

    // void getValue() {
    //     synchronized (this) {
    //     while (i < n) {
    //         if (check) {
    //             HallBooking hb = new HallBooking();
    //             Thread t = new Thread(hb);
    //             t.start();
    //             check = false;
    //             notify();
    //         } else {
    //             try {
    //                 wait();
    //             } catch (Exception e) {
    //                 e.printStackTrace();
    //             }
    //         }
    //     }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            hallName = sc.nextLine();
            cost = sc.nextDouble();
            hallCapacity = sc.nextInt();
            seatsBooked = sc.nextInt();
            HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
            Thread t = new Thread(hb);
            t.start();
            
            // hname.add(hallName);
            // c.add(cost);
            // hc.add(hallCapacity);
            // sb.add(seatsBooked);
        }

        // Example_2 obj = new Example_2();
        // Thread t1 = new Thread(new Runnable() {
        // public void run() {
        // obj.setValue();
        // }
        // });
        // Thread t2 = new Thread(new Runnable() {
        // public void run() {
        // obj.getValue();
        // }
        // });
        // t1.start();
        // t2.start();
        sc.close();
    }
}