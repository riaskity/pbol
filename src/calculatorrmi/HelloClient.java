/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;
import java.RMI.Naming;
import java.RMI.RemoteException;
/**
 *
 * @author Laptop
 */
public class HelloClient {
static String message = "blank";
// The Hello object "obj" is the identifier that is

// the Hello interface.
static Hello obj = null;
public static void main(String args[])
{
try {
obj = (Hello)Naming.lookup("//"
+ "kvist.cs.umu.se"
+ "/Hello");
message = obj.Hello();
System.out.println("Message from the RMI-server was: \""
+ message + "\"");
}
catch (Exception e) {
System.out.println("HelloClient exception: "
+ e.getMessage());
e.printStackTrace();
}
}
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqjMgf6i
    

