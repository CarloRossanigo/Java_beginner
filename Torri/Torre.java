import java.util.*;
public class Torre implements Comparable <Torre>{
    //CAMPI
    private String nome;
    private List<Blocco> listB;
    private Blocco top;//utile
    //COSTRUTTORI
    public Torre(String n){
	this.nome=n;
	this.listB=new ArrayList<Blocco>();
    }
    public Torre(String n,Blocco b){
	this(n);
	listB.add(b);
    }
    //METODI
   
    public void add(Blocco b){
	int index=listB.size();
	if(index<1)
	    listB.add(b);
	else{
	    Blocco top=listB.get(index-1);
	    if(b.puoStareSopraA(top)){
		if(b instanceof BloccoNumerato && !listB.contains((BloccoNumerato)b))
		    listB.add((BloccoNumerato)b);
		if(b instanceof BloccoJolly)
		    listB.add((BloccoJolly) b);
	    }
	}
     }
   
    public int totaleBlocchi(){
	return listB.size();
    }
    public int totaleBlocchiNumerati(){
	int count=0;
	for(Blocco b:listB)
	    if(b instanceof BloccoNumerato)
		count++;
	return count;
    }
    public int totaleBlocchiJolly(){
	int count=0;
	for(Blocco b:listB)
	    if(b instanceof BloccoJolly)
		count++;
	return count;
    }
    @Override
    public String toString(){
	String s="=== TORRE"+" "+getNome()+" ====\n";
	for(int i=listB.size();i>0;i--){
	    Blocco b=listB.get(i-1);
	     s+=b.toString()+"\n";
	}
	s+="---------";
	return s;
    }
    //ES2
    public List<BloccoNumerato> getBlocchiNumerati(){
	List<BloccoNumerato> listBN=new ArrayList<BloccoNumerato>();
	for(int i=0;i<listB.size();i++){
	    Blocco aux=listB.get(i);
	    if (aux instanceof BloccoNumerato)
		listBN.add((BloccoNumerato) aux);
	 }
	return listBN;
    }
    //ES3
    public String getNome(){
	return this.nome;
    }
    public boolean equals(Torre t){
	return (this.getNome().equals(t.getNome()));
    }
    @Override
    public boolean equals(Object o){
	return o instanceof Torre && this.equals((Torre) o);
    }
      @Override
    public int compareTo(Torre t){
	  return (this.getNome()).compareTo(t.getNome());
    }
}//end class
    //{}[]@
