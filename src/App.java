public class App {
 
    public static void main(String[] args) throws Exception {

     Auto a1 = new Auto("Audi", "A5", 50);
       
     a1.merkki = "Audi";
     a1.malli = "A5";
     a1.bensanMaara = 30;

     a1.naytaTiedot();

     a1.kiihdyta();
     System.out.println("Tiedot kiihdytyksen jälkeen");
     a1.naytaTiedot();

     a1.tankkaa(5);
     System.out.println("Tiedot tankkauksen jälkeen");
     a1.naytaTiedot();

     Auto a2 = new Auto("BMW", "320i", 30);
     a2.naytaTiedot();

    }
} 

class Auto {

    public String merkki;  
    public String malli;   
    public int bensanMaara;

    public Auto (String merkki, String malli, int bensanMaara) {
        this.merkki = merkki;
        this.malli = malli;
        this.bensanMaara = bensanMaara;
    }

    public Auto() {
        merkki = "";
        malli = "";
        bensanMaara = 0;
    }

    public void jarruta() {
        System.out.println("Auto jarruttaa.");
    }

    public void kiihdyta() {
        if (bensanMaara > 0) {
            System.out.println("Auto kiihtyy.");
            bensanMaara -= 1;
        }
        else {
            System.out.println("Bensa loppui. Tankkaa auto.");
        }
    }
    public void naytaTiedot() {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara);
    }

    public void tankkaa(int maara) {
        bensanMaara += maara;
        System.out.println("Bensaa tankattiin " + maara + " litraa.");
        System.out.println("Tankissa on nyt " + bensanMaara + " litraa");

    }
}
    
