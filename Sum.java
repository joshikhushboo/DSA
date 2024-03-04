public class Sum {
    static int sum_(int n){
    
        if(n==0){
            return 0;
        }
        return n%10 + sum_(n/10);
        
        
    }
    public static void main(String[] args) {
        System.out.println(sum_(123));
        
    }
    
}

