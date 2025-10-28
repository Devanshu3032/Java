import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void Prime(int a ){
        if(a <= 1){
            System.out.println("It is not prime number ");
        }
        else{
            for (int i = 2; i < a; i++) {
                if( a%i == 0){
                    System.out.println("It is not prime ");
                    break;
                }
                else{
                    System.out.println("It is prime number ");
                    break;
                }
            }
        }

        return;
    }
   public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Prime(input);
   } 
}
