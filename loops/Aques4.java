import java.util.Scanner;

public class Aques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
     System.out.println("Enter the String:");
        String str = sc.nextLine();


        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
    
}
