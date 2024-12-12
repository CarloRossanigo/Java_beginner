// Inserire sotto le linee di commento //####  le istruzioni corrispondenti
// Il resto non va modificato
import java.util.*;
public class  Esercizio1 {
    public static void main(String[] args)  {
	//###   creare la torre vuota torreAlfa di nome alfa
	Torre torreAlfa=new Torre("alfa");
	//###   impostare come colore di default il colore oro
       	Blocco.setColoreDefault("oro");
	torreAlfa.add( new BloccoNumerato("verde",5) );
	torreAlfa.add( new BloccoNumerato("verde",4) );
	torreAlfa.add( new BloccoNumerato("rosso",3) ); // non inserito (vincolo sul numero)
	torreAlfa.add( new BloccoNumerato("rosso",5) );
	torreAlfa.add( new BloccoJolly() );
	torreAlfa.add( new BloccoNumerato("nero",1) );
	torreAlfa.add( new BloccoNumerato("rosso",3) );
	torreAlfa.add( new BloccoNumerato("rosso",5) ); // non inserito (gia’ presente)
	torreAlfa.add( new BloccoNumerato("nero",3) );  // non inserito (vincolo sul numero)
	torreAlfa.add( new BloccoNumerato("nero",4) );
	torreAlfa.add( new BloccoNumerato("oro",3) );  // non inserito (vincolo sul numero)
	torreAlfa.add( new BloccoNumerato("nero",3) );
	torreAlfa.add( new BloccoNumerato("nero",1) );  // non inserito (gia’ presente)
	torreAlfa.add( new BloccoJolly() );
	torreAlfa.add( new BloccoJolly() );
	torreAlfa.add( new BloccoNumerato("verde",5) ); // non inserito (gia’ presente)
	torreAlfa.add( new BloccoNumerato("verde",7) );
	torreAlfa.add( new BloccoNumerato("rosso",10) );
	torreAlfa.add( new BloccoNumerato("rosso",4) );
	System.out.println(torreAlfa);
	System.out.println("Totale blocchi: " + torreAlfa.totaleBlocchi() );
	System.out.println("Totale blocchi numerati: " + torreAlfa.totaleBlocchiNumerati() );
	System.out.println("Totale blocchi Jolly: " + torreAlfa.totaleBlocchiJolly() );
    }// end main
}//end class
