import java.util.*;

public class Login {

		public static void loginAccess()
		
		Scanner scan = new Scanner(System.in);
		int loginCode;					//Deklarerar variabeln som anv�ndaren anger nedan.
		int[] loginDB = {201,202,203,302,503}; //Anst�llda med olika l�sen och beh�righeter. H�rdkodad array DB.
		
		String[] position = {"", "", "Kassa", "System admin", "", "F�rs�ljningschef" };
		int i = 0;
		int j = 0;
		
	//	System.out.println("V�lkommen!");
	//	System.out.print("Ange ditt l�senord: ");
	//	loginCode = scan.nextInt();//l�ser in angivet l�senord
				
		while ( i<loginDB.length )                  //Kontroll om l�senord existerar. Loopar genom vektorn.
		{
			if ( loginCode == loginDB [i]  ) 		//Om koden st�mmer s� sparas i som j.
			{	
				int accessNo = loginCode / 100;		//kontrollera f�rsta siffran
				System.out.println("Du har beh�righet till: " + position[accessNo]);
				return;
			}
		i++;
		
		}
		if (i>j) {								//Om inte koden st�mmer, dvs loopen har fullf�ljts utan att hitta r�tt kod, s� skrivs felmeddelandet ut.
			System.out.println("fel kod");
			}
					
}//end class