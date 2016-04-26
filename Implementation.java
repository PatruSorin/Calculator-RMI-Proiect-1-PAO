import java.rmi.*;
import java.rmi.server.*;
import java.io.*;

public class Implementation extends UnicastRemoteObject
        implements Interface {
        
   public static int nrID = -1;
	public static double [] valori = new double [100];
	public static double [] valori_memorate = new double [100];
	public static boolean [] stari = new boolean[100];
	public static int [] cod_eroare = new int[100];

public Implementation() throws RemoteException, IOException 
	{
		for(int i=0; i<100; i++)
		{
                        cod_eroare[i] = 0;
                        
			valori[i] = valori_memorate[i] = 0.0; 
			stari[i] = true;
		}
    }

@Override
	public void adunare (double x, int nr) throws RemoteException
	{
                cod_eroare[nr] = 0;
                
		valori[nr] += x;
		stari[nr] = true; 
	}
	@Override
	public void scadere (double x, int nr) throws RemoteException
	{       
                cod_eroare[nr] = 0;
                
		valori[nr] -= x;
		stari[nr] = true; 
	}
	@Override
	public void inmultire(double x, int nr) throws RemoteException
	{       
                cod_eroare[nr] = 0;
                
		valori[nr] *= x;
		stari[nr] = true; 
	}
	@Override
	public void impartire (double x, int nr) throws RemoteException
	{
		if(x == 0.0)
		{       
                        cod_eroare[nr] = 1;
                        
			stari[nr] = false; 
			return;
		}
                cod_eroare[nr] = 0;
                
		valori[nr] /= x;
		stari[nr] = true; 
	}
	@Override
	public void inversare (int nr) throws RemoteException
	{
		cod_eroare[nr] = 0;
                
		
		valori[nr] = 1/valori[nr];
		stari[nr] = true; 
	}
	@Override
	public void putere (int x, int nr) throws RemoteException
	{
		if(x == 0)
		{
                        cod_eroare[nr] = 0;
                    
			valori[nr] = 1;
			stari[nr] = true; 
			return;
		}
		if(x < 0)
		{       
                        cod_eroare[nr] = 0;
                    
			putere(nr, -x);
			valori[nr] = 1 / valori[nr];
			stari[nr] = true; 
			return;
		}
		double orig = valori[nr];
		while(x-1 > 0)
		{
			x--;
			valori[nr] = valori[nr] * orig;
		}
                
                cod_eroare[nr] = 0;
                
		stari[nr] = true; 
		
	}
	@Override
	public void factorial (int nr) throws RemoteException
	{
                cod_eroare[nr] = 0;
            
		int intizat = (int)valori[nr];
		int i = 1;
		for(int j = 1; j<= intizat; j++)
			i *= j;
		valori[nr] = (double) i;
		stari[nr] = true;
	}
	@Override
	public void radical (int nr) throws RemoteException
	{       
                cod_eroare[nr] = 0;
		valori[nr] = Math.sqrt(valori[nr]);
		stari[nr] = true; 
	}
	@Override
	public void adunareM (int nr) throws RemoteException
	{       
                cod_eroare[nr] = 0;
		valori_memorate[nr] += valori[nr];
		stari[nr] = true; 
	}
	@Override
	public void scadereM (int nr) throws RemoteException
	{       
                cod_eroare[nr] = 0;
		valori_memorate[nr] -= valori[nr];
		stari[nr] = true; 
	}
	@Override
	public void stocareM (int nr) throws RemoteException
	{   
                cod_eroare[nr] = 0;
                
		valori_memorate[nr] = valori[nr];
		stari[nr] = true; 
	}
	@Override
	public void citireM (int nr) throws RemoteException
	{
                cod_eroare[nr] = 0;
                
		valori[nr] = valori_memorate[nr];
		stari[nr] = true; 
	}
	@Override
	public void stergereM (int nr) throws RemoteException
	{   
                cod_eroare[nr] = 0;
                
		valori_memorate[nr] = 0;
		stari[nr] = true; 
	}
	@Override
	public boolean stare (int nr) throws RemoteException
	{
		return stari[nr];
	}
	@Override
	public int codErr (int nr) throws RemoteException
	{
		return cod_eroare[nr];
	}
	@Override
	public double actual (int nr) throws RemoteException
	{
		return valori[nr];
	}
	@Override
	public double memorie (int nr) throws RemoteException
	{
		return valori_memorate[nr];
	}
	@Override
	public int start () throws RemoteException
	{
		nrID++;
		return nrID;
	}
}
