/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringreverse;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class StringReverse {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sb,rev;
        Scanner sc = new Scanner(System.in);
        var op=System.out;
        op.println("enter the statement to reverse");
        sb=sc.nextLine();char j;
        rev=String.valueOf(sb.charAt(sb.length()-1));
        for (int i=1;i<sb.length();i++){
            j=sb.charAt(sb.length()-1-i);
            rev = rev.concat(String.valueOf(j));
        }
        op.println(rev+"\n");
        String sc1=sb.concat("hello");
        op.print(sc1);
        
    }

}
