/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ellipse;

/**
 *
 * @author suraj
 */
public class Ellipse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=-10;i<10;i+=0.1){
            for(int j=10;j<10;j+=0.1){
                if((Math.pow(i,2)/1)-(Math.pow(j+1, 2)/-100)>=1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }    
            }System.out.print("\n");
        }
    }
    
}
