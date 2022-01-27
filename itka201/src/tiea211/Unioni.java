package tiea211;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author joona
 * @version 12 Apr 2019
 *
 */
public class Unioni {
    
    public static class Alkio {
        private String avain;
        private int n;
        private ArrayList<Alkio> lapset = new ArrayList<>();
        
        public Alkio(String key) {
            this.avain = key;
            this.n = -1;
        }
        
        public void setIndeksi(int n) {
            this.n = n;
        }
        
        public void lisaaLapsi(Alkio a) {
            this.lapset.add(a);
        }
        
        public String getAvain() {
            return this.avain;
        }
        
        public int getIndeksi() {
            return this.n;
        }
        
        @Override
        public String toString() {
            return this.avain + " " + this.n;
        }
        
        
    }
    
    
    public static void union (Alkio[] j, int a, int b) {
        
          int k;
          k = (j[a].getIndeksi() + j[b].getIndeksi() ) * -1;
          
          if (j[a].getAvain().compareTo(j[b].getAvain()) <= 0) {
            j[a].setIndeksi(k);
            j[b].setIndeksi(a);
          }
          else {
            j[b].setIndeksi(k);
            j[a].setIndeksi(b);
          }
    }
    
    public static Alkio find(Alkio[] t, int x1) {
        Alkio j;
        Alkio k;
        int x = x1;
        j = t[x];
        int indeksi = 0;
        
        while ( j.getIndeksi() > 0) {
          indeksi = j.getIndeksi();
          j = t[indeksi];
        }
        
        
        
        // Hakupolun tiivistys:
        while (x != indeksi)
        {
          k = t[x]; //findattu alkio sitruuna
          x = t[x].getIndeksi(); //vanhempi persikka
          k.setIndeksi(indeksi);
        }
        return j;
     }

    /**
     * testipääohjelma
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        
        //Alkio tyhja = new Alkio("empty");
        Alkio banaani = new Alkio("banaani");
        Alkio luumu = new Alkio("luumu");
        Alkio omena = new Alkio("omena");
        Alkio persikka = new Alkio("persikka");
        Alkio sitruuna = new Alkio("sitruuna");
        
        Alkio[] t = { banaani, luumu, omena, persikka, sitruuna };
        System.out.println(Arrays.toString(t));
        
        union(t, 1, 2);
        System.out.println(Arrays.toString(t));
        union(t, 3, 4);
        System.out.println(Arrays.toString(t));
        union(t, 1, 3);
        System.out.println();
        System.out.println(Arrays.toString(t));
        Alkio palautus = find(t, 4);
        System.out.println(Arrays.toString(t));
        System.out.println(palautus);

        
    }

}
