import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x =  sc.nextInt();

        if(x%2==0){
            System.out.println("Input is even");
        }
        else{
            System.out.println("Input is odd");
        }
    }
    
}
