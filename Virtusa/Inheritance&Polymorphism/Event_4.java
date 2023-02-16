
//Inheritance Q.4
import java.util.Scanner;

class Event {
    String name;
    String detail;
    String type;
    String ownerName;
    Event(){
        
    }
    Event(String name, String detail, String type, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
    }
}

class Exhibition extends Event {
    int noOfStalls;
    Exhibition() {
        super();
    }
    Exhibition(String name, String detail, String type, String ownerName, int noOfStalls) {
        super(name, detail, type, ownerName);
        this.noOfStalls = noOfStalls;
    }
    void showExData() {
        System.out.println(name+" "+detail+" "+type+" "+ownerName+" NoOfStalls: "+noOfStalls);
    }
}

class StageEvent extends Event {
    int noOfSeats;
    StageEvent() {
        super();
    }
    StageEvent(String name, String detail, String type, String ownerName, int noOfSeats) {
        super(name, detail, type, ownerName);
        this.noOfSeats = noOfSeats;
    }
    void showSeData() {
        System.out.println(name+" "+detail+" "+type+" "+ownerName+" NoOfSeats: "+noOfSeats);
    }
}

public class Event_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String data[] = sc.nextLine().trim().split(",");
        String name =  data[0];
        String detail = data[1];
        String type = data[2];
        String ownerName = data[3];
        int nos = Integer.parseInt(data[4]);
        switch (t) {
            case 1: {
                Exhibition ex = new Exhibition(name, detail, type, ownerName, nos);
                ex.showExData();
                // System.out.println(name+" "+detail+" "+type+" "+ownerName+" NoOfSeats: "+nos);
            }
                break;
            case 2: {
                StageEvent se = new StageEvent(name, detail, type, ownerName, nos);
                se.showSeData();
                // System.out.println(name + " " + detail + " " + type + " " + ownerName + " NoOfSeats: " + nos);
            }
                break;
            default: {
                System.out.println("Invalid Choice");
            }
                break;
        }
        sc.close();
    }
}
