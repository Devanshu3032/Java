import java.util.Scanner;

public class greatestnumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int  a = sc.nextInt();
        Scanner sch = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int  b = sch.nextInt(); 
        Scanner scd = new Scanner(System.in);
        System.out.println("Enter the third number:");
        int  c = scd.nextInt();
        if(a>=c && a>=b){
            System.out.println(a);
        }
        else if 
        (b>=a && b>=c)System.out.println(b);

        else System.out.println(c);

    }
    
}
