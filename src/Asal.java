public class Asal {
    public static void main(String[] args) {

        int sayac = 0;
        boolean isPrime = false;

        for(int sayi=2;sayi<=100;sayi++)
        {
            isPrime = true;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime == true)
            {
                System.out.print(sayi+",");
                sayac++;
            }
        }


    }

}
