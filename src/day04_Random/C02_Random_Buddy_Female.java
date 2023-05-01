package day04_Random;

import java.util.Random;

public class C02_Random_Buddy_Female {
    public static void main(String[] args) {


    String[] people = {"Yasemin TAHTALI",
                       "Aysel Ahmadli",  "Nimet Kurtaran"};

    Random rand = new Random();
    int index = rand.nextInt(4);
    String selectedPerson = people[index];
    System.out.println("Seçilen kişi: " +selectedPerson );
}
}
