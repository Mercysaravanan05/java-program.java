import java.util.*;
public class Arr {
    static void right(int b[]){
        int t=b[b.length-1];


        
       
        
        for(int i=b.length-1;i>0;i--){
            b[i]=b[i-1];
           
        }
        b[0]=t;
        for(int i=0;i<b.length;i++){
        System.out.print(b[i]);
        }
       
    }
  public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
        }
        right(b);
    }   
}
