import java.util.*;
public class RegistroPrenotazioni {
    //CAMPI
    private List<Prenotazione> listP;
    private static int aperto=8;
    private static int chiuso=20;
    //COSTRUTTORI
    public RegistroPrenotazioni(){
	this.listP=new ArrayList<Prenotazione>();
    }
    //METODI
    public static void setApertura(int ora){
	aperto=ora;
    }
    public static void setChiusura(int ora){
	chiuso=ora;
    }
    public boolean add(Prenotazione p){
	if(p.getOra()>=aperto && p.getOra()+p.getDurata()<=chiuso){
	    for(Prenotazione q:listP){
		if(p.siSovrapponeA(q))
		    return false;
	    }
	    listP.add(p);
	    return true;   
	}
	return false;
    }
    public int numeroPrenotazioni(){
	return listP.size();
    }
    public List<PrenotazioneLezione> prenotazioniPerLezione(){
	List<PrenotazioneLezione> listL=new ArrayList<PrenotazioneLezione>();
	for(Prenotazione p:listP)
	    if(p instanceof PrenotazioneLezione)
		listL.add((PrenotazioneLezione)p);
	return listL;  
    }
    public List<Data> dateConAulePrenotate(){
	List<Data> listD=new ArrayList<Data>();
	for(Prenotazione p:listP){
	    Data d=p.getData();
	    int index=listD.indexOf(d);
	    if(index==-1)
		listD.add(d);
	}
	return listD;   
    }
    @Override
    public String toString(){
	String s="";
	for(Prenotazione p:listP)
	    s+=p.toString()+"\n";
	return s;
    }
    //ES2
    public void sort(){
	Collections.sort(listP);
    }
    public void sort(Comparator<Prenotazione> cmp){
	Collections.sort(listP,cmp);
    }

}//end class
//{} @ []    
