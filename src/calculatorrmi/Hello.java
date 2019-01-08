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
//public class Hello {
public interface Hello extends Remote {
String Hello() throws RemoteException;
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqievO3E
 

