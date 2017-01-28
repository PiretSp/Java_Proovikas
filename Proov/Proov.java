package Proov;

/**
 * 1 osa:
 * telefoni sisse saab salvestada numbreid
 * telefoniga saab helistada, kui anda ette mis numbrile tahad helistada ja mitu minutit
 * sellisele numbrile mida ei ole telefoniraamatus helistada ei saa
 * kui kõneminuteid pole piisavalt siis helistada ei saa
 * proov klassi ei tohi muuta
 * 2 osa:
 * loo uus javaFX fail, mis kasutab telefoni klassi ja 
 * millele saab kasutaja ette anda oma nime, sisestada numbrid 
 * ja helistada
 * 
 */
public class Proov {
    public static void main(String[] args) {

        String telefoniOmanik = "Piret";
        String telefoniMark = "Samsung";
        Telefon piretiTelefon = new Telefon(telefoniOmaink, telefoniMark);
        piretiTelefon.sisestaNumber("555111");
        piretiTelefon.sisestaNumber("223344");
        piretiTelefon.sisestaNumber("229922");
        piretiTelefon.sisestaNumber("008877");
        piretiTelefon.sisestaNumber("667788");

        int koneminutid;

        koneminutid = piretiTelefon.lisaKoneminuteid(6);  // tagastab kõneminutite jäägi

        System.out.println("Kõneminuteid on " + koneminutid);  // kuvab kui palju on kõneminuteid

        piretitelefon.helista("555111", 5);  // prindi kellele helistati ja kui kaua kõne kestis

        piretitelefon.helista("123456", 5); 

        System.out.println(piretitelefon.lisaKoneminuteid(10)); 
        piretitelefon.helista("123456", 5);

        piretitelefon.eemaldaNumber("555111");

        piretiTelefon.kelleTelefon();

        System.out.println("See telefon on " + piretiTelefon.mark)

    }
}