import java.util.*;
public class NameFunction {
    public static void NameReturn(String name1){
        System.out.println(name1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        NameReturn(name); // call the function 
    }
}