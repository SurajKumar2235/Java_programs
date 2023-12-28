/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package series.fabonacci;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class SeriesFabonacci {

    public static void seriesFabonacci(int n) {
        int i = 0, j = 1, k;
        for (int a = 0; a < n; a++) {
            k = i + j;
            System.out.print(i +" ");
            i = j;
            j = k;

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int term;
        System.out.println("enter no.  of term you want to print");
        term = sc.nextInt();
        seriesFabonacci(term);
    }

}
