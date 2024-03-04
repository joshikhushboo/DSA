public class Palindrome {
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
    static boolean ispalindrome(int n){
        return n==Reverse_number(n, 0);
    }
    public static void main(String[] args) {
        if(ispalindrome(123)){
            System.out.println("palindrome number");

        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
    
}
