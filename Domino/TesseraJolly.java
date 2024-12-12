public class TesseraJolly extends Tessera{
    //CAMPI
    private static String jolly="gold";
    private static int punti=100;
    //COSTRUTTORI
    public TesseraJolly(){
	super(jolly,punti);
    }
    //METODI
    public static void setColore(String col){
	jolly=col;//senza this perche è statico
    }
    public  static void setPunti(int n){
	punti=n;
    }
    public static int getPunti() {//FONDAMENTALE PER CAMBIARE I PUNTI IN MODO DINAMICO
        return punti;
    }
    public static String getColore(){//FONDAMENTALE PER CAMBIARE I PUNTI IN MODO DINAMICO
	return jolly;
    }
     @Override
     public boolean puoStareDopo(Tessera t) {
	    return true;
    }
    @Override
    public String toString() {
	return "(*"+jolly+","+punti+")";
    }
    //ES 2
    @Override
    public int compareTo(Tessera t) {
	if(t instanceof TesseraJolly)
	    return 0;
	else
	    return -1;
    }   
}
