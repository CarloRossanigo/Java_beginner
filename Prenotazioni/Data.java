public class Data implements Comparable<Data>{
    //CAMPI
    private int giorno;
    private int mese;
    private int anno;
    //COSTRUTTORI
    public Data(int g,int m,int a){
	if(g<1 || g>31)
	    throw new DataException("Errore nel formato data,giorno non valido: "+" "+g);
	if( m<1 || m>12)
	    throw new DataException("Errore nel formato data,mese non valido: "+" " +m);
		if( a<2023)
	    throw new DataException("Errore nel formato data,anno non valido: "+" "+a);
	this.giorno=g;
	this.mese=m;
	this.anno=a;
    }
    //METODI
    
    @Override
    public String toString(){
	return Integer.toString(this.giorno)+"/ "+Integer.toString(this.mese)+"/"+Integer.toString(this.anno) ;
    }
    public boolean equals(Data d){
	return(this.giorno==d.giorno && this.mese==d.mese && this.anno==d.anno);
    }
    @Override
    public boolean equals(Object o){
	return (o instanceof Data & this.equals((Data) o));
    }
    @Override
    public int compareTo(Data d){
	if(this.anno!=d.anno)
	    return Integer.compare(this.anno,d.anno);
	else if(this.mese != d.mese)
	    return Integer.compare(this.mese,d.mese);
	return Integer.compare(this.giorno,d.giorno);
	
    }
}//end class
//{} @ []
