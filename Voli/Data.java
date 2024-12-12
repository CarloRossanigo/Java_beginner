public class Data implements Comparable<Data>{
    //CAMPI
    private int giorno;
    private int mese;
    private int anno;
    //COSTRUTTORI
    public Data(int g,int m,int a){
	this.giorno=g;
	this.mese=m;
	this.anno=a;
    }
    //METODI
    //non necessari
    public int getGiorno(){
	return this.giorno;
    }
    public int getMese(){
	return this.mese;
    }
    public int getAnno(){
	return this.anno;
    }
    @Override
    public String toString(){
	return "Data: " +Integer.toString(this.getGiorno())+"/ "+Integer.toString(this.getMese())+"/"+Integer.toString(this.getAnno()) ;
    }//basta anche this.anno
    public boolean equals(Data d){
	return(this.giorno==d.giorno && this.mese==d.mese && this.anno==d.anno);
    }
    @Override
    public boolean equals(Object o){
	return (o instanceof Data & this.equals((Data) o));
    }
    //terzo es:confronto date
    @Override
     public int compareTo(Data altra){
	if (this.anno != altra.anno) {
            return Integer.compare(this.anno, altra.anno);
        } else if (this.mese != altra.mese) {
            return Integer.compare(this.mese, altra.mese);
        } else {
            return Integer.compare(this.giorno, altra.giorno);
        }
    }

}//end class
