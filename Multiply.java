import java.util.Scanner;
public class Multiply{
    public static void main(String[]arg){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            int j = a*i;
                System.out.println(a+"x"+i+"="+j);
                
            
            
        }
    }
}