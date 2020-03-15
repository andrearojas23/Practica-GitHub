/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciongral;

import java.util.Scanner;
public class ECUACIONGRAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ecuacion = new Scanner(System.in);
       float  b, a=0, c, x ,x2;
    System.out.print("Introduce a: ");
      a = ecuacion.nextInt();
    System.out.print("Introduce b : ");
      b = ecuacion.nextInt();
    System.out.print("Introduce c :");
      c = ecuacion.nextInt();
        if (a==0) {
         System.out.print("Introduce un numero diferente a 0 ");   
            
        }
    
    else  {
        x=(float) (-(b)+Math.sqrt (b*b-4*a*c/2*a));   
        x2=(float) (-(b)+Math.sqrt (b*b-4*a*c/2*a));
           
    System.out.println("El resultado de x1 es:"+x ); 
    System.out.println("El resultado de x2 es:" +x2); 
    System.out.println("Si el resultado es = NaN, significa que tiene raiz imaginaria.");
        }
        
    }
    
}
