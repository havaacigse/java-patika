
import java.util.Scanner;
public class patika {
    public static void main(String[] args) {
        
          int a, e, d, m, p;
          double af = 2.14, ef = 3.67, df = 1.11, mf = 0.95, pf = 5.00;
          double total;
           
          Scanner input = new Scanner(System.in);
          System.out.println("armut kg girin : ");
           a = input.nextInt();
            
           System.out.println("elma kg girin :  ");
           e = input.nextInt();

          System.out.println("domates kg girin :");
          d = input.nextInt();

          System.out.println("muz kg girin:");
          m = input.nextInt();

          System.out.println("patlıcan kg girin :");
          p = input.nextInt();

            
          total = (a * af) + (e * ef) + (d*df) + (m*mf) + (p*pf) ;
          System.out.println("toplam fiyat :" + total);
       
    }
    
}
