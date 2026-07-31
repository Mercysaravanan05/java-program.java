import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        long a=s.nextLong();
        long o=0,t=0,th=0,f=0,fi=0,se=0,sx=0,e=0,n=0,z=0;
        while(a>0){
            long b=a%10;
            if(b==0){
                z++;
                
            }
            else if(b==1){
                o++;
                
            }
            else if(b==2){
                t++;
                
            }
            else if(b==3){
                th++;
                
            }
            else if(b==4){
                f++;
               
            }
            else if(b==5){
                fi++;
                
            }
            else if(b==6){
                sx++;
                
            }
            if(b==7){
                se++;
                
            }
            if(b==8){
                e++;
                
            }
            if(b==9){
                n++;
               
            }
            a=a/10;
        }
        System.out.println("0 : "+z);
        System.out.println("1 : "+o);
        System.out.println("2 : "+t);
        System.out.println("3 : "+th);
        System.out.println("4 : "+f);
        System.out.println("5 : "+fi);
        System.out.println("6 : "+sx);
        System.out.println("7 : "+se);
        System.out.println("8 : "+e);
        System.out.println("9 : "+n);
    }
    
}
