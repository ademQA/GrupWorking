package day08;
//soru7) soru4)Bir Java programında, bir dizideki elemanları, sıralama algoritmalarını kullanmadan sıralamak için
// method kodunu yazınız? Dizi elemanlarını Kullanıcı Methodun içinde girsin ve sıralanmış halini method yazdırsın.
import java.util.Arrays;
import java.util.Scanner;
public class C07ArraySiralamaMethodum {
    public static void main(String[] args) {
        sortArray();
    }
    public static void sortArray() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();
      int[]arr=new int[n];

      for (int i = 0; i < n; i++) {
          System.out.print((i + 1) + ". sayıyı girin: ");
          arr[i] = scanner.nextInt();

      }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}