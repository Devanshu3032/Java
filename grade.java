import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parcentage:");
        int  a = sc.nextInt();
        if(a>80 )
        System.out.println("very good");
        else if(a>60  )
        System.out.println("Good");
        else if(a>40 )
        System.out.println("Average ");
        else if (a<=40)
        System.out.println("Fail");
    }
    
}
