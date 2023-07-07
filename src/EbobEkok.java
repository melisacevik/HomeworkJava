import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

       int ebob = 1;
       int ekok = 1;
       int i=1;
       int k=1;

       while( i <= n1 && i <= n2){

           if( n1 % i == 0 && n2 % i == 0){
               ebob = i;
           }
           i++;
       }
        System.out.println("Ebob : " + ebob);

       while( k <= ( n1 * n2)){
           if( k % n1 == 0 && k % n2 == 0){
               ekok = k;
           }
           k++;
       }
        System.out.println("Ekok : " + ekok);
    }
}
