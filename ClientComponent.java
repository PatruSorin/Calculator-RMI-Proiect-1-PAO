import java.rmi.*;
import java.util.*;

public class ClientComponent 
{
    private static final String host = "localhost";
	private static int nrC = 0;
	public static void cls (double val, double mem)
	{
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("OPERAND: " + val + "\t\t MEMORIE: " + mem + "\n" );
	}
	public static void printHeader()
	{
		
		for(int i=0; i<80; i++) System.out.print("=");
		System.out.print("\n\n");
		
	}
	 private static void pressAnyKeyToContinue()
 { 
        System.out.println("    Apasati orice tasta pentru a continua...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
    public static void main(String[] args) 
    {
        try 
        {
            Interface calc = (Interface) Naming.lookup("rmi://" 
                    + host + "/Machine");

			int choice = 1;
			double t; int y;
			Scanner sc = new Scanner(System.in);
			nrC = calc.start(); // Pornit.
			while(choice != 0)
			{
				cls(calc.actual(nrC), calc.memorie(nrC));
				
				printHeader();
				System.out.println("	Operatii asupra operandului: ");
				System.out.println("    1. Adunati; 2. Scadeti; 3. Inmultiti; 4. Impartiti");
				System.out.println("    5. Inversati; 6. Ridicati la putere; 7. Factorializati; 8. Radical");
				System.out.println("    Operatii cu memoria: ");
				System.out.println("    9. Adunati; 10. Scadeti; 11. Stocati; 12. Cititi; 13. Stergeti");
				System.out.println("    0. Inchidere aplicatie.");
				System.out.println("");
				System.out.print("    Pentru a incepe, tastati numarul operatiei dorite: ");
				
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						cls(calc.actual(nrC), calc.memorie(nrC));
						System.out.println("Introduceti valoarea de adunat: ");
						t = sc.nextDouble();
						calc.adunare(t, nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 2:
						cls(calc.actual(nrC), calc.memorie(nrC));
						System.out.println("Introduceti valoarea de scazut: ");
						t = sc.nextDouble();
						calc.scadere(t, nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 3:
						cls(calc.actual(nrC), calc.memorie(nrC));
						System.out.println("Introduceti valoarea de inmultit: ");
						t = sc.nextDouble();
						calc.inmultire(t, nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 4:
						cls(calc.actual(nrC), calc.memorie(nrC));
						System.out.println("Introduceti valoarea de impartit: ");
						t = sc.nextDouble();
						calc.impartire(t, nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 5:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.inversare(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 6:
						cls(calc.actual(nrC), calc.memorie(nrC));
						System.out.println("Introduceti puterea: ");
						y = sc.nextInt();
						calc.putere(y, nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 7:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.factorial(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 8:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.radical(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 9:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.adunareM(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 10:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.scadereM(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 11:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.stocareM(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 12:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.citireM(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
					case 13:
						cls(calc.actual(nrC), calc.memorie(nrC));
						calc.stergereM(nrC);
						if(calc.stare(nrC))
							System.out.println("[OK] Operatie finalizata.");
						else System.out.println("[ERR] Eroare! Codul erorii pentru depanare: " + calc.codErr(nrC));
						pressAnyKeyToContinue();
					break;
				}
				
			}
				
        } 
        catch (ConnectException conEx) 
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
