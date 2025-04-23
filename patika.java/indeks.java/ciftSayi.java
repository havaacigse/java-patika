
import java.util.Scanner;
public class ciftSayi {
    public static void main(String[] args) {
        int total = 0 ; 
        int count = 0 ; 
         Scanner input = new Scanner(System.in);
         System.out.println("enter a number : ");
         int number = input.nextInt();


         for (int i = 0 ;i <= number ; i++){
            if((i % 3 == 0) && (i% 4 == 0)){
                 total += i ;
                 count++;
  
            }
         }

        if (count > 0){
            double average = total / count ;
            System.out.println("average : " + average);
        }
        else{
            System.out.println("no number found in this range that is divisible bty 3 and 4");
        }



    }
    
}
