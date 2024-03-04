public class Even_odd {
   
    static void PrintEven(int n){
        if(n==0){
            return;
        }
        PrintEven(n-1);
        if(n%2==0){
            System.out.print(n+" ");
        }
        
    }
    static void PrintOdd(int n){
        if(n==0){
            return;
        }
        PrintOdd(n-1);
        if(n%2!=0){
            System.out.print(n+" ");
        }
        
    }
    
    public static void main(String[] args){
        System.out.print("even Number:");
        PrintEven(10);
        System.out.println();
        System.out.print("Odd number:");
        PrintOdd(10);
        

        
    }
    
}
