package itka201;

/**
 * luodaan pino-operaatioille main-testaus
 * @author joona
 * @version 5 Feb 2019
 *
 */
public class pinoOperaatiot {

    /**
     * leikitään pinon kanssa, jonka maksimi kapasiteetti on
     * tällä hetkellä 5 alkiota. Lisäksi erillinen funktio tulostamiselle
     * .tulosta();
     * @param args ei käytössä
     */
    public static void main(String[] args) {
     
        Pino numerot = new Pino();
        
        //alussa tyhjä pino
        
        numerot.push(10); //lisätään 10
        numerot.push(1); // lisätään 1
        numerot.push(40); // lisätään 40
        
        numerot.tulosta(); //tarkistus miltä pino näyttää
        
        System.out.println("popattu luku: " + numerot.pop()); //popataan viimeisin pushattu numero pinosta ja tulostetaan se 
        numerot.tulosta(); //tarkistus, miltä pino näyttää nyt
        
        System.out.println("pinon koko tällä hetkellä: " + numerot.size()); // katsotaan pinon kokoa, pitäisi olla 2, (koska 3lisätty ja 1 popattu pois.)
        
        System.out.println("Onko pino tyhjä? " + numerot.isEmpty()); //katsotaan onko pino tyhjä, palautus siis "true" jos on, muuten false
        
        numerot.pop();// popataan vielä 
        numerot.pop();// pari kertaa pino tyhjäksi
        
        System.out.println("Onko pino tyhjä? " + numerot.isEmpty()); //katsotaan onko pino tyhjä, palautus siis "true" jos on, muuten false
        
        numerot.pop(); // yritetään popata tyhjästä pinosta -> virheilmoitus (toimii myös toiseen suuntaan)
        
        numerot.push(3); // pushataan vielä muutama numero pinoon
        numerot.push(14); // jotta voimme tarkastella top metodilla päälimmmäistä
        
        System.out.println("Pinon päälimmäinen: " + numerot.top()); //pitäisi olla 14.
    }
    
    
}
