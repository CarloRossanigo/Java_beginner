import java.util.*;
public class GestoreVoli{
    //CAMPI
    private List<Volo> listavoli;

    //COSTRUTTORI
    public GestoreVoli(){
	this.listavoli=new ArrayList<Volo>();
    }

    //METODI
    public void add(Volo v){
	int index=(this.listavoli).indexOf(v);
	if(index==-1){
	    listavoli.add(v);
	}
    }
    public void  add(Volo v,Passeggero p){
	int index=(this.listavoli).indexOf(v);
	if(index!=-1){
	    v.add(p);
	}
	
    }
   @Override
    public String toString(){
       String s="";
       for(Volo V:this.listavoli){
	   s+=V.toString();
       }
       return s;
    }

    //ESERCIZIO 2
    public List<Passeggero> listaPasseggeri(){
	Set<Passeggero> InsiemeP=new LinkedHashSet<>();
	for(Volo v:listavoli){
	    InsiemeP.addAll(v.getListap());
	}
	List <Passeggero> listaP=new ArrayList<Passeggero>(InsiemeP);
	return listaP;
	
    }
    //scrivi metodo 2 per entrambi metodi
    
    public List<Passeggero> listaPasseggeriRegolari(){
	List<Passeggero> listaPR=this.listaPasseggeri();
	Iterator <Passeggero> it=listaPR.iterator();
	while(it.hasNext()){
        Passeggero p = it.next();
        if (p instanceof PasseggeroPremium) {
            it.remove();
        }
    }
	//List<Passeggero> listaPr = new ArrayList<>(listaPR);
	return listaPR;
    }


    public List<Volo> listaVoli(){
	return this.listavoli;
    }
}//end class
