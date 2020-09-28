package m0.rmitaste.example.server;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.lang.Float;

/**
 * Written by Marcin Ogorzelski (mzero - @_mzer0)
 */
public class ClientAccountImpl extends UnicastRemoteObject implements ClientAccount
{
    private float balance = 0;
    private String pin = "";

    public ClientAccountImpl(float initialBalance) throws RemoteException
    {
        balance = initialBalance;
    }

    public void withdraw(float amount) throws RemoteException{
        System.out.println("withdraw called");
        balance = balance - amount;
    }

    public void deposit(Object amount) throws RemoteException {
        System.out.println("deposit called");
        balance = balance + (Float)amount;
    }

    public void setPin(String newPin) throws RemoteException{
        System.out.println("New pin: "+newPin);
        pin = newPin;
    }

    public float getBalance() throws RemoteException {
        System.out.println("getBalance called");
        return balance;
    }
}

