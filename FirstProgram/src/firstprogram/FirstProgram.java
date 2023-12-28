/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogram;
/**
 *
 * @author suraj
 */
public class FirstProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(float i=-3;i<10;i+=0.1){
            for(float j=-3;j<10;j+=0.1){
                if(Math.pow(i+2,2)+Math.pow(j+1, 2)<=9){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }    
            }System.out.print("\n");
        }
        // TODO code application logic here
//       Scanner sc= new Scanner(System.in);
//       int button=sc.nextInt();
//       switch(button){
//           default:
//               System.out.println("!!!!!!!!!!!!!!");
//       
//           case 1:
//               System.out.println("hello suraj");
//               break;
//           case 2:
//               System.out.println("hello master");
//               break;
//           case 3:
//               System.out.println("hey suraj");
//               break;
//           }
////       System.out.print("enter number");
////       int a=sc.nextInt();
//       byte d='a';
//       
//       /*      sc.nextchar()  --gets new caracter
//               sc.nextLine()  --gets next line
//               sc.nextFloat() --gets next Float value
//               sc.nextDouble()--gets next double value
//               sc.nextByte()  --gets next Byte
//               */
//       System.out.println(a+"*1="+(a*1));
//       System.out.println(a+"*2="+(a*2));
//       System.out.println(a+"*3="+(a*3));
//       System.out.println(a+"*4="+(a*4));
//       System.out.println(a+"*5="+(a*5));
//       System.out.println(a+"*6="+(a*6));
//       System.out.println(a+"*7="+(a*7));
//       System.out.println(a+"*8="+(a*8));
//       System.out.println(a+"*9="+(a*9));
//       System.out.println(a+"*10="+(a*10));
//       
//       System.out.print("\nByte*Number\n"+d);
//    
        
    }
    
}
