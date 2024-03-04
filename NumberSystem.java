public class NumberSystem {
    static String Convert(int n){
        if(n==0){
            return "0";
        }
        else if(n==1){
            return "1";
        }
        else{
            int quo=n/2;
            int rem=n%2;
            return Convert(quo)+rem;

        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(Convert(n));
        
    }
    
}
