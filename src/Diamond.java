import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        int ortancaSayi = (n + 1) / 2;


        for( int i= 1; i <= ortancaSayi ; i++){
            for(int j = 1; j <= ortancaSayi - i ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = ortancaSayi - 1; i >= 1; i--){
            for( int j= 1; j <= ortancaSayi - i; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2 * i -1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
