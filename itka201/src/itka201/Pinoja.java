package itka201;



/**
 * @author joona
 * @version 6 Feb 2019
 *
 */
public class Pinoja {
    int[] pino2 = new int[5];
    int eka = 0;

    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        Pinoja numerot = new Pinoja();
        numerot.push(4);
        numerot.push(10);
        numerot.tulosta();
        
        
    }
    
    /**
     * lisää pinoon uuden luvun päälimmäiseksi
     * @param pushattava mikä luku laitetaan
     */
    public void push(int pushattava) {
        if (eka == pino2.length) {
            System.out.println("Ei mahdu enempää");
        }else {
        pino2[eka] = pushattava;
        eka++;
        }
    }
    
    /**
     * Tulostaa pinon
     */
    public void tulosta() {
        for(int luku: pino2) {
            System.out.print(luku + " ");
        }
        System.out.println();
    }

}
