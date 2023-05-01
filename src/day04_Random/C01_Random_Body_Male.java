package day04_Random;
import java.util.Random;
public class C01_Random_Body_Male {
    public static void main(String[] args) {
        String[] people = {"hydr talkc","Şamil Çay","Mehdi Agaverdiyev","İsa Avcı"};

        // Select a random person from the ArrayList
        Random rand = new Random();
        int index = rand.nextInt(4);
        String selectedPerson = people[index];
        System.out.println("Seçilen kişi: " +selectedPerson );
    }
}