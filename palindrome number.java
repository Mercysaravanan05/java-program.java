import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        
        long d=0,p=a;
        while(a!=0){
            long b=a%10;
            d=d*10+b;
            a=a/10;
        }
          
        if(d==p){
        System.out.print("Yes");
        }
        else{
            System.out.print("No");
            
        }
    }
}
