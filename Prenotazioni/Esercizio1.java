// Non cancellare il codice e i commenti gia’ scritti
// Completare il codice come richiesto nelle linee con  ####
import java.util.*;
public class  Esercizio1 {
    public static void main(String[] args)  {
	RegistroPrenotazioni.setApertura(7);
	// ##### fissare l’orario di apertura alle 7
	// ##### fissare l’orario di chiusura alle 22
	RegistroPrenotazioni.setChiusura(22);
	RegistroPrenotazioni reg = new RegistroPrenotazioni();
	reg.add( new PrenotazioneLezione( "A1", 27 , 4, 2023, 11, 2 , "analisi 1") );
	reg.add( new PrenotazioneLezione( "A1", 27 , 4, 2023, 13, 3 , "analisi 2") );
	reg.add( new PrenotazioneLezione( "A1", 27 , 4, 2023, 10, 2 , "analisi 3") ); // non inserita
	reg.add( new PrenotazioneLezione( "A1", 27 , 4, 2023, 15,  "analisi 3") ); // non inserita
	reg.add( new PrenotazioneLezione( "A2", 27 , 4, 2023, 11, 2 , "analisi 3") );
	reg.add( new PrenotazioneServizio( "A2", 27 , 4, 2023, 9, 3 , "X1") );  // non inserito
	reg.add( new PrenotazioneServizio( "A2", 27 , 4, 2023, 9, 2 , "X1") );
	reg.add( new PrenotazioneLezione( "A2", 27 , 4, 2023, 10, 4 , "geometria 0") );  // non inserita
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 10, 4 , "geometria 0") );
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 11, 2 , "programmazione") ); // non inserita
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 13,  "programmazione") ); // non inserita
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 13, 3 , "programmazione") ); // non inserita
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 9, 2 , "programmazione") ); // non inserita
	reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 8 , "fisica 1") );
  reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 9 , "fisica 2") );
  reg.add( new PrenotazioneLezione( "A1", 3 , 5, 2023, 11, 2 , "programmazione") );
  reg.add( new PrenotazioneServizio( "A1", 3 , 5, 2023, 13, 2 , "X2") );
  reg.add( new PrenotazioneServizio("A1", 27 , 4, 2023, 16,  "X3") );
  reg.add( new PrenotazioneLezione( "A3", 15 , 6, 2023, 10, 3 , "programmazione") );
  reg.add( new PrenotazioneLezione( "A3", 15 , 6, 2023, 10, 3 , "programmazione") ); // non inserita
  reg.add( new PrenotazioneLezione( "A3", 15 , 6, 2023, 8, 3 , "programmazione") ); // non inserita
  reg.add( new PrenotazioneLezione( "A3", 15 , 6, 2023, 9, 4 , "programmazione") ); // non inserita
  reg.add( new PrenotazioneLezione( "A3", 15 , 6, 2023, 9, 5 , "programmazione") ); // non inserita
  reg.add( new PrenotazioneLezione( "A2", 28 , 4, 2023, 14, 2 , "geometria 1") );
  reg.add( new PrenotazioneLezione( "A4", 28 , 4, 2023, 10, 3 , "geometria 1") );
  reg.add( new PrenotazioneServizio( "A4", 28 , 4, 2023, 8, 2 , "X4") );
  reg.add( new PrenotazioneServizio( "A1", 27 , 4, 2023, 21,  "X5") );
  reg.add( new PrenotazioneServizio( "A1", 20 , 5, 2023, 6,  "X6") );  // non inserita
  reg.add( new PrenotazioneServizio( "A1", 20 , 5, 2023, 7, 3 , "X6") );
  reg.add( new PrenotazioneServizio( "A2", 20 , 5, 2023, 7, 3 , "X7") );
  reg.add( new PrenotazioneServizio( "A2", 20 , 5, 2023, 8, 1 , "X8") );  // non inserito
  reg.add( new PrenotazioneServizio( "A2", 20 , 5, 2023, 8, 2 , "X8") );  // non inserito
  reg.add( new PrenotazioneServizio( "A2", 20 , 5, 2023, 8, 3 , "X8") );  // non inserito
  reg.add( new PrenotazioneServizio( "A2", 20 , 5, 2023, 7, 2 , "X8") );  // non inserito
  reg.add( new PrenotazioneLezione( "A5", 27 , 4, 2024, 11, 2 , "analisi 3") );
  reg.add( new PrenotazioneServizio( "A4", 22 , 1, 2025, 20, 3 , "X8") );  // non inserito
  reg.add( new PrenotazioneServizio( "A4", 22 , 1, 2025, 20, 2 , "X8") );
  reg.add( new PrenotazioneLezione( "A2", 5 , 3, 2024, 9, 2 , "analisi 3") );
  reg.add( new PrenotazioneServizio( "A2", 10 , 2, 2024, 8,  "X9") );
  System.out.println("=== STAMPA REGISTRO (" + reg.numeroPrenotazioni() + " prenotazioni) ===");
  System.out.println(reg);
  System.out.println("=== PRENOTAZIONI PER LEZIONE ===");
  List<PrenotazioneLezione> listL=reg.prenotazioniPerLezione();
  for(PrenotazioneLezione p: listL)
      System.out.println(p.toString());
  // #### stampare le prenotazioni per lezione
  System.out.println("=== DATE CON AULE PRENOTATE ===");
  //System.out.println(listL);
  List<Data> listD=reg.dateConAulePrenotate();
  for(Data d: listD)
      System.out.println(d.toString());
  // #### stampare le date in cui le aule sono prenotate
    } // end main
} //end class
