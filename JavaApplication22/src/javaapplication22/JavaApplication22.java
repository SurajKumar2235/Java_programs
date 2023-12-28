/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;
class recursion{
int func (int n){
int result ;
if (n==1)
return 1;
result = func(n-1);
return result;
}
}
/**
 *
 * @author suraj
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
{recursion obj = new recursion();
System.out.print(obj.func(5));
 }
    
}
