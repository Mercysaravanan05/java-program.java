import java.util.Scanner;
public class Literals {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        float r=s.nextFloat();
        float l=s.nextFloat(),w=s.nextFloat();
        float b=s.nextFloat(),h=s.nextFloat();
        System.out.printf("Area of a Cicle: %f\n",3.141549*(r*r));
        System.out.printf("Area of a Rectangle: %.1f\n",l*w);
        System.out.printf("Area of a Triangle: %.1f",(b/2)*h);
    }
}
