import java.util.Scanner;

class Event {
    String name;
    String detail;
    String type;
    String ownerName;
    double costPerDay;
    Event(String name, String detail, String type, String ownerName, double costPerDay) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
    }
}

class Exhibition extends Event {
    int noOfStall;
    Exhibition(String name, String detail, String type, String ownerName, double costPerDay, int noOfStall) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfStall = noOfStall;
    }
    void calculateGST(String d1, String d2) {
        int day1 = Integer.parseInt(d1.substring(0, 2));
        int day2 = Integer.parseInt(d2.substring(0, 2));
        double totalDay = day2 - day1;
        double gst = (totalDay * costPerDay * 5) / 100;
        System.out.println(gst);
    }
}

class StageEvent extends Event {
    int noOfSeats;
    StageEvent(String name, String detail, String type, String ownerName, double costPerDay, int noOfSeats) {
        super(name, detail, type, ownerName, costPerDay);
        this.noOfSeats = noOfSeats;
    }
    void calculateGST(String d1, String d2) {
        int day1 = Integer.parseInt(d1.substring(0, 2));
        int day2 = Integer.parseInt(d2.substring(0, 2));
        double totalDay = day2 - day1;
        double gst = (totalDay * costPerDay * 10) / 100;
        System.out.println(gst);
    }
}

class Event_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String detail = sc.nextLine();
        String type = sc.nextLine();
        String ownerName = sc.nextLine();
        double costPerDay = sc.nextDouble();
        int noOfS = sc.nextInt();
        sc.nextLine();
        String d1 = sc.nextLine();
        String d2 = sc.nextLine();
        switch (t) {
            case 1: {
                Exhibition e = new Exhibition(name, detail, type, ownerName, costPerDay, noOfS);
                e.calculateGST(d1, d2);
            }
            break;
            case 2: {
                StageEvent se = new StageEvent(name, detail, type, ownerName, costPerDay, noOfS);
                se.calculateGST(d1, d2);
            }
            break;
        }
        sc.close();
    }
}
