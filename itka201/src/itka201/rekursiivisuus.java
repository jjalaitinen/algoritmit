package itka201;
import java.util.Arrays;
import java.util.Random;

/**
 * @author joona
 * @version 6 Feb 2019
 *
 */
public class rekursiivisuus {

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        int[] t = new int[20];
        
        Random rand = new Random();
        for (int i = 0; i < t.length; i++) {
          t[i] = rand.nextInt(100);
         }
        
        System.out.println("Taulukko: " + Arrays.toString(t));
        
        int n = 10;
        
        int vast = laskeSumma(t, n);
        System.out.println(vast);
        
        int suurin = etsiSuurin(t, n);
        System.out.println(suurin);

    }
    
    /**
     * @param t taulukko
     * @param n lukumaara
     * @return palauttaa summan
     */
    public static int laskeSumma(int[] t, int n) {
        if(n == 0) return 0;
         return (laskeSumma(t, n-1) + t[n-1]);
        
    }
    
    /**
     * @param t taulukko
     * @param n alue
     * @return suurin
     */
    public static int etsiSuurin(int[] t, int n) {
       if (n == 0) return 0;
       return max(etsiSuurin(t, n-1), t[n-1]);
    }

    private static int max(int iso, int i) {
        if (iso > i) {
        return iso;
        } return i;
    }

}

