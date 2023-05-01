package day08;
//Soru3)Bir Java programında, bir dizi içindeki elemanların her bir çifti için çarpımın
// en büyük olduğu çiftleri bulmak için nasıl bir kod yazarsınız?
public class C06_ArrayEnbuyukIkiliCarpim {

        public static void main(String[] args) {

            int[] arr = {-4, 7, 3, -9, 5};
            int maxProduct = 0;
            int maxIndex1 = -1, maxIndex2 = -1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    int ikiliCarpim = arr[i] * arr[j];
                    if (ikiliCarpim > maxProduct) {
                        maxProduct = ikiliCarpim;
                        maxIndex1 = i;
                        maxIndex2 = j;
                    }
                }
            }

            System.out.println("Max Product Pair: [" + arr[maxIndex1] + ", " + arr[maxIndex2] + "]");
        }
    }

