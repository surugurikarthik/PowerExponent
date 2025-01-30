
import java.util.Scanner;

public class Powerexponent {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("");
        double power = sc.nextInt();
        System.out.print("");
        double exponent = sc.nextInt();
        double result = Math.pow(power,exponent);
        System.out.println(result);
        sc.close();

            
    }
    
}
