import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int  a = sc.nextInt();
        Scanner sch = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int  b = sch.nextInt(); 
        Scanner scd = new Scanner(System.in);
        System.out.println("Enter the third number:");
        int  c = scd.nextInt();
         
        if(a>b){
            if(a>c)
            System.out.println(a+"is largest");
            else{
                System.out.println(c+"is largest");
            }
        }
            else if(b>a){
               if(b>c) System.out.println(b+"is largest");
               else System.out.println(c+"is largest");
            }
            else if(c>a){
                if(c>b)System.out.println(c+"is largest");
                else System.out.println(b+"is largest");
            }

        

    }

    }
    

