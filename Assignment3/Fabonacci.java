import java.util.*;
public class Fabonacci {
    static int Fibinacci(int n){
        if (n<=1) return n;
        return Fibinacci(n-1)+Fibinacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Fibinacci(n));
        sc.close();
    }
}
