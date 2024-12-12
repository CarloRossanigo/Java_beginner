public class PasseggeroPremium extends Passeggero{
    //CAMPI
    private static int bonus;
    private int conteggio=0;
    //COSTRUTTORI
    public PasseggeroPremium(String Nome,String Cognome){
	super(Nome,Cognome);
	this.bonus=10;
    }
    public static void setBonus(int n){
	bonus=n;
    }
    //da aggiungere il fatto che il bonus va dato una volta sola
    @Override
    public void addPunti(int n) {
        super.addPunti(n);
        if (getPunti() >= 100 && this.conteggio == 0) {
            super.addPunti(bonus);
            conteggio++;
        }
    }
    @Override
    public String toString() {
	return super.toString() + " *PREMIUM*";
}
}
