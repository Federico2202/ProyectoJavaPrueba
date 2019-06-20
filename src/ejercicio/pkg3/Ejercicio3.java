
package ejercicio.pkg3;

import java.util.Scanner;


public class Ejercicio3 {
    
    
    
    public static void main(String[] args) {
        
         Scanner leer = new Scanner (System.in);
        
        double X ,X2, X1, Y, Y2, Y1, distancia;
        
        //Formulas = X = X2-X1 , Y = Y2-Y1, D= raiz de X2+Y2
        System.out.println("Teniendo en cuenta la imagen");
        System.out.println("");
        System.out.println("Digite el valor de X2");
        X2 = leer.nextDouble();
        
        System.out.println("Digite el valor de X1");
        X1= leer.nextDouble();
        
        System.out.println("Digite el valor de Y2");
        Y2 = leer.nextDouble();
        
        System.out.println("Digite el valor de Y1");
        Y1 = leer.nextDouble();
        X = X2-X1 ;
        Y = Y2-Y1;
        
        distancia = Math.sqrt( Math.pow(Y, 2)+Math.pow(X ,2) );

        System.out.println("La distancia entre los dos puntos es de: " + distancia);
        
    }
 
}
