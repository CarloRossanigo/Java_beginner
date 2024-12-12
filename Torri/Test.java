import java.util.*;
public class Test{
    
    public static void add(String To,List<Torre> Lt,Blocco b){
	if(!Lt.contains(new Torre(To))){
	    Torre T=new Torre(To);
	    Lt.add(T);
	    if(b instanceof BloccoNumerato)
		T.add((BloccoNumerato)b);
	    if(b instanceof BloccoJolly)
		T.add((BloccoJolly)b);
	}else{
	    for(Torre t:Lt){
		String s=t.getNome();
		if(s.equals(To)){
		    if(b instanceof BloccoNumerato)
			t.add((BloccoNumerato)b);
		    if(b instanceof BloccoJolly)
			t.add((BloccoJolly)b);
		}
	    }
	}
    }	
    public static void runLineaInput(String lineaInput,List<Torre> Lt) {
	String[] tokens = lineaInput.split(",");
        String comando = tokens[0];
	switch (comando) {
	case "+":
	    if (tokens.length == 4) {
		try{
		String Torre=tokens[1];
		BloccoNumerato b=new BloccoNumerato(tokens[2],Integer.parseInt(tokens[3]));
		add(Torre,Lt,b);
		}catch(ColoreException e) {
		    System.err.println("Errore formato colore!");
		}
		catch(NumeroException e) {
		    System.err.println("Errore formato numero!");
		}				    	       	      		
	    }else if (tokens.length == 2) {
		try{
		    String Torre = tokens[1];
		    BloccoJolly j=new BloccoJolly();
		    add(Torre,Lt,j);
		}catch(ColoreException e) {
		    System.err.println("Errore formato colore!");
		}
	    }
	    break;
                case "S":
                    if (tokens.length == 2) {
                        String colore = tokens[1];
			Blocco.setColoreDefault(colore);
                    } 
                    break;
	case "P":
	    if (tokens.length == 1) {
		Collections.sort(Lt);
		 System.out.println("########  TORRI ########");
		for(Torre t:Lt){ 
		    // System.out.println("====  TORRE " + t.getNome()+"  ====");
		    System.out.println(t.toString());
		} 	    
	    } 
	    break;
	    
	default:
	    System.err.println("Comando non disponibile: " + comando);
	}
    }

    public static void main(String[] args) {

	
        Scanner scanner = new Scanner(System.in);
	List<Torre> ListaT=new ArrayList<Torre>();
        while (scanner.hasNextLine()) {
	    try{
		String lineaInput = scanner.nextLine();
		runLineaInput(lineaInput,ListaT);
		
	    }catch(ColoreException e) {
		System.err.println("Errore formato colore!");
	    }
	    catch(NumeroException e) {
		System.err.println("Errore formato numero!");
	    }			   
	}
	scanner.close();
    }
}//end class

//{}[]@
