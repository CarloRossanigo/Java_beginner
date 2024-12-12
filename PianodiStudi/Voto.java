public class Voto{
    //CAMPI
    private int voto;
    //COSTRUTTORI
    public Voto(int v){
	if(v< 18 || v>33 )
	    throw new VotoException("ERRORE!");
	this.voto=v;
    }
    //METODI
    public int valoreVoto(){
	return this.voto;
    }
    @Override
    public String toString(){
	return "VOTO : " + this.valoreVoto()+"/30";
	
    }
     public boolean equals(Voto v) {
	return this.voto==v.voto;
    }
    @Override
    public boolean equals(Object o) {
	return o instanceof Voto && this.equals((Voto) o);
    }

}//end class
