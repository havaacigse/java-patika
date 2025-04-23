
import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus; 
        
         Scanner input = new Scanner(System.in);
         System.out.print("kenar1 i girin : ");
         kenar1 = input.nextInt();
        
        System.out.print("kenar2 girin : ");
        kenar2 = input.nextInt(); 
        
        
         hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2)); 
         System.out.println("hipotenus :" + hipotenus);
    }
}
