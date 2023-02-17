import java.util.ArrayList;
import java.util.Scanner;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> chola = new ArrayList<>();
        ArrayList<String> chera = new ArrayList<>();
        ArrayList<String> pallava = new ArrayList<>();
        ArrayList<String> pandya = new ArrayList<>();
        ArrayList<String> renounce = new ArrayList<>();

        for(int i = 0;i< n ;i++){
            String s = sc.next();
            int x =sc.nextInt();
            int y =sc.nextInt();
            if(x>0 && y>0){
                chola.add(s);
            }
            else if(x<0 && y>0){
                chera.add(s);
            }
            else if(x<0 && y<0){
                pallava.add(s);
            }
            else if(x>0 && y<0){
                pandya.add(s);
            }
            else if(x==0 && y==0){
                renounce.add(s);
            }
        }
        System.out.println("chola\n"+chola+
        "\nchera\n"+chera+"\npallava\n"+pallava+
        "\npandya\n"+pandya+"\nrenounce\n"+renounce);
    }
}
