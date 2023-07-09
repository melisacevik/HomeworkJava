
import java.util.Scanner;
public class Asal2 {

    static boolean isPrime(int number){
        if( number <= 1){
            return false;
        }

        for( int i = 2; i <= Math.sqrt(number) ; i++){
           if( number % i == 0){
               return false;
           }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int a = input.nextInt();

        if(isPrime(a)){
            System.out.println(a + " sayısı asaldır ! ");
        }else{
            System.out.println(a + " sayısı asal değildir ! ");
        }
    }

}
