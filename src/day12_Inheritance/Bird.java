package day12_Inheritance;

public class Bird extends Animal {
    Bird(){
        System.out.println("kuşlar öter");
    }
   public Bird(boolean gagalimi){

    }
    static boolean otermi=true;
     int ayakSayisi=2;
    public void ucar() {
        System.out.println("ucabilir");
    }
}
