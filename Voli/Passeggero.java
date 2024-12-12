import java.util.*;
public class Passeggero implements Comparable<Passeggero>{
    //CAMPI
    private String nome;
    private String cognome;
    private int punti;
    
    //COSTRUTTORE
    public Passeggero(String n,String c){
	this.nome=n;
	this.cognome=c;
	this.punti=0;
    }
    //METODI
    public int getPunti(){
	return this.punti;
    }
    public void addPunti(int n){
	this.punti+=n;
    }
    @Override
    public String toString(){
	return this.nome+","+this.cognome+",PUNTI: " +Integer.toString(this.punti);
    }
    
    public boolean equals(Passeggero p){
	return ((this.nome)==p.nome && (this.cognome)==p.cognome);
    }
     @Override
      public boolean equals(Object p){
	 return ( p instanceof Passeggero & this.equals((Passeggero)p));
    }
    @Override
    public int compareTo(Passeggero p){
	return ((this.cognome+this.nome).compareTo((p.cognome+p.nome)));
    }
    
  
    //CLASSE PER COMPARE I PASSEGGERI IN BASE AL PUNTEGGIO
   public static  class PuntiCompare implements Comparator<Passeggero>{
	public  PuntiCompare(){
	     super();
	 }//non necessario il costruttore
	 @Override
	public int compare(Passeggero p,Passeggero q){
	    if(p.getPunti()<q.getPunti()){
		return 1;
	    }
	    if(p.getPunti()>q.getPunti()){
		return -1;
	    }
	    else
		return p.compareTo(q);
	}

	}
    
}//end class
