public class pat {
static void thr(int n){
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                
                System.out.print("*");
            }
         
        System.out.println("");
    }
    }
     public static void main(String[]args){
        int arr[]={3,5,8};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
             thr(arr[i]);


        }


     }
                
}
