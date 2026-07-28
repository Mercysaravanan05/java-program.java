public class nestedloop {
    static void print(int i,int j){
        System.out.print("("+i+","+j+")");
        
    }
    static void condition(int a){
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                print(i,j);
            }
            System.out.println("");
        }
    }
    public static void main(String[]args){
        int arr[]={4,6,8};
        for(int i=0;i<3;i++){
            System.out.println("Test case: "+arr[i]);
            
            System.out.println("");
             condition(arr[i]);
             System.out.println("");
        }
       
    }
    
}
