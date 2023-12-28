/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatertwo;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class GreaterTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number");
        int num1=sc.nextInt(),num2=sc.nextInt();
        if(num1<num2){
            System.out.println(num2 +" is Greater");
        }
        else if(num1==num2){
            System.out.println(num1 +"&"+num2+"are Equal");
        }
        else {
            System.out.println(num2 +" is Greater");
        }
        String s="hellp kijf ";
        String st=s.strip();
        System.out.print(st);
    }
    
}
