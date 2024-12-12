public class EventoSpeciale extends Evento{
    //CAMPI
    private static int contSpec=0;
    //  private String codspec;
    //COSTRUTTORI
    public EventoSpeciale(Data d,int o,int dur,String desc){
	super(d,o,dur,desc);
	super.cod=super.codice()+"S"+(++contSpec);
	//	this.codspec=super.codice()+"S"+(++contSpec);
    }
    public EventoSpeciale(int g,int m,int a,int o,int dur,String desc){
	this(new Data(g,m,a),o,dur,desc);
    }
    public EventoSpeciale(int g,int m,int a,int o,String desc){
	super(g,m,a,o,desc);
	super.cod=super.codice()+"S"+(++contSpec);
	//	this.codspec=super.codice()+"S"+(++contSpec);//attenzione
    }
    //METODI
    @Override
    public  String codice(){
	return this.cod;
	//	return this.codspec;
    }
    @Override
    public String toString(){
	return super.toString()+" ** Evento Speciale **";
    }
    //Es2
    @Override
    public boolean eventoImportante(){
	return true;
    }

}//end class
// @ [] {}
				    
