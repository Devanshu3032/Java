import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
     
       
        int b = sc.nextInt(); 
       
        char op = sc.next().charAt(0); 
      
         if( op == '+') System.out.println(a +b);
         if( op == '-') System.out.println(a -b); 
         if( op == '*') System.out.println(a*b);
         if( op == '/') System.out.println(a/b);
        
    }
    
}
