public class Evento implements Comparable<Evento>{
    //CAMPI
    public String cod;
    // private String cod;//all'esame cosi
    private static int cont=0;
    private static int durataDef=1;
    private Data data;
    private int ora;
    private int durata;
    private String descr;
    //COSTRUTTORI
    public Evento(Data d,int o,int dur,String desc){
	this.data=d;
	this.ora=o;
	this.durata=dur;
	this.descr=desc;
	this.cod="E"+(++cont);
    }
    public Evento(int g,int m,int a,int o,int dur,String desc){
	this(new Data(g,m,a),o,dur,desc);
    }
    public Evento(int g,int m,int a,int o,String desc){
	this(new Data(g,m,a),o,durataDef,desc);
    }
    //METODI
    public String codice(){
	return this.cod;
    }
    public static void setDurataDefault(int n){
	durataDef=n;
    }
    public boolean siSovrapponeA(Evento ev){
	return this.data.equals(ev.data) && ev.ora<this.ora+this.durata && ev.ora+ev.durata>this.ora;
    }
    @Override
    public String toString(){
	return this.data.toString()+" inizio: " +this.ora+" durata: "+this.durata+" codice: " +codice()+" --" +this.descr;
    }
    //Es2
    public boolean eventoImportante(){
	return this.durata>4;
    }
    public Data getData(){
	return this.data;
    }
    //Es3
    @Override
    public int compareTo(Evento ev){
	if(this.data.equals(ev.data))
	    return Integer.compare(this.ora,ev.ora);
	return this.data.compareTo(ev.data);

    }
    

}//end class
// @ [] {}
			       
