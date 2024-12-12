public class Esame implements Comparable <Esame> {
    //CAMPI
    private String nome;
    private int cfu;
    private Voto voto;//null se il voto non è stato definito
    //COSTRUTTORI
    public Esame(String n,int c,Voto v) {
	if(c<1 || c>9)
	    throw new CfuException("ERRORE!");
	this.nome=n;
	this.cfu=c;
	this.voto=v;
    }
    public Esame(String n,int c) {
	this.nome=n;
	this.cfu=c;
	//correzione prof :this(n,c,null);
    }
    //METODI
    public int  valoreVoto(){
	return (this.voto != null && this.voto.valoreVoto() >= 18) ? this.voto.valoreVoto() : -1;
    }//funziona anche per VotoConLode avendo ridefinto valoreVoto per le lodi
    public void setVoto(Voto v){
	this.voto=v;
    }
    public Voto getVoto(){
	return this.voto;
    }
    public int getCfu(){
	return this.cfu;
    }
    public boolean sostenuto(){
	return( this.valoreVoto()!=-1 ? true: false);
    }
    @Override
    public String toString(){
	String s="ESAME: "+ this.nome+" CFU: "+Integer.toString(this.cfu);
	if(this.sostenuto())
	    s+=" " +(this.getVoto()).toString();//basta anche this.voto->oVerridinge del toString
	return s;
    }
    public boolean equals(Esame e){
	return (this.nome).equals(e.nome);
    }
     @Override
     public boolean equals(Object e){
	 return ( e instanceof Esame && this.equals((Esame) e));
    }
    //ES3
     @Override
     public int compareTo(Esame e){
	 return (this.nome).compareTo(e.nome);
    }
    
}//end class


