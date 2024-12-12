public class PrenotazioneServizio extends Prenotazione{
    //CAMPI
    private String cod;
    //COSTRUTTORI
    public PrenotazioneServizio(String a,int g,int m,int ann,int o,int d,String c){
	super(a,g,m,ann,o,d);
	this.cod=c;
    }
    public PrenotazioneServizio(String a,int g,int m,int ann,int o,String c){
	this(a,g,m,ann,o,1,c);
    }
    //METODI
    @Override
    public String codice(){
	return this.cod;
    }
    @Override
    public String toString(){
	return super.toString()+", codice: "+this.codice()+"-- SERVIZIO";
    }

}//end class
//{} @ []    
