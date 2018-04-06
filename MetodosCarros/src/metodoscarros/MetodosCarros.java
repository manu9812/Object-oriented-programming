/*
 *este ejercicio es como se aplica las acciones a unos objetos
cuya clase es carros 
 */
package metodoscarros;

/**
 *
 * @author manuela garcia
 *  4 abril 2018
 */
public class MetodosCarros {

    /**
     * esta es la clase principal de los objetos 
     */
    public static void main(String[] args) {
        // crearemos todos los objetos e invocamos sus acciones 
        
        
        TiposCarros Camiones= new  TiposCarros(); // se crea el objeto camiones 
        System.out.println(" EL CAMIÓN VA HA REALIZAR LAS SIGUIENTES ACCIONES :"); // impresión por consola
        Camiones.arrancarCarro();  // se crea la acción arrancar carro
        Camiones.acelerarCarro();  // se crea la acción  acelerar carro
        Camiones.frenarCarro(); // se crea la acción frenar carro
        Camiones.retrocederCarro(); // se crea la acción frenar carro
        Camiones.apagarCarro(); // se crea la acción agapar carro
        System.out.println(" \n");  // se realiza un salto de linea 
        System.out.println(" --------------------------------------------------");
        
        TiposCarros  Campero= new TiposCarros();  // se crea un segundo obejto llamado campero 
        
        System.out.println(" EL CAMPERO VA  HA  REALIZAR LAS SIGUIENTES ACCIONES:"); // impresión por consola
        Campero.arrancarCarro(); // se crea la acción arrancar carro para el segundo objeto
        Campero.acelerarCarro();  // se crea la acción  acelerar carro  para el segundo objeto
        Campero.frenarCarro(); // se crea la acción frenar carro para el segundo objeto
        Campero.retrocederCarro();  // se crea la acción  retroceder carro para el segundo objeto
        Campero.apagarCarro(); // se crea la acción agapar carro para el segundo objeto
        System.out.println(" \n"); // se realiza un salto de linea 
        System.out.println(" --------------------------------------------------");
        
        TiposCarros  Automovil= new TiposCarros(); // se crea un tercer objeto llamado automovil
        
        System.out.println(" EL AUTOMOVIL VA  HA REALIZAR LAS SIGUIENTES ACCIONES:"); // impresión por consola
        Automovil.arrancarCarro(); // se crea la acción arrancar carro para el tercer objeto
         Automovil.acelerarCarro(); // se crea la acción  acelerar carro  para el tercer objeto
         Automovil.frenarCarro();  // se crea la acción frenar carro para el  tercer objeto
         Automovil.retrocederCarro(); // se crea la acción  retroceder carro para el  tercer objeto
         Automovil.apagarCarro();  // se crea la acción agapar carro para el tercer  objeto
         System.out.println(" \n"); // se realiza un salto de linea 
         System.out.println(" --------------------------------------------------");
        
        TiposCarros  Clasico= new TiposCarros(); // se crea un cuarto objeto llamado clasico 
        
        System.out.println(" EL  AUTO CLASICO VA  HA REALIZAR LAS SIGUIENTES ACCIONES :"); // impresión por consola 
        Clasico.arrancarCarro(); // se crea la acción arrancar carro para el  cuarto objeto
        Clasico.acelerarCarro();  // se crea la acción  acelerar carro  para el cuarto objeto
        Clasico.frenarCarro();  // se crea la acción frenar carro para el  cuarto objeto
        Clasico.retrocederCarro(); // se crea la acción  retroceder carro para el  cuarto objeto
        Clasico.apagarCarro();  // se crea la acción agapar carro para el cuarto  objeto
        System.out.println(" \n"); // se realiza un salto de linea 
        
        System.out.println(" EL PROGRAMA HA TERMINADO"); // impresión por consola  
        
    }
    
}
