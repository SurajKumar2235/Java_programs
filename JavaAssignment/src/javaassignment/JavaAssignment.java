/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class JavaAssignment {

      private class circle{
        private float radii;
        circle(){
            radii=0;
        }
        circle(float n){
            this.radii=n;
        }
        public double calcArea(){
            return 3.14*radii*radii;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ansSolution.ComputeSeries();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle");
        float r=sc.nextFloat();
        circle c1 = new circle(5);
        System.out.println("area of circle is"+c1.calcArea());
    }
 
}
