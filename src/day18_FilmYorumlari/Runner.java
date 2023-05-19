package day18_FilmYorumlari;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Film film1 = new Film("Titanic", "James Cameron",
                new ArrayList < String > (Arrays.asList("Leonardo DiCaprio", "Kate Winslet")));


        
        Yorum yorum1 = new Yorum("Great movie!", "Irvine Rolf", 4.5);
        Yorum yorum2 = new Yorum("Highly recommended!", "Ashkii Karlheinz", 4.5);
        Yorum yorum3 = new Yorum("A classic that never gets old.", "Nele Athol", 4.0);
        Yorum yorum4 = new Yorum("Great movie!", "Cipactli Anselma", 4.0);
        Yorum yorum5 = new Yorum("Highly recommended!", "Martin Nadine", 4.0);

        film1.yorumEkle(yorum1);
        film1.yorumEkle(yorum2);
        film1.yorumEkle(yorum3);
        film1.yorumEkle(yorum4);

        System.out.println("\nYorumlar '" + film1.getAd() + "':");
        for (Yorum review: film1.getYorumlar()) {
            System.out.println(review.getYorumMetni() + " by " + review.getYorumYapaninIsmi() + " - " + review.getDerecelendirmePuani());
        }

        Film film2 = new Film("The Godfather", "Francis Ford Coppola",
                new ArrayList < String > (Arrays.asList("Marlon Brando", "Al Pacino", "James Caan")));

        film2.yorumEkle(yorum1);
        film2.yorumEkle(yorum4);
        film2.yorumEkle(yorum5);

        // display all the reviews for the movie
        System.out.println("\nReviews for '" + film2.getAd() + "':");
        for (Yorum review: film2.getYorumlar()) {
            System.out.println(review.getYorumMetni() + " by " + review.getYorumYapaninIsmi() + " - " + review.getDerecelendirmePuani());
        }
    }
}
