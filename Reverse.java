public class Reverse {
    static int Reverse_number(int n,int rev){
        if(n==0){
            return rev;
        }
        else{
            int digit=n%10;
            rev = rev*10+digit;
            return Reverse_number(n/10, rev);
        }
    }
    public static void main(String[] args) {
        System.out.println(Reverse_number(12345, 0));
        
    }
    
}
