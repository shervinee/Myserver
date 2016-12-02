package model;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws Exception {
		java.rmi.registry.LocateRegistry.createRegistry(1099);
		CalcImpl calcImpl = new CalcImpl();

	}

}
