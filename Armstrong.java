public class Armstrong {
    
    static boolean isArmstrong(int n,int original,int length,int sum){
        
        if(n==0){
            return sum==original;
        }
        else{
        int temp=n%10;
        sum+=Math.pow(temp,length);
        return isArmstrong(n/10,original,length,sum);
        }
    }
    public static void main(String[] args) {
       boolean armstrong = isArmstrong(1634,1634,4, 0);
        System.out.println(armstrong);
        
    }
    
}
