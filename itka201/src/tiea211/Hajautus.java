package tiea211;

import java.util.Arrays;

/**
 * @author joona
 * @version 4 Apr 2019
 *
 */
public class Hajautus {
   
    
    /**
     * lisätään hajautustaulukkoon
     * @param lisattava lisättävä alkio
     * @param t taulukko johon lisäys tehdään
     */
    public static void lisaa(int lisattava, int[] t) {
        int paikka;
        int i = 0;
        
        while (i< t.length) {
            paikka = h(lisattava, i, t);
            if (t[paikka] == 0 || t[paikka] == -1) {
                t[paikka] = lisattava;
                return;
            }
            i++;
        }
    }
    
    /**
     * Poistetaan hajautustaulukosta alkio
     * @param poistettava poistettava alkio
     * @param t hajautustaulukko, josta poistetaan
     */
    public static void poista(int poistettava, int[] t) {
        int apu = etsi(poistettava, t);
        if ( apu < 0) System.out.println("Poistettavaa alkiota " + '"'+ poistettava +'"' + " ei löydy taulukosta");
        else t[apu] = -1;
    }
    
    /**
     * Etsitään hajautustaulukosta tiettyä alkiota
     * @param alkio alkio, jota etsitään
     * @param t taulukko josta etsitään
     * @return indeksi paikkaan josta löytyi, jos ei löydy palautetaan "-1"
     */
    public static int etsi(int alkio, int[] t) {
        int paikka;
        int i = 0;
        
        while (i<t.length) {
            paikka = h(alkio, i, t);
            if (t[paikka] == alkio) return paikka;
            if (t[paikka] == 0) break;
            i++;
        }

        return -1;
    }
    
    /**
     * Miten hajautus tehdään (lineaarinen)
     * @param avain alkion avain arvo, jonka mukaan hajautus tehdään
     * @param i i:n arvo
     * @param t taulukko
     * @return palautetaan kotiosoite
     */
    public static int h(int avain, int i, int[] t) {
        int k = avain;
        int m = t.length;
        return (k + i) % m;
    }

    /**
     * testi pääohjelma hajautustaulukon kokeilemiseen
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] t = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(t));
        
        lisaa(13, t);
        lisaa(22, t);
        lisaa(43, t);
        System.out.println(Arrays.toString(t));
        
        int loytyiko = etsi(2, t); //ei löydy palauttaa -1
        int loytyiko2 = etsi(43, t); // löytyy ja palauttaa indeksi kyseiseen alkioon
        System.out.println(loytyiko);
        System.out.println(loytyiko2);
        
        poista(16, t);
        poista(22, t);
        
        System.out.println(Arrays.toString(t));
        
        lisaa(99, t);
        lisaa(19, t);
        System.out.println(Arrays.toString(t));
        

    }

}
