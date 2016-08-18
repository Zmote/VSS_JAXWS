package ch.hsr.vss.w04;

import java.rmi.RemoteException;

public class CalculatorClient {
	public static void main(String[] args) throws RemoteException {
		CalculatorProxy cProxy  = new CalculatorProxy();
		System.out.println("3 + 4 = " + cProxy.add(3, 4));
	}

}
