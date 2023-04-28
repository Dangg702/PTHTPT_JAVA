package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface IDict extends Remote {
	public String dictENtoVn(String word) throws RemoteException;
	public int addWord(String word, String mean) throws RemoteException;
	public int updateMean(String word, String mean) throws RemoteException;
	public int delete(String word) throws RemoteException;
}
