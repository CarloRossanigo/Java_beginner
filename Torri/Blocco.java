public abstract class Blocco{
    //CAMPI
    private static String colDef;
    private String colore;
    //COSTRUTTORI
    public Blocco(String col){
	this.colore=col;
    }
    public Blocco(){
	if(colDef==null)
	    throw new ColoreException("Colore di default non impostato!");
	this.colore=colDef;
	    //aggiungi eccezione?
    }
    //METODI
    public static void setColoreDefault(String colore){
	if(colDef!=null)
	    throw new ColoreException("Colore di default già impostato!");
	colDef=colore;
    }
    public static String getColoreDefault(){
	return colDef;
    }
    public String getColore(){
	return this.colore;
    }
    public abstract  boolean puoStareSopraA(Blocco b);
    public boolean equals(Blocco b){
	return (this.colore).equals(b.colore);
    }
    @Override
    public boolean equals(Object o){
	return (o instanceof Blocco && this.equals((Blocco) o));
    }
    @Override
    public String toString(){
	return "("+this.getColore()+")";
    }
}//end class

//{}[]@
