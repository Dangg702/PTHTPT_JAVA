package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args) throws RemoteException {
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("translate", new DictImpl());
		System.out.println("Server is running...");
	}
}
