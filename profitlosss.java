import java.util.Scanner;

public class profitlosss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int  cp = sc.nextInt();
        System.out.println("Enter the Selling price:");
        int sp = sc.nextInt();
        if(sp>cp){
            System.out.println("Profit is "+(sp-cp));
    
        }
        else if(sp<cp) {
            System.out.println(" loss"+(cp-sp));
        }
        else{
            
            System.out.println("no profit no loss");
        }

    }
}

