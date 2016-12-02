package model;

import java.rmi.Remote;

public interface Calc extends Remote{
	public int sum(int x, int y) throws Exception;
	public int minus(int x , int y)throws Exception;

}
