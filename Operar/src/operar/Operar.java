/*
 * calcular dentro de los metodos diferentes tipos de operaciones, con diferentes tipos de datos
 */
package operar;

import java.util.Scanner;

/**
 *
 * @author Mnuela García
 */
public class Operar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        int total;
        int r=7;
        int a=10;
        int b=5;
        int N = 0;
     
       
        Calcular Operar= new Calcular();
        total=Operar.sumarNumeros(54, 77);
        System.out.println(" SUMA ");
        System.out.println(" la suma de los numeros es: " + total);
        System.out.println(" \n");
        
        
        System.out.println("RESTA");
        System.out.println(" la resta total es: " + Operar.RestarNumeros(45, 88));
        System.out.println(" \n");
            
        System.out.println(" AREA DEL RADIO ");
        System.out.println(" el area del ciculo de radio : " + r + " es: " + Operar.areaCirculo(r) );
        System.out.println("\n");
        
        
        System.out.println(" TEOREMA DE PITAGORAS");
        System.out.println(" el resultado del teorema de pitagoras: " + "\n" +" el cateto opuesto con valor:" + a + "\n"+ "el cateto adyacente con valor: " + b + " que da como resultado " + Operar.TeoremaPitagoras(a, b, b, total));
        System.out.println("\n");
        
        System.out.println(" CRIBA DE ERASTOSTENES ");
        
        Operar.Criba();
    }
    
}
