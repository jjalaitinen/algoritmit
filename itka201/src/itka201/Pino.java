package itka201;

/**
 * pino-operaatioita
 * @author joona
 * @version 5 Feb 2019
 *
 */
public class Pino {
    
    int[] pino = new int[5];
    int eka = 0;
    
    /**
     * lisää pinoon uuden luvun päälimmäiseksi
     * @param pushattava mikä luku laitetaan
     */
    public void push(int pushattava) {
        if (eka == pino.length) {
            System.out.println("Ei mahdu enempää");
        }else {
        pino[eka] = pushattava;
        eka++;
        }
    }
    
    /**
     * Tulostaa pinon
     */
    public void tulosta() {
        for(int luku: pino) {
            System.out.print(luku + " ");
        }
        System.out.println();
    }
    
    /**
     * poppaa alkion ulos ja poistaa sen pinosta
     * @return palauttaa pinon "ensimmäisen" alkion
     */
    public int pop() {
        int palautettava = 0;
        
        if(isEmpty()) {
            System.out.println("Pino on tyhjä!");
        }else {
            eka--;
            palautettava = pino[eka];
            pino[eka] = 0;
        }
        return palautettava;
    }
    
    /**
     * katsoo onko pino tyhjä
     * @return palauttaa "true" jos on tyhjä pino, muuten "false
     */
    public boolean isEmpty() {
        if (eka == 0) return true;
        return false;
    }
    
    /**
     * kertoo pinon koon
     * @return koko (alkioiden määrä)
     */
    public int size() {
        return eka;
    }
    
    /**
     * palauttaa päälimmäisen alkion arvon, sitä poistamatta
     * @return pinon päälimmäisen arvo
     */
    public int top() {
        return pino[eka-1];
    }
    
    

}
