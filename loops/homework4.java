import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the Nth term :");
        int n = sc.nextInt();
        int a = 3;
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
            a*=4;
            
        }
    }
    
}
