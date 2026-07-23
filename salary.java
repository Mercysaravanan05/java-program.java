import java.util.Scanner;
public class Literals {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=s.nextInt();
        int c=s.nextInt();
        float salary=b*c;
        System.out.printf("Employee's Id:%s\n",a);
        System.out.printf("Salary:%.2f",salary);
    }
}
