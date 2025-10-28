import java.util.*;
public class AddTwoNumber {
    public static void Sum(int a , int b ){
        int sum = a + b ; 
        System.out.println(sum);
        return ;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in ); 
       int c  = sc.nextInt();
       int d = sc.nextInt();
        Sum(c,d);
    }
    
}
