import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
      int n[]=new int[b];
      for(int i=0;i<b;i++){
          n[i]=s.nextInt();
      }
        for (int i = b-1; i>=0 ; i--) {
            
            System.out.print(n[i] + " ");
        }
        
        
    }
}
