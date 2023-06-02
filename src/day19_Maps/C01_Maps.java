package day19_Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_Maps {
    public static void main(String[] args) {
        // IT personel map olusturun
        //Tc no-isim-soyisim-gorev-maaş-calisma yili bilgilerini icersin
        //ITPersonel map'inde maaslari artirin
        //Görev suresi 5 yıl ve uzeri olanların  %20 zam
        //5 yıla kadar olanlara %10 zam
        //Tecrübesi olmayanlara zam yapılmasın
        Map<String,String>ITPersonel=new HashMap<>();
        ITPersonel.put("12345678901","Adem-Tekin-QA Tester-25000-13");
        ITPersonel.put("12345678902","Muhammet-Ozyon-P.Manager-15250-9");
        ITPersonel.put("12345678903","Mehdi-Azeri-Scrum Master-30000-4");
        ITPersonel.put("12345678904","Galip-Akyül-Veri Taban Uzmanı-17000-18");
        ITPersonel.put("12345678905","isa-Avcı-Developer-27000-0");
        ITPersonel.put("12345678906","Yasemin-Tahtali-QA Tester-20000-5");
        System.out.println(ITPersonel);//{12345678903=Mehdi-Azeri-Scrum Master-30000-7}
        Set<Map.Entry<String,String>> ItEntry=ITPersonel.entrySet();
        //System.out.println(ItEntry);//[12345678905=isa-Avcı-Developer-27000-0]
        for (Map.Entry<String,String> eachItEntry:ItEntry) {
            //System.out.println(eachItEntry);// 12345678905=isa-Avcı-Developer-27000-0
            String ItValue=eachItEntry.getValue();
            //System.out.println(ItValue);//Muhammet-Ozyon-P.Manager-15250-9
            String[]ITValueArr=ItValue.split("-");
            //System.out.println(Arrays.toString(ITValueArr));//[Muhammet, Ozyon, P.Manager, 15250, 9]
            double maas=Integer.parseInt(ITValueArr[3]);
            //System.out.println(maas);//15250
            int calismaSuresi=Integer.parseInt(ITValueArr[4]);
            //System.out.println(calismaSuresi);//9
            if (calismaSuresi>=5){
                maas+= maas/5;
                ITValueArr[3]="" +maas;
            } else if (Integer.parseInt(ITValueArr[4])>0) {
                maas+=maas/10;
                ITValueArr[3]="" +maas;
            }else {
                maas=maas;
                ITValueArr[3]="" +maas;
            }
            eachItEntry.setValue(ITValueArr[0]+" "+ITValueArr[1]+" "+ITValueArr[2]+" "+ITValueArr[3]+" "+ITValueArr[4]);
            //System.out.println(eachItEntry);
        }
        System.out.println(ITPersonel);
    }

}
