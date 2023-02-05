import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class Clock
{
    static String getDate()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
         String Date = dtf.format(now);
         return Date;
    }

    static String getTime() 
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String Time = dtf.format(now);
        return Time;
    }

    static String alarmClock()
    {
        String Alarm = ".", setAlarm, clock;
        Scanner sc = new Scanner(System.in);
        clock = getTime();
        System.out.println(clock);
        System.out.println("Enter your alaram: ");
        setAlarm = sc.nextLine();

            try{
                outer:for(; ;) {
                    clock = getTime();
                    if(clock.equals(setAlarm)){
                        Alarm = "Wake up! It is "+clock;
                        break outer;
                    }
                    // Thread.sleep(1000);
                }
            } catch(Exception e) {
                System.out.println(e);
            }

            return Alarm;
    }

    public static void main(String[] args) 
    {
        // System.out.println( getDate());
        // System.out.println( getTime());
        System.out.println(alarmClock());
    }
}