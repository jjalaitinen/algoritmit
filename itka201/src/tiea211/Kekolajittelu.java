package tiea211;

import java.util.Arrays;
import java.util.Random;

/**
 * @author joona
 * @version 5 Apr 2019
 *
 */
public class Kekolajittelu {
    
    
    /**
     * Lisää random numeroita taulukkoon
     * @param t taulukko
     */
    public static void lisaaRndmNumerot(int[] t) {
        Random rndm = new Random();
        for (int i = 1; i< t.length; i++) {
            t[i] = rndm.nextInt(50);
        }
    }
    
    /**
     * Yksinkertainen swap operaatio, joka vaihtaa kahden alkion paikan taulukossa
     * @param t taulukko
     * @param alkio1 ensimmäinen alkio
     * @param alkio2 ensimmäinen alkio
     */
    public static void swap(int[] t, int alkio1, int alkio2) {
        int tmp = t[alkio1];
        t[alkio1] = t[alkio2];
        t[alkio2] = tmp;
    }
    
    /**
     * Muodostaa taulukon alkioista keon
     * t[0]:sta löytyy alkioiden lkm
     * @param t taulukko jota käsitellään
     */
    public static void teeKeko(int[] t) {
        for (int i = t[0]/2; i>=1; i--) {
            korjaaKeko(t, i);
        }
    }
    
    /**
     * Korjaa keko algoritmi joka siirtää parametrina tuodun mahdollisesti
     * väärällä paikalla olevan alkion keossa oikealle paikalleen
     * @param t taulukko, josta alkiot löytyvät
     * @param i mahdollisesti väärällä paikalla oleva alkio
     */
    public static void korjaaKeko(int[] t, int i) {
        if (2*i > t[0]) return; //i:llä alkiolla ei ole lapsia, mitään ei tarvitse tehdä
        
        int j = 2*i;
        int alkio = t[i];
        
        while (j <= t[0]) {
            if ((j<t[0]) && (t[j] > t[j+1])) j +=1;
            if (alkio <= t[j]) break;
            t[j/2] = t[j];
            j = 2*j;
        }
        t[j/2] = alkio;
        
        
    }
    
    /**
     * Toteutetaan kekolajittelu
     * @param t taulukko joka lajitellaan
     * @param n alkiot jotka halutaan lajitella
     */
    public static void kekolajittelu(int[] t, int n) {
        t[0] = n;
        teeKeko(t);
        for (int i=n; i>1; i--) {
            int tmp = t[1];
            t[1] = t[i];
            t[i] = tmp;
            t[0]--;
            korjaaKeko(t, 1);
        }
    }

    /**
     * pääohjelma kekolajittelun testaamiseen
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] t = new int[10]; //alustetaan 10 pitkä taulukko
        System.out.println(Arrays.toString(t)); //tyhjä taulukko täynnä nollia
        lisaaRndmNumerot(t); //lisätään sinne random numeroita 1-50
        
        System.out.println(Arrays.toString(t));  //tulostetaan miltä taulukko näyttää lisäyksen jälkeen
        int lkm = t.length-1; 
        kekolajittelu(t, lkm); //lajitellaan kekolajittelua käyttäen
        System.out.println(Arrays.toString(t)); //tulostetaan lajiteltu taulukko
        
    }

}
