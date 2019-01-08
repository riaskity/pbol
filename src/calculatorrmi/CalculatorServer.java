/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;
import java.RMI.Naming;
/**
 *
 * @author Laptop
 */
public class CalculatorServer 
{
    CalculatorServer()
    {
        try
        {
            Calci c = new CalculatorImple();
            Naming.rebind("RMI://127.0.0.1:1020/CalculatorService", c);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        new CalculatorServer();
    }
}	


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bql6EEYm
