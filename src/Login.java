import java.util.*;

public class Login {

		public static void loginAccess()
		
		Scanner scan = new Scanner(System.in);
		int loginCode;					//Deklarerar variabeln som användaren anger nedan.
		int[] loginDB = {201,202,203,302,503}; //Anställda med olika lösen och behörigheter. Hårdkodad array DB.
		
		String[] position = {"", "", "Kassa", "System admin", "", "Försäljningschef" };
		int i = 0;
		int j = 0;
		
	//	System.out.println("Välkommen!");
	//	System.out.print("Ange ditt lösenord: ");
	//	loginCode = scan.nextInt();//läser in angivet lösenord
				
		while ( i<loginDB.length )                  //Kontroll om lösenord existerar. Loopar genom vektorn.
		{
			if ( loginCode == loginDB [i]  ) 		//Om koden stämmer så sparas i som j.
			{	
				int accessNo = loginCode / 100;		//kontrollera första siffran
				System.out.println("Du har behörighet till: " + position[accessNo]);
				return;
			}
		i++;
		
		}
		if (i>j) {								//Om inte koden stämmer, dvs loopen har fullföljts utan att hitta rätt kod, så skrivs felmeddelandet ut.
			System.out.println("fel kod");
			}
					
}//end class