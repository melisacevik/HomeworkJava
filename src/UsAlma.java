import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class UsAlma {

    static int power(int a, int b){
        int result = 1;

        if( b == 0){
            return 1;
        }else{
            for( int i = 1; i <= b; i++){
                result *= a;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int a = input.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();

        System.out.print("Sonuç: " + power(a,b));
    }
}
