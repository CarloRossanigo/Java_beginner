import java.util.*;
public class  Esercizio3 {
     public static void runLineaInput(String lineaInput,RegistroPrenotazioni reg) {
	 try{
	String[] tokens = lineaInput.split("#");
        String aula = tokens[0];
	int g=Integer.parseInt(tokens[1]);
	int m=Integer.parseInt(tokens[2]);
	int a=Integer.parseInt(tokens[3]);
	int ora=Integer.parseInt(tokens[4]);
	int dur=Integer.parseInt(tokens[5]);
	String desc= tokens[6];
	    reg.add(new PrenotazioneLezione(aula,g, m, a,ora,dur,desc));
	}catch(DataException e){
	    System.err.println(e);
	}catch(OraException e){
	    System.err.println(e);
	}catch (Exception e){
	    System.err.println("Errore formato");
	    }
	
	   
    }
    
    public static void main(String[] args)  {
	RegistroPrenotazioni.setApertura(8);
	// ##### fissare l’orario di apertura alle 8
	// ##### fissare l’orario di chiusura alle 21
	RegistroPrenotazioni.setChiusura(21);
	Scanner sc=new Scanner(System.in);
	RegistroPrenotazioni reg = new RegistroPrenotazioni();
	while(sc.hasNextLine()){
		String lineaInp=sc.nextLine();
		runLineaInput(lineaInp,reg);
		// System.out.println("=== STAMPA REGISTRO (" + reg.numeroPrenotazioni() + " prenotazioni) ===");
		//System.out.println(reg);
	    }
	sc.close();
  System.out.println("=== STAMPA REGISTRO (" + reg.numeroPrenotazioni() + " prenotazioni) ===");
  System.out.println(reg);
    } // end main
} //end class
