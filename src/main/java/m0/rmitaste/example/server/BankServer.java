package m0.rmitaste.example.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 * Written by Marcin Ogorzelski (mzero - @_mzer0)
 *
 * DEMO SERVER FOR RMITaste tool
 */

public class BankServer {
    public static void main(String[] args) throws Exception {
        int port = 1099;
        System.out.println("Demo server for RMITaste tool");
        LocateRegistry.createRegistry(port);
        Naming.bind("acc1", new ClientAccountImpl(1000));
        Naming.bind("acc2", new ClientAccountImpl(2000));
        System.out.println("Listening on: "+port);
    }
}
