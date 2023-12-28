/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parabola;

/**
 *
 * @author suraj
 */
public class Parabola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=-16;i<17;i+=1){
            for(int j=-15;j<20;j+=1){
                if(-4*3*i>=Math.pow(j, 2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }    
            }System.out.print("\n");
        }
        
    }
    
}
