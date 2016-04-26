import java.rmi.*;

public interface Interface extends Remote
{
    //Operatii de baza
    public void adunare(double x, int nr) throws RemoteException;
    public void scadere(double x, int nr) throws RemoteException;
    public void inmultire(double x, int nr) throws RemoteException;
    public void impartire(double x, int nr) throws RemoteException;
    
    //Operatii extinse
    public void inversare(int nr) throws RemoteException;
    public void putere(int x, int nr) throws RemoteException;
    public void factorial(int nr) throws RemoteException;
    public void radical(int nr) throws RemoteException;
    //Operatii memorie
    public void adunareM(int nr) throws RemoteException;
    public void scadereM(int nr) throws RemoteException;
    
    public void stocareM (int nr) throws RemoteException;
    public void citireM (int nr) throws RemoteException;
    public void stergereM (int nr) throws RemoteException;
    
    //Alte operatii
    public boolean stare(int nr) throws RemoteException;
    public int codErr(int nr) throws RemoteException;
    public double actual(int nr) throws RemoteException;
    public double memorie(int nr) throws RemoteException;
	
    public int start()  throws RemoteException; // Asociaza un numar nou clientului pornit acum
    
    
   
}