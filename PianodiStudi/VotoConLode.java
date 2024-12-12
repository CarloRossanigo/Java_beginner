public class VotoConLode extends Voto{
    private static int Valorel=30;
    public VotoConLode(){
	super(30);
    }
    public static void setValoreLode(int val){
	Valorel=val;
    }
    @Override
    public String toString(){
	return "30/30 e lode";
    }
     @Override
    public int valoreVoto(){
	return Valorel;
    }
    @Override
    public int compareTo(Voto v){
	if(!(v instanceof VotoConLode))
	    return 1;
	return 0;
    }
    
}//end class
// @ {} []
