package day08;
//Soru2)Bir Java programında, iki boyutlu bir dizideki en büyük elemanı bulmak için nasıl bir kod yazarsınız?
public class C05_IkiboyutluArraydeMax {
    public static void main(String[] args) {
        int[][] array = {
                {1, 21, 3},
                {4, 12, 64},
                {17, 8, 9}
        };

        int max = array[0][0];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("En büyük eleman: " + max);
    }
}
