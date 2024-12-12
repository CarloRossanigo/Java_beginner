import java.util.*;
public class Domino{
    //CAMPI
    private  List<Tessera> listaT;
    private Tessera u;
    //COSTRUTTORI
    public Domino() {
	this.listaT=new ArrayList<Tessera>();
    }
    //METODI
    private Tessera tesseraDaAggiungere(Tessera t) {
	int index=listaT.size();
	// 	System.out.println(t);
       	if(index==0)
	    return t;
	Tessera  u=listaT.get(index-1);//meglio scrivere TESSERA U
	if(u instanceof TesseraJolly)
	    return t;
	if(t.puoStareDopo(u))
	    return t;
	t.ruota();
	// 	System.out.println("Tessera: "+t);
	if (t.puoStareDopo(u))
	    return t;
	return null;
	
    }
        public void add(Tessera t) {
	
	if (t instanceof TesseraJolly){
	    listaT.add(t);
	}
	int index = listaT.indexOf(t);
	t.ruota(); // Ruota la tessera

	int rotatedIndex = listaT.indexOf(t);
	t.ruota(); // Ruota la tessera nuovamente per ripristinare la sua posizione originale
	
	if (index == -1 || rotatedIndex == -1) {
	    if (tesseraDaAggiungere(t) != null)
		listaT.add(tesseraDaAggiungere(t));
	}
	}



   
    public List<Tessera> tessere(){
	List<Tessera> listaN=new ArrayList<Tessera>(listaT);
	return listaN;
    }
    public int punti() {
	int punti = 0;
	for (Tessera t : listaT) {
	    if (t instanceof TesseraJolly) {
		TesseraJolly tesseraJolly = (TesseraJolly) t;
		punti += tesseraJolly.getPunti();//FONDAMENTALE PER CAMBIARE I PUNTI IN MODO DINAMICO
	    }
	    else {
		punti += t.punti();
	    }
	    
	}
	return punti;
    }
    public List<String> colori() {
    List<String> listaC = new ArrayList<String>();
    for (Tessera t : listaT) {
        if (t instanceof TesseraJolly) {
            TesseraJolly tesseraJolly = (TesseraJolly) t;
            String jollyColore = tesseraJolly.getColore();//FONDAMENTALE PER CAMBIARE I PUNTI IN MODO DINAMICO
            if (!listaC.contains(jollyColore)) {
                listaC.add(jollyColore);
            }
        } else {
            String dx = t.coloreDestro();
            String sx = t.coloreSinistro();
            if (!listaC.contains(dx)) {
                listaC.add(dx);
            }
            if (!listaC.contains(sx)) {
                listaC.add(sx);
            }
        }
    }
    return listaC;
}



     @Override
    public String toString() {
	 String s="";
	 for(Tessera t: listaT)
	     s+=t.toString()+"\t";
	 return s;
     }
    //ES2
    public void sort(List<Tessera> t){
	Collections.sort(t);
     }

    
    
}
