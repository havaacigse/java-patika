package ilkproje;

import java.util.Scanner;

public class ilk {
    public static void main(String[] args) {
         // UCAK BİLETİ FİYATI HESAPLAMA
         Scanner input = new Scanner(System.in);
       System.out.println("Enter the distance you will travel in km : ");
         double mesafe = input.nextDouble();
          
          System.out.println("enter your age : ");
          int yas = input.nextInt();
        
         System.out.println("Select travel type: (1: one way, 2: round trip))");
          System.out.println("Make your choice : ( 1 or 2 )");
          // int secim;
          int secim = input.nextInt(); // kullanıcıdan giris aldım
          
          if (mesafe <= 0 || yas <= 0 || (secim != 1 && secim != 2)) {
          System.out.println("ınvalid data entered!");
         return; // programı sonlandır hata oldugu icin
          }
          
          double toplamFiyat = mesafe * 0.10;
          
          if (yas < 12) {
          toplamFiyat *= 0.5;
          } else if (yas > 12 && yas < 24) {
          toplamFiyat *= 0.9;
         } else if (yas > 65) {
          toplamFiyat *= 0.7;
          }
         
          if (secim == 2) {
          toplamFiyat *= 0.8; // %20 indirim
          toplamFiyat *= 2;
        }
       System.out.println("Total Ticket Price :" + toplamFiyat);
         
    }
}
