package day12_inheritance;

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
