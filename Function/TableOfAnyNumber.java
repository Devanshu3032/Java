import java.util.Scanner;

public class TableOfAnyNumber {
    public static void NumberTable(int a ){
        int j =1 ;
        for (int i = a; i < a*10+1 ;  i += a) {
          
           System.out.println(a*j);
            j++;

            
        }
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int input = sc.nextInt();
        NumberTable(input);
    }
    
}
