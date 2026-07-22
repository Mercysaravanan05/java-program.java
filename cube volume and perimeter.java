import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float c=s.nextFloat();
        float s1=a*b*c;
        float s2=4*(a+b+c);
        System.out.printf("%f\n%f",s1,s2);
        
    }
}
