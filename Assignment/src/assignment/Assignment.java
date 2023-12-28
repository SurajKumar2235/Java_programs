/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;

/**
 *
 * @author suraj
 */
public class Assignment {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ansQuestion1();
        //ansQuestion2();
        ansQuestion3();
        
        
    }

    private static void PrintArray(int[][] a,int []y) {
        System.out.println("\nupdated Augumented matrix\n");
        for(int i=0;i<3;i++){
            
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println(y[i]+"  ");
        
        }
    }
    private static void printArr(int[][] a){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
    private static void ansQuestion1() {
        int[][] a={{1,-2,1},{0,2,-8},{-4,5,7}};
        int[] y={0,0,0};
        PrintArray(a,y);
        
        for(int i =0;i<3;i++){
           a[2][i]=a[2][i]+4*a[0][i];//r3=r3+4r1
            y[2]=y[2]+4*y[0];
        }
        PrintArray(a,y);
        for(int i =0;i<3;i++){
           a[2][i]=3*a[1][i]+2*a[2][i];//r3=3r2+2r3
            y[2]=3*y[1]+2*y[2];
        }
        PrintArray(a,y);
        for(int i =0;i<3;i++){
           a[2][i]=-a[2][i]/2;//r3=-r3/2
            y[2]=-y[2]/2;
        }
        PrintArray(a,y);
        for(int i =0;i<3;i++){
           a[1][i]=a[1][i]+8*a[2][i];//r2=r2+8r3
            y[1]=y[1]+8*y[2];
        }
        PrintArray(a,y);
        for(int i =0;i<3;i++){
           a[1][i]=a[1][i]/2;//r2=r2/2
            y[1]=y[1]/2;
        }
        PrintArray(a,y);
        for(int i =0;i<3;i++){
           a[0][i]=a[0][i]+2*a[1][i]-a[2][i];//r1=r1+2r2-r3
            y[0]=y[0]+2*y[1]-y[2];
        }
        PrintArray(a,y);
        System.out.println("Hence the above matrix is solution of given System where {x1,x2,x3}={"+y[0]+","+y[1]+","+y[2]+"}");
    }

    private static void ansQuestion2() {
        int[][] a={{1,1,2},{1,2,3},{3,4,5}};
        printArr(a);//r2=r2-r1
        //r3=3r1-r3
        //r3=r2+r3
        //
        for (int i=0;i<3;i++){
            a[1][i]=a[1][i]-a[0][i];
        }
        printArr(a);
        for (int i=0;i<3;i++){
            a[2][i]=a[2][i]-3*a[0][i];
        }
        printArr(a);
        for (int i=0;i<3;i++){
            a[2][i]=a[2][i]-a[1][i];
        }
        printArr(a);
        for (int i=0;i<3;i++){
            a[2][i]=a[2][i]/(-2);
        }
        printArr(a);
        for (int i=0;i<3;i++){
            a[0][i]=a[0][i]-a[1][i];
        }
        printArr(a);
        for (int i=0;i<3;i++){
            a[1][i]=a[1][i]-a[2][i];
            a[0][i]=a[0][i]-a[2][i];
        }
        printArr(a);
        System.out.println("final row echelon form is :");
        printArr(a);
    }

    private static void ansQuestion3() {
        //det(A-yI)=0
        int[][] a={{5,2},{2,1}};
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                
            }
        }
    }
    
}
