import java.util.*;

class HallBooking implements Runnable{
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
    public String getHallName() {
        return hallName;
    }
    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
    public Double getCost() {
        return cost;
    }
    public void setCost(Double cost) {
        this.cost = cost;
    }
    public Integer getHallCapacity() {
        return hallCapacity;
    }
    public void setHallCapacity(Integer hallCapacity) {
        this.hallCapacity = hallCapacity;
    }
    public Integer getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(Integer seatsBooked) {
        this.seatsBooked = seatsBooked;
    }
    public void run(){
        HallBooking hb = new HallBooking();
        boolean result = (hb.getSeatsBooked() * 100 > hb.getCost());
        if (result) {
            System.out.println("Profit");
        } else {
            System.out.println("Loss");
        }
    }
}

class Example_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String hallName = sc.nextLine();
            Double cost = sc.nextDouble();
            Integer hallCapacity = sc.nextInt();
            Integer seatsBooked = sc.nextInt();
            HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
            hb.setSeatsBooked(seatsBooked);
            hb.setCost(cost);
            Thread t = new Thread(hb);
            t.start();
        }
    }
}