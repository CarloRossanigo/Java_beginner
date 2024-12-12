public class BloccoJolly extends Blocco{
    //CAMPI
    //COSTRUTTORI
    public BloccoJolly(){
	super();//eccezione?

    }
    //utile?
     public boolean puoStareSopraA(BloccoJolly b){
	 
	return true;
    }
    @Override//eventuali correszioni
     public boolean puoStareSopraA(Blocco b){
	return true;
    }
    @Override
    public String toString(){
	return "("+this.getColore()+",JOLLY)";
    }
}//end class
//{}[]@
