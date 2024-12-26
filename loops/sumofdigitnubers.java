import java.util.Scanner;

public class sumofdigitnubers {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      int n = sc.nextInt(); 
      int z;
      int sum = 0;
        while(n!=0){
        
       z = n%10;
       sum +=z;
       n/=10;
        }
        System.out.println(sum);
    }
}
