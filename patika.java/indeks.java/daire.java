import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double alan ; 
       
         int r;
         double pi = 3.14;
    
         Scanner input = new Scanner(System.in);
         System.out.println("yarıcapı girin :");

         r = input.nextInt();

         alan = pi * r * r;
         double cevre = 2 * pi * r;

         System.out.println("alan : " + alan);
         System.out.println("cevre : " + cevre);
    }
    
}
