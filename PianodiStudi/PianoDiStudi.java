import java.util.*;
public class PianoDiStudi {
    //CAMPI
    private List<Esame> lista;
    //COSTRUTTORI
    public PianoDiStudi(){
	this.lista=new ArrayList<Esame>();
    }
    //METODI
    public void add(Esame esame)  {
	int index=lista.indexOf(esame);
	if (index==-1) 
	    lista.add(esame);
	//posso usare anche contains
    }

    public void add(String nomeEsame,int cfu,Voto voto){
	add(new Esame(nomeEsame, cfu, voto));// anche this.add(..);
    }
    public void add(String nomeEsame,int cfu){
	add(new Esame(nomeEsame, cfu));//anche this.add(..);
    }

    public void add(String nomeEsame,int cfu,Voto voto,String descrizione){
	add(new EsameEsterno(nomeEsame, cfu, voto, descrizione));//this.add(..);
    }

    public void setVoto(String nomeEsame, Voto voto) { 
	int index = this.lista.indexOf(new Esame(nomeEsame,2,voto));
	if (index != -1) {
	    this.lista.get(index).setVoto(voto);
	}

    }
    //si puo aggiungere alla classe esame un costruttore di cui specifico solo il nome e i cfu a caso tipo 6

    public int numeroEsami() {
        return lista.size();
    }

   public int numeroEsamiInterni() {
        int count = 0;
        for (Esame e : lista) {
            if (!(e instanceof EsameEsterno)) {
                count++;
            }
        }
        return count;
    }
    public int numeroEsamiSostenuti() {
        int count = 0;
        for (Esame e : lista) {
            if (e.sostenuto()) {
                count++;
            }
        }
        return count;
    }
    public int numeroLodi() {
        int count = 0;
        for (Esame e : lista) {
            if (e.sostenuto() && (e.getVoto() instanceof VotoConLode)) 
                count++;
            
        }
        return count;
    }


    public int totCfu() {
        int totCfu = 0;
        for (Esame e : lista) {
            totCfu += e.getCfu();
        }
        return totCfu;
    }

    public int totCfuAcquisiti() {
        int totCfu = 0;
        for (Esame e : lista) {
            if (e.sostenuto()) {
                totCfu += e.getCfu();
            }
        }
        return totCfu;
    }
    @Override
    public String toString() {
	String s = "";
	for (Esame e : lista) {
	    s+=e.toString()+"\n";
	}   
	return s;
    }
    
    //ES2
    public double  media(){
	double media=0;
	double cfu=0;
	for(Esame e:lista){
	    if(e.sostenuto()){
		cfu+=e.getCfu();
		media+=(e.getCfu()*e.valoreVoto());
	    }   
	}
	return media/cfu;
    }
    //ES3
    public void sort(){
	Collections.sort(lista);
	 
    }
   
    public void sort(Comparator<Esame> cmp) {
	Collections.sort(lista,cmp);
	 
    }
    
}



