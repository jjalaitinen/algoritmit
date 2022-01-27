package itka201;

/**
 * @author joona
 * @version 12 Feb 2019
 *
 */
public class Solmu {
    
    /**
     * tietosisältö attribuuttina
     */
    public int avain; 
    
    /**
     * vasemmalla oleva mahdollinen solmu
     */
    public Solmu vasen;
    
    /**
     * oikealla oleva mahdollinen solmu
     */
    public Solmu oikea; 
  
    /**
     * @param sisalto tuotu avain
     */
    public Solmu(int sisalto) 
    { 
        this.avain = sisalto;
        this.vasen = null;
        this.oikea = null;
    }
    
    
    
    
   
    
}
