package day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        List <String> list=new ArrayList<>();
        list.add("java");
        list.add("candır");
        list.add("selenyum");
        list.add("Api");
        list.add("sql");
       // System.out.println(list);
        Scanner scanner=new Scanner(System.in);
        System.out.println("harf giriniz :");
        String harf=scanner.next();
        System.out.println(istenmeyen(list, harf));
    }
    public static List<String>istenmeyen(List<String> silinecekList, String istenmeyenHarf){
        for (int i = silinecekList.size()-1; i >=0 ; i--) {

            if (silinecekList.get(i).contains(istenmeyenHarf.toLowerCase()) || silinecekList.get(i).contains(istenmeyenHarf.toUpperCase()))
            { silinecekList.remove(i);
          // silinecekList.add("");
            }


        }
        return silinecekList;
    }
}
