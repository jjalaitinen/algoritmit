package itka201;

import java.util.Random;

/**
 * kokeillaan erilaisia lajittelu algoritmeja
 * @author joona
 * @version 21 Feb 2019
 *
 */
public class Lajittelu {

    /**
     * Stattisten aliohjelmien testaamista
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
        int[] taulukko = new int[10];  //luodaan taulukot
        int[] taulukko2 = new int[10];
        
        taulukko = lisaaRndmNumeroita(taulukko);  // lisätään taulukot täyteen random numeroita
        taulukko2 = lisaaRndmNumeroita(taulukko2); // väliltä 0-100
        
        tulosta(taulukko); //tulostetaan taulukot ennen käsittelyä
        tulosta(taulukko2);
        System.out.println();
        
        taulukko = kuplaLajittelu(taulukko); //lajitellaan taulukkokuplalajittelulla
        taulukko2 = valintaLajittelu(taulukko2); //ja valintalajittelulla
        
        tulosta(taulukko);  // tulostetaan vielä
        tulosta(taulukko2);  // lajitellut taulukot 
        
        
    }
    
    /**
     * täyetään taulukko numeroilla (random)
     * @param t taulukko
     * @return palauttaa taulukon täytettynä random numeroilla
     */
    public static int[] lisaaRndmNumeroita(int[] t) {
        
        Random randomi = new Random();
        
        for (int i = 0; i <t.length; i++) {
            t[i] = randomi.nextInt(100);
        }
        
        return t;
        
    }
    
    /**
     * Lajitellaan taulukko käyttäen valintaLajittelua
     * @param t taulukko joka lajitellaan.
     * @return palauttaa uuden järjestetyn taulukon
     */
    public static int[] valintaLajittelu(int[] t) {
        
        for (int i = 0; i < t.length-1; i++) {
            int indeksiNyt = i;
            for (int j = i+1; j < t.length; j++) {
                if (t[j] < t[indeksiNyt]) indeksiNyt = j;
                }
            int pienin = t[indeksiNyt];
            t[indeksiNyt] = t[i];
            t[i] = pienin;
            }
        return t;
    }
    
    /**
     * Lajitellaan taulukon alkiot kuplalajittelulla.
     * @param t taulukko joka lajitellaan
     * @return lajiteltu taulukko
     */
    public static int[] kuplaLajittelu(int[] t) {
       boolean vaihtojaTehdaan = true;
        while (vaihtojaTehdaan) {
            vaihtojaTehdaan = false;
            for (int i = t.length-1; i>0; i--) {
                if (t[i] < t[i-1]) {
                    int tmp = t[i];
                    t[i] = t[i-1];
                    t[i-1] = tmp;
                    vaihtojaTehdaan = true;
                }
            }
        }
        
        return t;
    }
    
    /**
     * taulukon tulostamiseen aliohjelma
     * @param t taulukko, joka tulostetaan.
     */
    public static void tulosta(int[] t) {
        System.out.println();
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }
    
    

}
