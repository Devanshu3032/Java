import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int x = sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int y  = sc.nextInt();
      

        if((x*y)>(2*(x+y))){
            System.out.println("Aera is greater");
        }
        else{
            System.out.println("perimeter is greater");
        }
    }
    
}
