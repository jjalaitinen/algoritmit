package itka201;
import java.util.Arrays;
import java.util.Random;


/**
 * @author joona
 * @version 29 Jan 2019
 *
 */
public class demo1 {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
        int[] numeroTaulukko = new int[20];
        
        Random rand = new Random();
        for (int i = 0; i < numeroTaulukko.length; i++) {
          numeroTaulukko[i] = rand.nextInt(100);
         }
        
        System.out.println("Taulukko: " + Arrays.toString(numeroTaulukko));
        
        int m = 2;
        onkoJaollinen(numeroTaulukko, m);
        
        m = 3;
        onkoJaollinen(numeroTaulukko, m);
        
        m = 5;
        onkoJaollinen(numeroTaulukko, m);
        
    }
    
    /**
     * @param taulukko taulukko jonka alkioita tarkastellaan
     * @param luku luku johon verrataan 
     */
    public static void onkoJaollinen(int[] taulukko, int luku) {
        int maara = 0;
        for (int i=0; i<taulukko.length; i++) {
            if(taulukko[i]%luku==0) maara++;
        }
        System.out.println("Taulukon alkioista " + maara + "kpl on jaollisia luvulla " + luku);
    }
}
    
 
        
  
