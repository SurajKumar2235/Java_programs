/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatestcommondivisior;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class GreatestCommonDivisior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two nummbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        for (int i = 2; i <= num1 && i <= num2;) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = gcd * i;
            } else if (gcd == num2) {
                gcd = num2;
                break;
            } else if (gcd == num1) {
                gcd = num1;
                break;
            }
            i++;
        }
        System.out.println("GCD of number is :" + gcd);
        //System.out.print(System.currentTimeMillis());
    }

}
