import java.util.*;//serve?
public class Agenda{
    //CAMPI
    private List<Evento> listEv;
    private List<Evento> listRim;
    //COSTRUTTORI
    public Agenda(){
	this.listEv=new ArrayList<Evento>();
    }
    public void add(EventoSpeciale evSpec){
	if(this.listRim==null)
	    this.listRim=new ArrayList<Evento>();
	if(this.listEv.size()<1)
	    this.listEv.add(evSpec);

	else{
	    for(Evento e:this.listEv){
		if(evSpec.siSovrapponeA(e))
		    this.listRim.add(e);
	    }
	    this.listEv.add(evSpec);
	    for(Evento e:this.listRim){
		this.listEv.remove(e);
	    }  
	}  
	
    }
    public void add(Evento ev){
	if(this.listRim==null)
	    this.listRim=new ArrayList<Evento>();
	if(ev instanceof EventoSpeciale)
	    this.add((EventoSpeciale) ev);
	else if (this.listEv.size()<1)
	    this.listEv.add(ev);
	else{
	    for(Evento e:this.listEv){  
		if(ev.siSovrapponeA(e))
		    return;
	    }  
	    this.listEv.add(ev);
	}  
    }
    public List<Evento> eventi(){
	return this.listEv;
    }  
    public List <EventoSpeciale> eventiSpeciali(){
	List<EventoSpeciale> lS=new ArrayList<EventoSpeciale>();
	for(Evento e:this.listEv)
	    if(e instanceof EventoSpeciale)
		lS.add((EventoSpeciale) e);
	return lS;

    }
    public String toString(){
	String s="===EVENTI IN AGENDA ===\n";
	for(Evento e:this.listEv)
	    s+=e.toString()+"\n";
	s+="====EVENTI CANCELLATI===\n";
	for(Evento e:this.listRim)
	    s+=e.toString()+"\n";
	return s;
    }
    //ES2
    public List<Data> dateConEventi(){
	List<Data> lD=new ArrayList<Data>();
	for(Evento e:this.listEv){
	    Data aux=e.getData();
	    int index=lD.indexOf(aux);
	    if(index==-1)
		lD.add(aux);	   
	}
	return lD;
    }
    //Overloading per stampa..imprecisione?
    public String toString(String esempio){
	String s="";
	for(Evento e:this.listEv){
	    if(e.eventoImportante())
		s+=e.toString()+"\n";
	}  
	return s;
    }  
    //Es3
    public static void sort(List <? extends Evento> listEv){
	Collections.sort(listEv);
    }
    //Es4
    //Comparator<Evento> meno impreciso
    public static void sort(List<? extends Evento> listEv,Comparator<? super Evento> cmp){
    Collections.sort(listEv,cmp);
}  
     

}//end class  
// @ [] {}  
