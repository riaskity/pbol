/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;
import java.RMI.RemoteException;
import java.RMI.server.UnicastRemoteObject;
/**
 *
 * @author Laptop
 */
public class CalculatorImple extends UnicastRemoteObject implements Calculator
{
    protected CalculatorImple() throws RemoteException 
    {
        super();
    }
    public long add(long a, long b) throws RemoteException 
    {
        return a+b;
    }
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqkqRxT5
