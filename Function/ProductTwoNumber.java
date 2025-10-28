import java.util.*;;
public class ProductTwoNumber {
    public static void Product(float a , float b){
       float mul = a*b ; 
       System.out.println(mul);
       return ; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float a  = sc.nextFloat();
        float  b = sc.nextFloat();
        Product(a,b);
    }
}
