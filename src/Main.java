/*

4CIN-Programma che simula la classe più strana del mondo
Enrico Salvioli
10/10/2024
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Campionato seriea = new Campionato("data\\TEAMS.csv");

		Scanner scanner = new Scanner(System.in);
		int selezione;
		stampaMenu();
		do{
			System.out.print("Selezione: ");
			selezione = scanner.nextInt();
			scanner.nextLine();
			switch (selezione) {
				case 1 :
				stampaMenu();
				break;
				case 2 :
				System.out.println(seriea);
					
					break;
				case 3 :
				seriea.aggiungiSquadra(scanner);
				case 4 :
				seriea.rimuoviUltimasquadra();
				break;
				case 5 :
				System.out.println("Squadra da rimuovere: ");
				int posizione = scanner.nextInt();
				seriea.rimuoviSquadrapiacere(posizione);
				break;
				case 6 :
			
				default:
					break;
			}
		} while(selezione != 0);
		

	    //System.out.println(seriea);
	    
	    
	

	}
	public static void stampaMenu(){
		System.out.println("Menu: ");
		System.out.println("0. Termina programma ");
		System.out.println("1. Stampa il menu ");
		System.out.println("2. Stampa squadre ");
		System.out.println("3. Aggiungi squadra ");
		System.out.println("4. Rimuovi ultima squadra ");
		System.out.println("5. Rimuovi una squadra a piacere ");
		System.out.println("6. Modifica nome squadra ");
		System.out.println("7. Salva modifiche ");
	}
}

