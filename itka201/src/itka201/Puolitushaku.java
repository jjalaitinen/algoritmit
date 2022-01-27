package itka201;
import java.util.Arrays;
import java.util.Random;
import itka201.Lajittelu;
/**
 * algoritmit 1 demokerta 5, ohjelmointitehtävä
 * @author joona
 * @version 28 Feb 2019
 *
 */
public class Puolitushaku {
    
    /**
     * puolitusten määrä
     */
    public static int puolituksia = 0;
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] taulukko = new int[50];
        lisaaAlkiot(taulukko);
        System.out.println(Arrays.toString(taulukko));
        jarjestaTaulukko(taulukko);
        System.out.println(Arrays.toString(taulukko));
        int haettava = 2;
        boolean vast = puolitusHaku(taulukko, haettava, 0, taulukko.length-1);
        System.out.println("Löytyikö haettava alkio: " + vast);
        System.out.println("puolituksia: " + puolituksia);
    }
    
    /**
     * järjestetään taulukko
     * @param t taulukko joka järjestetään
     */
    public static void jarjestaTaulukko(int[] t) {
        Lajittelu.kuplaLajittelu(t);
    }
    
    /**
     * lisätään taulukkoon rndm numeroita
     * @param t taulukko
     */
    public static void lisaaAlkiot(int[] t) {
        Random numeroita = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = numeroita.nextInt(100);
        }
    }
    
    /**
     * @param t taulukko
     * @param alkio mitä etsitään
     * @param alku vasen puoli
     * @param loppu oikea puoli
     * @return montako puolitusta tehtiin
     */
    public static boolean puolitusHaku(int[] t, int alkio, int alku, int loppu) {
        int vasen = alku;
        int oikea = loppu;
        
        while (vasen <= oikea) {
            int keski = (vasen + oikea)/2;
            if (t[keski] == alkio) return true;
            if (t[keski] < alkio) {
                vasen = keski+1;
                puolituksia++;
            }
            else {
                oikea = keski-1;
                puolituksia++;
            }
        }
        return false;
    }

}
