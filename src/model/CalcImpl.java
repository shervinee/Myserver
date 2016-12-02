package model;

import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements Calc{

	public CalcImpl() throws Exception{
		java.rmi.Naming.rebind("havij",this);//share kardane havij tu server
	}
	
	public int sum(int x, int y) throws Exception {
		int result = x + y;
		System.out.println("sum Executed in server ...");
		return result;
	}

	@Override
	public int minus(int x, int y) throws Exception {
		int result = x - y;
		System.out.println("minus Executed in server ...");
		return result;
	}
	
	

}
