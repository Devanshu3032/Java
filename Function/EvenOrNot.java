import java.util.Scanner;

public class EvenOrNot {

    public static void FindEven(int a ){
        if(a % 2 == 0){
            System.out.println("It is even ");
        }
        else{
            System.out.println("It is not even ");
        }

        return;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in) ;
        int input = sc.nextInt();
        FindEven(input);
    }
    
}
