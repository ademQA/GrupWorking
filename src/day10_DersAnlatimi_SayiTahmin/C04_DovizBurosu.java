package day10_DersAnlatimi_SayiTahmin;
//Döviz almak ya da satmak isteyen kullanıcıyı once aşağıdaki gibi bir menuyle karşılayıp kullanıcının secim yapıp
// işlemlerini girisMenu() metodu ile, doviz alımı için dovizAlim() metodu ile, döviz satışı için dovizSatıs() metodu ile
// toplamda 3 method kullanarak yapınız.
//***********QA DOVİZ***************
//         Alış              Satış
//Dolar:   20.67              19.9
//Euro:    20.67              21.27
//--------------------------------------
//Doviz Alımı Yapmak İçin (1)'e Basınız :
//Doviz Satışı Yapmak İçin (2)'e Basınız :
import java.util.Scanner;
public class C04_DovizBurosu {
  static   Scanner scanner = new Scanner(System.in);
  static  double kurDolarAlıs = 20.67;
  static     double kurEuroAlıs = 22.07;
  static  double kurDolarsatıs = 19.90;
   static double kurEuroSatıs = 21.27;
        public static void main(String[] args) {
        girisMenu();
        }
        public static void girisMenu(){
            System.out.println("***********QA DOVİZ***************");
            System.out.println("         Alış              Satış");
            System.out.println("Dolar:   "+  kurDolarAlıs+"              "+kurDolarsatıs);
            System.out.println("Euro:    "   +kurDolarAlıs+"              "+kurEuroSatıs);
            System.out.println("--------------------------------------");
            System.out.println("Doviz Alımı Yapmak İçin (1)'e Basınız : \n" +
                    "Doviz Satışı Yapmak İçin (2)'e Basınız :  ");
            int secim=scanner.nextInt();

            if (secim==1){
                dovizAlim();
            } else if (secim==2) {
                dovizSatıs();
            }
            else {
                System.out.println("Hatalı Secim Yaptınız...Lütfen Tekrar Deneyiniz...");
                girisMenu();
            }
        }
        public static void dovizAlim(){
            System.out.println("Dolar almak için(D)'ye basınız:  \nEuro almak için (E)'ye basınız: ");
           Character dovizSecim=scanner.next().toUpperCase().charAt(0);
            if (dovizSecim.equals('D')) {
                System.out.println("Lütfen TL miktarınızı giriniz: ");
                int tl = scanner.nextInt();

                double dolar = tl / kurDolarAlıs;
                System.out.println(tl + " TL ile  " + dolar + "  Dolar alabilirsiniz...");
            }
            else  if (dovizSecim.equals('E')) {
                System.out.println("lütfen TL miktarınızı giriniz: ");
                int tl = scanner.nextInt();

                double euro = tl / kurEuroAlıs;
                System.out.println(tl + " TL ile  " + euro + "  Euro alabilirsiniz...");
            }
            else{
                System.out.println("Hatalı Secim Yaptınız...");
                dovizAlim();
            }
        }
        public static void dovizSatıs(){
            System.out.println("Dolar satmak için(D)'ye \neuro satmak için (E)'ye basınız: ");
            Character dovizSecim=scanner.next().toUpperCase().charAt(0);
            if (dovizSecim.equals('D')) {
                System.out.println("Lütfen Dolar miktarınızı giriniz: ");
                int dolar = scanner.nextInt();

                double tl = dolar *kurDolarsatıs;
                System.out.println(dolar + " Dolar " + tl + " Tl eder...");
            }
            else  if (dovizSecim.equals('E')) {
                System.out.println("Lütfen Euro miktarınızı giriniz: ");
                int euro = scanner.nextInt();

                double tl = euro * kurEuroSatıs;
                System.out.println(euro + " Euro  " + tl + "  TL eder...");
            }
            else{
                System.out.println("Hatalı Secim Yaptınız...");
                dovizSatıs();
            }
        }
    }

