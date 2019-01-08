/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;
import java.RMI.Naming;
import java.RMI.RemoteException;
import java.RMI.RMISecurityManager;
import java.RMI.server.UnicastRemoteObject;


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqjsPXtn

/**
 *
 * @author Laptop
 */
public class HelloServerDemo extends UnicastRemoteObject
implements Hello {
public HelloServerDemo() throws RemoteException {
super();
}
public String Hello() {
System.out.println("Invocation to Hello was succesful!");
return "Hello World from RMI server!";
}
public static void main(String args[]) {
try {
// Creates an object of the HelloServer class.
HelloServer obj = new HelloServer();
// Bind this object instance to the name "HelloServer".
Naming.rebind("Hello", obj);
System.out.println("Hello bound in registry");
}
catch (Exception ex) {
System.out.println("error: " + ex.getMessage());
e.printStackTrace();
}
}
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqjzHuQm
