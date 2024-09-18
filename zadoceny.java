//cel sprawdzenie oceny
import java.util.Scanner; // importowanie klasy scanner do odczytu danych od uzytkownika
public class Main
{
	public static void main(String[] args) {
	    
	    //program wypisuje to co jest w nawiasie
		System.out.println("podaj liczbe ponktow");
	     // tworzenie obiektu Scanner do odczytu danych od uzytkownika
		Scanner sc = new Scanner(System.in);
		
		int ponkty = sc.nextInt(); // odczytanie ponktow jako liczby calkowitej
		// spradzenie oceny
		if(ponkty > 90){
		    // wyswietla tekst
		    System.out.println("ocena A");
		}
		else if(ponkty > 80){ //sprawdza ocene 
		    //wyswietla tekst
		    System.out.println("ocena B");  
		}
		else if(ponkty > 70){ //sprawdza ocene 
		    //wyswietla tekst
		    System.out.println("ocena C");  
		}
		else if(ponkty > 60){ //sprawdza ocene 
		    //wyswietla tekst
		    System.out.println("ocena D"); 
		}
		else if(ponkty <60 ){ //sprawdza ocene 
		    //wyswietla tekst
		    System.out.println("ocena F");
		}
		
		
		
		
		  // Zamkniecie skanera
        sc.close();
	}
}