

public class Name{
    static void Names(int n){
        if(n==0){
            return;
        }
        Names(n-1);
        System.out.println("khushboo");
    }
    public static void main(String[] args) {
       Names(5);
        
    }
    
}
