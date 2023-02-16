// You are using Java
import java.util.Scanner;

interface i{
    void correct(String str);
}

class Ques_4 implements i{
    public void correct(String s){
        char[] ch = s.toCharArray();
        String r1="";
        String r2="";
        for(int i=0;i<ch.length;i++){
            if(ch[i] >='A' && ch[i]<='Z'){
                r2 = r2 + ch[i];
            }
            else{
                r1 = r1 + ch[i];
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