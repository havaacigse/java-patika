import java.util.Scanner;

public class sicaklik {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("hava sıcaklıgı girin : ");
     int havaSicakligi = input.nextInt();
     
     if (havaSicakligi < 5) {
     System.out.println("kayak yapabilirsiniz");
     } else if (havaSicakligi > 5 && havaSicakligi < 15) {
     System.out.println("sinemaya gidebilirsin");
     } else if (havaSicakligi > 15 && havaSicakligi < 25) {
     System.out.println("pikniğe gidebilirsin");
    } else if (havaSicakligi > 25) {
     System.out.println("yüzebilirsin");
    }
    
}
    
}
