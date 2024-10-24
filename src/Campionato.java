import java.io.*;
import java.util.Scanner;
public class Campionato{
    Team[] teams;
    int squadrePresenti;
    final int TOTALE_SQUADRE = 20;
    
    public Campionato( String datafile ) {
        teams = new Team[TOTALE_SQUADRE];
        try{
        File f = new File(datafile);
        Scanner scan= new Scanner(f);

            
            for(int i=0; i<20 && scan.hasNextLine();i++){
            String line = scan.nextLine();
            teams[i]= new Team(line);
            squadrePresenti = i;
            }
            scan.close();
            
        
	    } catch ( Exception ex ) {
	    System.out.println("Errore in lettura file "+ ex.getMessage());
	    }
	}
	public String toString(){
	    String s ="\n Queste sono le squadre presenti nel campionato\n";
	    	for(Team t : teams){
	    s+= t + "\n";
	}
	return s;
	}
    public void aggiungiSquadra(Scanner scanner){
        if(squadrePresenti +1 >= TOTALE_SQUADRE){
            System.out.println("Attenzione non è più possibile aggiungere altre squadre");
            return;
        }
        System.out.println("Nome nuova squadra: ");
        String nuovaSquadra = scanner.nextLine();

        squadrePresenti = squadrePresenti + 1;
        teams[squadrePresenti] = new Team(nuovaSquadra);


    }
    public void rimuoviUltimasquadra(){
        if (squadrePresenti < 0){
            System.out.println("Attenzione: Non sono presenti squadre da eliminare");
        }
        teams[squadrePresenti] = null;
        squadrePresenti = squadrePresenti-1;
    }

    public void rimuoviSquadrapiacere(int posizione){
        if(posizione< 0 || posizione> TOTALE_SQUADRE-1){
            System.out.println("Attenzione: posizione invalida");
            return;
        }

        teams[posizione]=null;
        for(int i = posizione + 1;i<teams.length;i++){
            teams[i-1]=teams[i];
        }
        teams[TOTALE_SQUADRE-1] = null;
        squadrePresenti = squadrePresenti -1;
    }
    public void modificaSquadra(int posizione){
            if(posizione< 0 || posizione> TOTALE_SQUADRE-1){
            System.out.println("Attenzione: posizione invalida");
            return;
        }
	String squadranuova;
	teams[posizione]=null;
        teams[posizione]=squadranuova;
        for(int i = posizione + 1;i<teams.length;i++){
            teams[i-1]=teams[i];
        }
        teams[TOTALE_SQUADRE-1] = null;
        squadrePresenti = squadrePresenti -1;
    }
    }
    
}
