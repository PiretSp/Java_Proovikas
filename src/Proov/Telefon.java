package Proov;

import java.util.ArrayList;

/**
 * Created by piret on 28.01.17.
 */
public class Telefon {

    private static ArrayList<String> kontaktid = new ArrayList();
    private static int jääk;
    private static String omanik;
    public String mark;

//Konstruktor
    public Telefon(String aaa, String telefoniMark) {
        omanik = aaa;
        mark = telefoniMark;
    }

    public void sisestaNumber(String number) {
        kontaktid.add(number);
    }

    public int lisaKoneminuteid(int lisatakse) {
        jääk = jääk + lisatakse;
        return jääk;
    }

    public void helista(String kontakt, int minutid) {
        if (jääk < minutid) {
            System.out.println("Omanik proovis helistada numbrile " + kontakt + ". Selleks ei ole piisavalt kõneminuteid");
        } else {
            boolean numberOnOlemas = false;
            for (int i = 0; i < kontaktid.size(); i++){
                if (kontaktid.get(i).contains(kontakt)){
                    numberOnOlemas = true;
                    break;
                } else {
                    numberOnOlemas = false;
                }
            }

            if (numberOnOlemas == true){
                jääk = jääk - minutid;
                System.out.println(kontakt + ", " + minutid);
            }else{
                System.out.println("Omanik proovis helistada numbrile " + kontakt + ". Sellist numbrit ei ole kontaktide hulgas");
            }
        }
    }

    public void eemaldaNumber(String number) {
        for (int i = 0; i < kontaktid.size(); i++) {
            if (kontaktid.get(i).equals(number)){
                System.out.println("Telefonist eemaldati number " + number);
                kontaktid.remove(i);
            }
        }
    }

    public String kelleTelefon() {
        return omanik;
    }
}

