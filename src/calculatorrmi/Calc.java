/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;
import java.RMI.Remote;
import java.RMI.RemoteException;
/**
 *
 * @author Laptop
 */
public interface Calci extends Remote
{
    public long add(long a, long b) throws RemoteException;
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqkbU4h6
