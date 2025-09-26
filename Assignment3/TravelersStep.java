import java.util.*;
public class TravelersStep {
 static int countWays(int n){
    if (n==0) return 1;
    if (n<0)return 0;
    return countWays(n-1)+countWays(n-2);

 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countWays(n));
       sc.close();
    }
    
}
