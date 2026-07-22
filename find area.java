import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
        float c=s.nextFloat();
        float s1=(a+b+c)/2;
        float area=(s1*(s1-a)*(s1-b)*(s1-c));
        System.out.println(Math.sqrt(area));
    }
}
