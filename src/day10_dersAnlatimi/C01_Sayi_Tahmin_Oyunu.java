package day10_dersAnlatimi;
import java.util.Scanner;
import java.util.Random;
public class C01_Sayi_Tahmin_Oyunu {
    //1 ile 100 arasında rastgele üretilen sayının kullanıcının kaçıncı denemede tahmin ettiğini hesaplayan,
    // ayrıca kullanıcıyı "daha büyük sayı giriniz","daha küçük sayı giriniz" şeklinde  yönlendiren programı
    // metot kullanarak yazınız.

    public static void main(String[] args) {
        sayiTahminOyunu();

        }
        public static void sayiTahminOyunu(){
            Random random=new Random();
            int randomSayi= random.nextInt(101);  // 1-100 arası rastgele sayı oluşturulur
            int tahmin;
            int kacinciDefa = 0;

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("Lütfen 1-100 arasında bir sayı girin: ");
                tahmin = scanner.nextInt();
                kacinciDefa++;

                if (tahmin == randomSayi) {
                    System.out.println("Tebrikler! Sayıyı " + kacinciDefa + ". denemede buldunuz.");
                } else if (tahmin < randomSayi) {
                    System.out.println("Daha büyük bir sayı girin.");
                } else {
                    System.out.println("Daha küçük bir sayı girin.");
                }
            } while (tahmin != randomSayi);
        }
    }

