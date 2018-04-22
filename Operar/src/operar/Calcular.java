/*
 *en esta clase vamos a crear nuestros metodos para calcular operaciones
 */
package operar;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author MANUELA GARCIA
 * 16/04/2018
 * CALCULAR CON ENTEROS
 * 
 */
public class Calcular {
    int a, b;
    
    
     int sumarNumeros(int a, int b)
     {
         return (a+b);
     }
     
     int  RestarNumeros( int a, int b)
     {
         return (a-b);
     }
     
     double areaCirculo(int Radio)
     {
         return (3.1416*Radio*Radio);
                 
     }
     
     double TeoremaPitagoras(int a, int b,int mult, int radical)
     {
         mult=((a*a)+(b*b));
         
         radical= (int) Math.sqrt(mult);
         return radical;
     }
     
        
        
    
    boolean Criba()      
    {
         System.out.println("Escriba el valor de n para los primos entre el rango 0 - n ");

	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();

	        long start, end;
	        start = System.currentTimeMillis();

	        int tope = (int) Math.floor(Math.sqrt(N));

	        boolean[] primos = new boolean[N + 1];

	        for (int i = 2; i <= tope; i++) {
	            if (primos[i] == false) {
	                for (int j = i; j <= N/ i; j++) {
	                    primos[j * i] = true;
	                }
	            }
	        }

	        int count = 1;
	        for (int i = 2; i < N; i++) {
	            if (primos[i] == false) {
	                count++;
	                System.out.printf("%10d", i);
	            }
	            if (count == 10) {
	                count = 1;
	                System.out.println("\n");
	            }
	        }
	        end = System.currentTimeMillis();
	        System.out.println("\n");
	        
        return true;
	    }
    }
    
	


