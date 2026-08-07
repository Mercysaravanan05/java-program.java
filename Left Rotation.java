import java.util.Scanner;

public class leftro {
    static void left(int b[]){
        int t=b[0];
        
       
        
        for(int i=0;i<b.length-1;i++){
            b[i]=b[i+1];
           
        }
        b[b.length-1]=t;
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
        left(b);
}
}
