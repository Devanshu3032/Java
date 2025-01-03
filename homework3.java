import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n =  sc.nextInt();
        if(n>9999 && n<100000)
        System.out.println("Number is five digit");
        else
        System.out.println("Number is not five digit");

    }
    
}
