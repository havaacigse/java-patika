import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
         Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : ");
         tutar = input.nextDouble();
         
         kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar * kdvTutar;
         
         System.out.println("kdv'siz tutar :" + tutar);
         System.out.println("kdv oranı : " + kdvOran);
         System.out.println("kdv tutarı :  " + kdvTutar);
         System.out.println("kdv'li tutar :" + kdvliTutar);
         
        
    }
    
}
