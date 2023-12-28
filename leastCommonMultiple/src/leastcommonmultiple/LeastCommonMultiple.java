/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leastcommonmultiple;

import java.util.*;

class LeastCommonMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), LCM = 1;
        if (num1 % num2 != 0 && num2 % num1 != 0) {
            LCM = num1 * num2;
        } else if (num1 % num2 == 0) {
            int a = num1 / num2;
            LCM = num2 * a;
        } else if (num2 % num1 == 0) {
            int a = num2 / num1;
            LCM = num1 * a;
        }
        System.out.println("LCM of number is :" + LCM);
    }
}
