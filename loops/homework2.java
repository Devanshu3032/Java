import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of term:");
        int n = sc.nextInt(); 
        for( int i= 1;i<=n;i++){
            if( i%3 == 0 || i%5 == 0)System.out.println(i);
    }
    }
    
}
