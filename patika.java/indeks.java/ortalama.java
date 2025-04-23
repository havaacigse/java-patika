
import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        int mat, turkce, beden;
     
     Scanner input = new Scanner(System.in);
     System.out.println("matematik notunu girin : ");
     mat = input.nextInt();
    
    System.out.println("turkce notunu girin :");
     turkce = input.nextInt();
     
     System.out.println("beden notunu girin : ");
     beden = input.nextInt();
     
     int toplam = (mat + turkce + beden);
     double sonuc = toplam / 6;
     System.out.println("ortalamanız : " + sonuc);
    } 
    
    
}
