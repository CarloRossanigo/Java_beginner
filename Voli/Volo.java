import java.util.*;
public class Volo implements Comparable <Volo> {
    //CAMPI
    private String codice;
    private Data data;
    private int punti;
    private List<Passeggero> listap;
    
    //COSTRUTTORI
    public Volo(String c,Data d,int punti){
	this.codice=c;
	this.data=d;
	this.punti=punti;
	this.listap=new ArrayList<Passeggero>();
    }
    public Volo(String c,int g,int m,int a,int punti){
	this(c,new Data(g,m,a),punti);
	
    }
    
    //METODI
    //per secondo es
    public List<Passeggero> getListap(){
	return this.listap;
	
    }
    //per terzo es
    public String getCodice(){
	return this.codice;
    }
    public Data getData(){
	return this.data;
    }
    public void add(Passeggero p){
	int indice=(this.listap).indexOf(p);
	if(indice==-1){
	    listap.add(p);
	    p.addPunti(this.punti);
	   
	}
    }
    public boolean equals(Volo v){
	return ((this.data).equals(v.data) &&  (this.codice).equals(v.codice) );
    }
   @Override
   public boolean equals(Object O){
       return ( O  instanceof Volo & this.equals((Volo) O));
    }
    @Override
   public String toString(){
	String s= " Volo " + this.codice+","+ (this.data).toString()+",punti: " +Integer.toString(this.punti) +"\n";
	for(Passeggero p:this.listap)
	    s+=p.toString()+"\n";
	return s;

    }
    //ESERCIZIO3
   @Override
    public int compareTo(Volo altro) {
	return this.getData().compareTo(altro.getData()) != 0 ?
            this.getData().compareTo(altro.getData()) :
            this.getCodice().compareTo(altro.getCodice());
    }


    
    
    
}
