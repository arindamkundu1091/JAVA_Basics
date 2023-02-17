import java.util.Scanner;

interface Airfare {
    Double calculateAmount();
}

class AirIndia implements Airfare {
    int hours;
    double costPerHour;
    AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    public Double calculateAmount() {
        double fare = hours * costPerHour;
        System.out.printf("%.2f", fare);
        return fare;
    }
}

class KingFisher implements Airfare {
    int hours;
    double costPerHour;
    KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    public Double calculateAmount() {
        double fare = 4 * hours * costPerHour;
        System.out.printf("%.2f", fare);
        return fare;
    }
}

class Indigo implements Airfare {
    int hours;
    double costPerHour;
    Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }
    public Double calculateAmount() {
        double fare = 8 * hours * costPerHour;
        System.out.printf("%.2f", fare);
        return fare;
    }
}

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int hour = sc.nextInt();
        double costPerHour = sc.nextDouble();
        switch (t) {
            case 1: {
                AirIndia ai = new AirIndia(hour, costPerHour);
                ai.calculateAmount();
            }
                break;
            case 2: {
                KingFisher kf = new KingFisher(hour, costPerHour);
                kf.calculateAmount();
            }
                break;
            case 3: {
                Indigo ind = new Indigo(hour, costPerHour);
                ind.calculateAmount();
            }
        }
        sc.close();
    }
}
