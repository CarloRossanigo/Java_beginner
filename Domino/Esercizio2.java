import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {
        Domino dom = new Domino();
        dom.add(new Tessera("green", "blue", 10));
        dom.add(new Tessera("blue", "pink", 10));
        dom.add(new Tessera("pink", "red", 20));
        dom.add(new Tessera("red", "red", 30));
        dom.add(new Tessera("pink", "green", 30)); // non aggiunta
        dom.add(new Tessera("blue", "red", 30)); // ruotata
        dom.add(new Tessera("red", "blue", 30)); // non aggiunta (duplicato)
        dom.add(new Tessera("red", "blue", 10)); // ruotata
        //System.out.println("(1) " + dom);

        dom.add(new TesseraJolly());
        dom.add(new Tessera("pink", "red", 20)); // non aggiunta (duplicato)
        dom.add(new Tessera("red", "pink", 20)); // non aggiunta (duplicato)
        dom.add(new Tessera("pink", "red", 40));
        dom.add(new TesseraJolly());
        dom.add(new TesseraJolly());
        dom.add(new Tessera("pink", "gray", 20));
	 System.out.println("(2) " + dom);
        System.out.println("(2) PUNTI: " + dom.punti());
        
        // ###  stampare i colori nelle tessere (in qualunque ordine, ma senza duplicazioni)
      
        // ###  il colore delle tessere Jolly deve diventare red
        TesseraJolly.setColore("red");
        // ###  il punteggio delle tessere Jolly deve diventare 50
        TesseraJolly.setPunti(50);
	 System.out.println("\n(3) " + dom);
	 System.out.println("(3) PUNTI: " + dom.punti());
	List<Tessera> T=dom.tessere();
	dom.sort(T);
	// Stampa la lista di tessere
	//	System.out.println("\n\nTessere ordinate: " + T);
	
	// Stampa ogni tessera singolarmente
	for (Tessera t : T)
	    System.out.println(t.toString());
	 System.out.println("\n\n(4) " + dom);
    } // end main
} //end class
