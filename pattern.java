public class fun {
    static void condition1(int a){
        for(int i=1;i<=a;i++){
            for(int j=0;j<=a;j++){
                System.out.print("*");
            }
               System.out.println("");
             

        }
    }
    static void condition2(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print(i);
            }
               System.out.println("");
             

        }
    }
    static void condition3(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
               System.out.println("");
             

        }
    }
    static void condition4(int a){
        for(int i=0;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
               System.out.println("");
             

        }
    }
    public static void main(String[]args){
        int arr[]={4,6,9};
        for(int i=0;i<3;i++){
            System.out.println("Test case "+(i+1 )+" : "+arr[i]);
            
            System.out.println("");
             condition1(arr[i]);
             System.out.println("");
        }
   
        int arr2[]={4,6,9};
        for(int i=0;i<3;i++){
            System.out.println("Test case "+(i+1 )+" : "+arr2[i]);
            
            System.out.println("");
             condition2(arr2[i]);
             System.out.println("");
        }
         int arr3[]={4,6,9};
        for(int i=0;i<3;i++){
            System.out.println("Test case "+(i+1 )+ " : "+arr3[i]);
            
            System.out.println("");
             condition3(arr3[i]);
             System.out.println("");
        }
         int arr4[]={4,6,9};
        for(int i=0;i<3;i++){
            System.out.println("Test case "+(i+1 )+" : "+arr4[i]);
            
            System.out.println("");
             condition4(arr4[i]);
             System.out.println("");
        }
    }
    }
   

