
package itka201;

/**
 * @author joona
 * @version 12 Feb 2019
 *
 */
public class BinaariPuu {
    
    private Solmu solmu;
    
    /**
     * konstruktori binääripuulle
     */
    public BinaariPuu() {  
        this.solmu = null;
    }
    
    
    /**
     * @param args ei käytössä
     */
    public static void main(String[] args) {                         //            Binääripuu:
        BinaariPuu bPuu = new BinaariPuu();
        bPuu.solmu = new Solmu(4);                                   //               4
        bPuu.solmu.vasen = new Solmu(2);                             //            2     10
        bPuu.solmu.vasen.oikea = new Solmu (3);                      //          0  3   8  20
        bPuu.solmu.oikea = new Solmu(10);                            //                7  18
        bPuu.solmu.oikea.oikea = new Solmu(20);                      //               6
        bPuu.solmu.oikea.vasen = new Solmu(8);
        bPuu.solmu.oikea.vasen.vasen = new Solmu(7);
        bPuu.solmu.oikea.oikea.vasen = new Solmu(18);
        bPuu.solmu.vasen.vasen = new Solmu(0);
        bPuu.solmu.oikea.vasen.vasen.vasen = new Solmu(6);
        
        //tulostetaan puu sisäjärjestyksessä, vasenalipuu, juuri, oikea alipuu
        bPuu.tulostaSisa(bPuu.solmu);
        
        //tulostetaan puu jälkijärjestyksessä, vasenalipuu, oikea alipuu, juuri
        bPuu.tulostaJalki(bPuu.solmu);
        
        //tulostetaan vielä esijärjestyksessä, juuri, vasen, oikea
        bPuu.tulostaEsi(bPuu.solmu);
    }
    
    /**
     * tulostetaan binääripuu esijärjestyksessä.
     * @param juuri puun juurisolmu
     */
    public void tulostaEsi(Solmu juuri) {
        if (juuri == null) return; //katsotaan osoittaako juuri nulliin (binääripuu loppuu) palataan jos true
        System.out.println(juuri.avain); //käydään ensin läpi juuri,
        tulostaEsi(juuri.vasen);  //ja sitten esijärjestyksessä vasen alipuu
        tulostaEsi(juuri.oikea);  // tämän jälkeen oikea alipuu
        
    }
    
    /**
     * tulostaa sisäjärjestyksessä. rekursiota käyttäen.
     * @param juuri juuri solmu puulla
     */
    public void tulostaSisa(Solmu juuri) {
        
        if (juuri==null) return; //jos vasentalasta ei löydy palataan askel taaksepäin rekursiossa
        tulostaSisa(juuri.vasen); //kutsutaan rekurisiota uudella mahdollisella vasemmalla lapsella
        System.out.println(juuri.avain); //tulostetaan avainkentän sisältö
        tulostaSisa(juuri.oikea); //tutkitaan vielä oikeat lapset rekursiolla
    }
    
    /**
     * jälkijärjestys
     * sama homma kuin sisäjärjestyksessä, mutta oikea juuri ensin
     * @param juuri puun juurisolmu
     */
    public void tulostaJalki(Solmu juuri) {
        if (juuri==null) return; // katsotaan onko juurella enää tietä mennä eteenpäin
        tulostaJalki(juuri.vasen);//tutkitaan ensin vasen puoli rekursiivisesti
        tulostaJalki(juuri.oikea); // kutsutaan vielä rekursiolla oikea puoli
        System.out.println(juuri.avain); // tulostetaan avainkentän sisältö
    }
    
    
}
