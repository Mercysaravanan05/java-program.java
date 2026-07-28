public class patten {
    static void print(int i){
        System.out.print(i+" ");
        
    }
    static void line(int n){
        for(int i=n;i>=0;i--){
            print(i);
        }
    }
    public static void main(String[]args){
        int [] arr={12,13,14,15};
        for(int i=0;i<=3;i++){
            System.out.print("\nTest Case: ");
            print(arr[i]);
            System.out.print("\n");
        line(arr[i]);
        }
        
    }
}
