import java.util.*;
public class BloccoNumerato extends Blocco implements Comparable <BloccoNumerato>{
    //CAMPI
    private int numero;//eccezione
    //COSTRUTTORI
    public BloccoNumerato(String col,int n){
	super(col);
	if(n<=0)
	    throw new NumeroException("il Numero è <= 0 !");
	this.numero=n;
    }
    public BloccoNumerato(int n){
	super();
	if(n<=0)
	    throw new NumeroException("il Numero è <= 0 !");
	this.numero=n;
    }
    public int getNumero(){
	return this.numero;
    }
    public boolean equals(BloccoNumerato b){
	return super.equals(b) && this.numero==b.numero;//verifica
    }
    @Override
    public boolean equals(Object o){
	return (o instanceof BloccoNumerato && this.equals((BloccoNumerato) o));
    }
    public boolean puoStareSopraA(BloccoNumerato b){
	if(this.equals(b))
	    return false;
	if( super.equals(b) || this.numero>b.getNumero()){
		return true;
	}
	/*if(this.equals(b))
	  return false;*/
	return false;
    }
    @Override//eventuali correzioni
     public boolean puoStareSopraA(Blocco b){
	if( b instanceof BloccoNumerato)
	    return this.puoStareSopraA((BloccoNumerato) b);
	return true;
    }
    @Override
    public String toString(){
	return "("+this.getColore()+","+Integer.toString(this.getNumero())+")";
    }
    //ES 2
     @Override
    public int compareTo(BloccoNumerato b){
	 if((this.getColore()).compareTo(b.getColore())!=0)
	     return (this.getColore()).compareTo(b.getColore());
	 return Integer.compare(this.numero,b.getNumero());
    }
    public static void sort(List<BloccoNumerato> listBNum){
	Collections.sort(listBNum);
    }
    public static void sort(List<BloccoNumerato> listBNum,Comparator<BloccoNumerato> cmp){
	Collections.sort(listBNum,cmp);
    }
    
}//end class
//{}[]@
