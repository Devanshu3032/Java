import java.util.Scanner;

    public class primenumber {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int  n = sc.nextInt();
            for (int i = 1; i < n-1; i++) {
                if(n%2==0) {
                    System.out.println("prime Number");
                    break;
                }
                
            }
        }
        
    }
    
    

