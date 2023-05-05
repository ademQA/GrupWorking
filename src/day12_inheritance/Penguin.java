package day12_inheritance;

public class Penguin extends Bird {
    String renk;
   int kanatBoyu = 75;

    Penguin() {
        System.out.println("Penguenler ucamaz");
        this.yuzer();
        super.haraket();
        System.out.println(super.ayakSayisi);
        System.out.println(super.otermi);
        System.out.println(super.beslenirmi);

    }

    public  void yuzer() {
        System.out.println("yuzebilir");

    }
    public static void main(String[] args) {
       // System.out.println(kanatBoyu);

        Penguin penguin = new Penguin();
        penguin.yuzer();
        System.out.println(penguin.kanatBoyu);
        System.out.println(penguin.renk);
        System.out.println(penguin.ayakSayisi);

        penguin.haraket();
        penguin.ucar();
        penguin.yuzer();





    }
}
