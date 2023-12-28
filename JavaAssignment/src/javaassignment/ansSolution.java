/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class ansSolution {
    public static void ComputeSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of term you want to add in setries(1/2+2/3+3/4+.....n/n+1) :");
        double n = sc.nextDouble();
        float sum=0;
        for (;n>=1;n--){
            sum+=n/(n+1);
        }
        System.out.println(sum);
        
    }
    
}
