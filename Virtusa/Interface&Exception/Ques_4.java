// You are using Java
import java.util.Scanner;

interface i{
    void correct(String s);
}

class Ques_4 implements i{
    public void correct(String s){
        String r1="";
        String r2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                r2 = r2 + s.charAt(i);
            }
            else{
                r1 = r1 + s.charAt(i);
            }
        }
        System.out.print(r1+r2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Ques_4 m = new Ques_4();
        m.correct(line);
        sc.close();
    }
}