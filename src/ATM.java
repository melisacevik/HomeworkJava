import java.util.Scanner;
//atm
public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int select;
        int balance = 1500;

        while( right > 0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if( userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba! Kodluyoruz bankasına hoşgeldiniz! ");

                do{
                    System.out.println("1) Para Yatırma\n" +
                            "2) Para Çekme\n" +
                            "3) Bakiye Sorgulama\n" +
                            "4) Çıkış Yap \n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch(select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            price = input.nextInt();
                            if( price > balance) {
                                System.out.println("Bakiye yetersiz!");
                            }else{
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere!");
                            break;
                        default:
                            System.out.println("Geçersiz seçim");
                            break;
                    }
                }while( select != 4);
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı veya şifre. ");
                if( right == 0 ){
                    System.out.print("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz.");
                }else{
                    System.out.print("Kalan hakkınız: " + right);
                }
            }
            System.out.println();
        }

    }
}
