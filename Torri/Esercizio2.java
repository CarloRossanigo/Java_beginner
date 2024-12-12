import java.util.*;
public class  Esercizio2 {

    public static class CmpNumero implements Comparator <BloccoNumerato>{
	@Override
	public int compare(BloccoNumerato b1,BloccoNumerato b2){
	    if(Integer.compare(b1.getNumero(),b2.getNumero())==0)
		return (b1.getColore().compareTo(b2.getColore()));
	    return -Integer.compare(b1.getNumero(),b2.getNumero());
	} 
    } 
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
	//provo exception..funziona
	//	torreAlfa.add( new BloccoNumerato("rosso",-1) );
	//Ordine Naturale
	List<BloccoNumerato> listBl=torreAlfa.getBlocchiNumerati();
	BloccoNumerato.sort(listBl);
	System.out.println("=== BLOCCHI NUMERATI ORDINATI (ORDINE NATURALE) ====");
	for(BloccoNumerato b:listBl)
	    // System.out.print(b.toString()+"\t");
	    System.out.print(b.toString()+" ");

	BloccoNumerato.sort(listBl,new CmpNumero());
	System.out.println("\n\n==== BLOCCHI NUMERATI ORDINATI IN ORDINE DECRESCENTE PER NUMERO ====");
	for(BloccoNumerato b:listBl)
	    //System.out.print(b.toString()+"\t");
	     System.out.print(b.toString()+" ");
    }// end main
}//end class
