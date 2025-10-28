import java.util.*;
public class FactorialOfNumber {

    

public static void FactorialOfNumber(int a ) {
    if(a > 0){
    for (int i = a -1 ; i > 0; i--) {
        int total = a *i ;
        System.out.println("Factorial of " + a + " is : " + total);
         return ;
                    }
         }
    else if(a == 0 ){
        System.out.println(1);
    }
    else{
        System.out.println("There is no factorial for negative number ");
    }
}

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int number = sc.nextInt();
      FactorialOfNumber(number); 
    }
    
    }

