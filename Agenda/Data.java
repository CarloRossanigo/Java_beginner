public class Data implements Comparable<Data>{
    //CAMPI
    private int g;
    private int m;
    private int a;
    //COSTRUTTORI
    public Data(int g,int m,int a){
	this.g=g;
	this.m=m;
	this.a=a;
    }
    public boolean equals(Data d){
	return this.g==d.g && this.m==d.m && this.a==d.a;
	
    }
    @Override
    public boolean equals(Object o){
	return o instanceof Data && this.equals((Data) o);
    }
    @Override
    public String toString(){
	return this.g+"/"+this.m+"/"+this.a;
    }
    //ES2
    @Override
    public int compareTo(Data d){
	if(this.a==d.a){
	    if(this.m==d.m)
		return Integer.compare(this.g,d.g);
	    return Integer.compare(this.m,d.m);
	}
	return Integer.compare(this.a,d.a);
    }
}
// @ [] {}
			     
