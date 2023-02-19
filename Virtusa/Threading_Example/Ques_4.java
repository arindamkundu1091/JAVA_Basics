import java.util.*;

class HallBooking implements Runnable {
    private String hallName;
    private Double cost;
    private Integer hallCapacity, seatsBooked;

    public HallBooking(String hallName, Double cost, Integer hallCapacity, Integer seatsBooked) {
        this.hallName = hallName;
        this.cost = cost;
        this.hallCapacity = hallCapacity;
        this.seatsBooked = seatsBooked;
    }

    public Double getCost() {
        return cost;
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
    public static void main(String[] args) {
        try {
            ArrayList<String> hname = new ArrayList<>();
            ArrayList<Double> c = new ArrayList<>();
            ArrayList<Integer> hc = new ArrayList<>();
            ArrayList<Integer> sb = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                sc.nextLine();
                String hallName = sc.nextLine();
                Double cost = sc.nextDouble();
                Integer hallCapacity = sc.nextInt();
                Integer seatsBooked = sc.nextInt();
                hname.add(hallName);
                c.add(cost);
                hc.add(hallCapacity);
                sb.add(seatsBooked);
            }
            for (int i = 0; i < n; i++) {
                String hallName = hname.get(i);
                Double cost = c.get(i);
                Integer hallCapacity = hc.get(i);
                Integer seatsBooked = sb.get(i);
                HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
                Thread t = new Thread(hb);
                t.start();
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}