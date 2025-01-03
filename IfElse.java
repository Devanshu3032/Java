import java.util.*;
public class IfElse{
    public static void main (String []arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<20 && n>=1 ){
            if(n%2!=0){
                System.out.println("Weird");
            }
            else if(n%2==0 && n<6 ){
                System.out.println("Not Weird");
            }
            else{
                System.out.println("Weird");
            }
        }
        else{
            System.out.println("Not Weird");
        }
    }
}