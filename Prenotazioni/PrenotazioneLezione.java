public class PrenotazioneLezione extends Prenotazione{
    //CAMPI
    private String cod;
    private static int cont=1;
    private String descr; 
    //COSTRUTTORI
    public PrenotazioneLezione(String a,int g,int m,int ann,int o,int dur,String descr){
	super(a,g,m,ann,o,dur);
	this.cod="L"+(cont++);
	this.descr=descr;
    }
    PrenotazioneLezione(String a,int g,int m,int ann,int o,String descr){
	this(a,g,m,ann,o,1,descr);
    }
    //METODI
    @Override
    public String codice(){
	return this.cod;
    }
    @Override
    public String toString(){
	return super.toString()+", codice: "+this.codice()+"--" + "Lezione "+this.descr;
    }

}//end class
//{} @ []


					 
