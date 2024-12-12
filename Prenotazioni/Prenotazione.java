public abstract class Prenotazione implements Comparable<Prenotazione>{
    //CAMPI
    private String aula;
    private Data d;
    private int ore;
    private int durata;
    //COSTRUTTORI
    public Prenotazione(String aula,Data data,int ora,int durata){
	this.aula=aula;
	this.d=data;
	if(ora<0 || ora>24)
	    throw new OraException("Errore nel formato ora: "+" "+ora);
	this.ore=ora;
	this.durata=durata;
    }
    public Prenotazione(String aula,int g,int m,int a,int ora,int durata){
	this(aula,new Data(g,m,a),ora,durata);
    }
    //METODI
    public abstract String codice();
    public int getOra(){
	return this.ore;
    }
    public int getDurata(){
	return this.durata;
    }
    public Data getData(){
	return this.d;
    }
    public String getAula(){
	return this.aula;
    }
    public boolean siSovrapponeA(Prenotazione p){
	if((this.aula).equals(p.aula) && (this.d).equals(p.d))
	    return (p.ore< this.durata+this.ore && this.ore< p.ore+p.durata);
	
	return false;
	
    }
    @Override
    public String toString(){
	return (this.d).toString()+","+this.ore+"-"+Integer.toString(this.ore+this.durata)+","+"Aula: " +this.aula;
    }
    @Override
    public int compareTo(Prenotazione p){
	if((this.getData()).equals(p.getData())){
	    if(this.getOra()==p.getOra())
		return (this.aula).compareTo(p.getAula());
	    else
		return Integer.compare(this.ore,p.ore);
	}
	return (this.d).compareTo(p.d);
    }


}
//{} @ []
