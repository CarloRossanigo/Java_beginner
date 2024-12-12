import java.util.*;
public class Esercizio2{
	public static void main(String args[]){
	    Agenda myAgenda=new Agenda();
	    Evento e1=new Evento(25,1,2024,10,2,"spese");
	    myAgenda.add(e1);
	    Evento e2=new Evento(25,1,2024,9,3,"passeggiata");
	    myAgenda.add(e2);
	    Evento e3=new Evento(25,1,2024,8,3,"passeggiata");
	    myAgenda.add(e3);
	    Evento e4=new Evento(25,1,2024,12,1,"passeggiata");
	    myAgenda.add(e4);
	    Evento e5=new Evento(25,1,2024,13,1,"pranzo");
	    myAgenda.add(e5);
	    Evento e6=new Evento(25,1,2024,16,2,"commissioni varie");
	    myAgenda.add(e6);
	    Evento e7=new Evento(25,1,2024,15,3,"giardinaggio");
	    myAgenda.add(e7);
	    Evento.setDurataDefault(2);
	    Evento e8=new Evento(13,3,2024,10,"giardinaggio");
	    myAgenda.add(e8);
	    Evento e9=new Evento(13,3,2024,12,3,"piscina");
	    myAgenda.add(e9);
	    Evento e10=new Evento(10,3,2024,20,"cena con colleghi di lavoro");
	    myAgenda.add(e10);
	    Evento e11=new Evento(25,1,2025,7,12,"gita");
	    myAgenda.add(e11);
	    Evento e12=new Evento(13,3,2024,20,3,"torneo di briscola");
	    myAgenda.add(e12);
	    Evento e13=new EventoSpeciale(25,1,2024,9,7,"corso aggiornamento");
	    myAgenda.add(e13);
	    Evento e14=new EventoSpeciale(25,1,2025,10,3,"visita specialistica");
	    myAgenda.add(e14);
	    Evento e15=new EventoSpeciale(13,3,2024,11,3,"riunione lavoro");
	    myAgenda.add(e15);
	    Evento e16=new EventoSpeciale(13,3,2024,17,1,"dentista");
	    myAgenda.add(e16);
	    Evento e17=new EventoSpeciale(13,3,2024,7,13,"trasferta lavoro");
	    myAgenda.add(e17);
	    Evento e18=new Evento(13,3,2024,11,"pulizie");
	    myAgenda.add(e18);
	    Evento e19=new Evento(12,3,2024,11,"pulizie");
	    myAgenda.add(e19);
	    Evento e20=new EventoSpeciale(24,1,2024,9,4,"esame programmazione");
	    myAgenda.add(e20);
	    Evento e21=new Evento(25,2,2025,7,12,"gita (nuova data)");
	    myAgenda.add(e21);
	    System.out.println("# # # # # # # EVENTI IMPORTANTI # # # # # # # ");
	    //posso fare qualcosa di diverso
	    for (Evento e : myAgenda.eventi()) {
		if (e.eventoImportante()) {
		    System.out.println(e);
		}
	    }
	    //o anche
	    /* List<Evento> eventiImportanti = new ArrayList<>();

	    for (Evento e : myAgenda.eventi()) {
		if (e.eventoImportante()) {
		    eventiImportanti.add(e);
		}
	    }

	    for (Evento e : eventiImportanti) {
		System.out.println(e);
	    }
	    */
	    // System.out.println("cosa devo stampare");
	    // System.out.print(myAgenda.toString("eventiImportanti"));
	    List<Data> lD=myAgenda.dateConEventi();
	    Collections.sort(lD);
	    System.out.println("# # # # # # # DATE COME EVENTI # # # # # # # ");
	    for(Data d:lD)
		System.out.println(d+"\n");
	  

	} //end main

}//end class 
 // @ [] {}  # 
