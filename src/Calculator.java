import java.util.Scanner;
public class Calculator {

    static int sum(int a, int b){
        int result = a + b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times(int a, int b){
        int result = a *b;
        System.out.println("Çarpma : " + result);
        return result;
    }

    static int divided(int a,int b){

        if( b == 0){
            System.out.print("2. sayı 0'dan küçük olamaz!");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme: " + result);
        return result;
    }

    static  int power(int a, int b){
        int result = 1;
        for( int i = 1; i <= b ; i++){
            result *= a;
        }

        return result;
    }
    static int mod(int a, int b){
        int result = a % b;
        return result;
    }

    static int factorial(int a){
        int result = 1;
        for(int i = 1 ; i <= a; i++){
            result *= i;
        }
        System.out.println("Faktöriyel: " + result);
        return result;
    }
    static void calc(int a,int b){
        System.out.println("Çevre: " + ( 2 * (a +b)));
        System.out.println("Alan: " + ( a * b) );
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        int a = 0; // Faktöriyel hesaplaması için ayrı bir değişken tanımlanıyor

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();

            if (select == 0) {
                break;
            } else if (select == 6) {
                System.out.print("Sayıyı giriniz: ");
                a = input.nextInt();
                factorial(a); // Faktöriyel hesaplaması için ayrı değişkeni kullan
            } else {
                System.out.print("1. sayıyı giriniz: ");
                a = input.nextInt();

                System.out.print("2. sayıyı giriniz : ");
                int b = input.nextInt();

                switch (select) {
                    case 1:
                        sum(a, b);
                        break;
                    case 2:
                        minus(a, b);
                        break;
                    case 3:
                        times(a, b);
                        break;
                    case 4:
                        divided(a, b);
                        break;
                    case 5:
                        System.out.println("Üs hesabı " + power(a, b));
                        break;
                    case 7:
                        System.out.println("Mod: " + mod(a, b));
                        break;
                    case 8:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem girdiniz!");
                }
            }
        }
        System.out.println("Bye");
    }


}
