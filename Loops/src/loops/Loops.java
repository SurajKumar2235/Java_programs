/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

import java.util.*;

/**
 *
 * @author suraj
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, cp;
        char deli = 'y';
        cp = 0;
        int cn;
        cn = 0;
        int c0 = 0;
        while (deli == 'y' || deli == 'Y') {
            System.out.println("Enter the number");
            a = sc.nextInt();
            if (a < 0) {
                cn++;
            } else if (a > 0) {
                cp++;
            } else {
                c0++;
            }
            System.out.println("if you want to continue press Y/y else other key");
            deli = sc.next().charAt(0);
            if (deli == 'Y' || deli == 'y') {
//               System.out.println("lets continue...."+deli);
               continue;// break;
            }break;
        }
        System.out.println("Number of positive number are " + cp);
        System.out.println("Number of negetive number are " + cn);
        System.out.println("Number of positive number are " + c0);

    }

}
