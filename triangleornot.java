import java.util.Scanner;

public class triangleornot {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int  a = sc.nextInt();
        Scanner sch = new Scanner(System.in);
        System.out.println("Enter second side:");
        int  b = sch.nextInt();
        Scanner scd = new Scanner(System.in);
        System.out.println("Enter thied side:");
        int  c = scd.nextInt();
    if((a+b)>c && b+c>a && a+c>b){
        System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
    }
    

