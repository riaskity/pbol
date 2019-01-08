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

public class CalculatorClient 
{
    public static void main(String[] args) 
    {
        try
        {
            Calculator c = (Calculator) Naming.lookup("//127.0.0.1:1020/CalculatorService");
            System.out.println("addition : "+c.add(20, 15));
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}


//Read more: http://mrbool.com/rmi-remote-method-invocation-in-java/28575#ixzz5bqlI3uYr
