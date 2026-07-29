public class pat {
static void se(int n){
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
public static void main(String[]args){
        int arr[]={3,5,8};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
             se(arr[i]);


        }


     }
                
}
