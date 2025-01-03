import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ennter the number:");
        int x = sc.nextInt();
        if(x%5==0){
            System.out.println("It is divisible by 5");
        }
        else{
            System.out.println("It is not divisible by 5");
        }
    }
    
}
