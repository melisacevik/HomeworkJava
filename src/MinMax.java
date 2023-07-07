import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz ? : ");
        int n = input.nextInt();

        int num,min, max;

        System.out.print("1. sayıyı giriniz: ");
        num = input.nextInt();
        max = num;
        min = num;

        for ( int i= 2; i<= n; i++){

            System.out.print(i + ". sayıyı giriniz: ");
            num = input.nextInt();

            if( num > max){
                max = num;
            }
            if( num < min){
                min = num;
            }

        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
