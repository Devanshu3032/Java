import java.util.Scanner;

public class ascllvalue {
    public static void main(String[] args) {
      Scanner  sc = new Scanner(System.in);
      System.out.println("Enter a character:");
      char ch = sc.next().charAt(0);
      System.out.println(ch);
      int x = (int)ch;
      System.out.println(x);
    }
    
}
