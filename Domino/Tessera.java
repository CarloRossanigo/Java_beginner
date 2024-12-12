import java.util.*;
public class Tessera implements Comparable<Tessera>  {
    //CAMPI
    private String dx;//colore destro
    private String sx;//colore sinistro
    private int punti;
    //COSTRUTTORI
    public Tessera (String s,String d,int p){
	this.dx=d;
	this.sx=s;
	this.punti=p;
    }
    public Tessera(String u,int p) {
	this(u,u,p);
    }
    //METODI
    public String coloreSinistro() {
	return this.sx;
    }
    public String coloreDestro() {
	return this.dx;
    }
    public int punti() {
	return this.punti;
    }
    public boolean puoStareDopo(Tessera t) {
	return this.sx.equals(t.coloreDestro());
    }
    
    public boolean equals(Tessera t) {
	return (this.dx.equals(t.coloreDestro()) && this.sx.equals(t.coloreSinistro()) && this.punti == t.punti()) || 
	    (this.dx.equals(t.coloreSinistro()) && this.sx.equals(t.coloreDestro()) && this.punti == t.punti());
    }

    @Override
    public boolean  equals(Object o) {
	return ( o instanceof Tessera && (this.equals((Tessera) o)));
    }

    public void ruota(){
	//	Tessera t=new Tessera(this.sx,this.dx,this.punti);
	String des=this.dx;
	this.dx=this.sx;
	this.sx=des;
	
	//	return t;
	
    }
    @Override
    public String toString() {
	return "("+this.sx+","+this.dx+","+this.punti+")";
    }
    //ES 2
    @Override
    public int compareTo(Tessera t) {
	return Integer.compare(this.punti,t.punti());
    }
    

}
