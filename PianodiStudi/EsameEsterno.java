public class EsameEsterno extends Esame{
    //CAMPI
    private String descr;
    //COSTRUTTORI
    public EsameEsterno(String n,int c,Voto v,String d){
	super(n,c,v);
	this.descr=d;
    }
    //METODI
    @Override
    public String toString(){
	return super.toString()+" ** ESAME ESTERNO **: " +this.descr;
    }  

}//end class
