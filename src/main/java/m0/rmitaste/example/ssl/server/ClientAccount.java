package m0.rmitaste.example.ssl.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Written by Marcin Ogorzelski (mzero - @_mzer0)
 */

public interface ClientAccount extends Remote{
    public void withdraw(float amount) throws RemoteException;
    public void deposit(Object amount) throws RemoteException;
    public void setPin(String pin) throws RemoteException;
    public float getBalance() throws RemoteException;
}