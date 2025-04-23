import java.util.Scanner;

public class indeks {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 

         double b, k, indeks;
         System.out.println("boy girin : ");
          b = input.nextDouble();

          System.out.println("kilo girin :");
          k = input.nextDouble();

          indeks = k / (b * b);
          System.out.println("indeks: " + indeks);
    }
    
}
