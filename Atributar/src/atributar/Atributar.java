/*
 * ESTE ES MI PRIMER PROGRAMA DE FPOO
DONDE VOY A CREAR OBJETOS (INSTANCIAR)
Y ADEMAS VOY A CREAR ATRIBUTOS

 */
package atributar;

/**
 * 2 abril 2018
 * @author Manuela Garcia Maonsalve
 */
public class Atributar {

   
    /**
     * atributos de tipos de carro: ejemplo
     * camionetas, camiones
     */
    
    String marca= "fOTON", modelo= "2017", color= "NEGRO", tamaño=" MEDIANO";
    long precio= 150000000; // atributos de los tipos de carro "estos pertenecen a camiones "
    public static void main(String[] args) { // clase main 
         
        Atributar camiones= new Atributar(); // se crea el primer objeto llamado camiones 
         
        
        System.out.println(" ----------------------CAMION----------------------");
       
        System.out.println(" la marca del camión es:" +camiones.marca); // se imprime la marca del camión
        System.out.println(" el modelo del camión:" +camiones.modelo); // se imprime el modelo del camión
        System.out.println(" el color del camión es:" +camiones.color); // se imprime el color del camión
        System.out.println(" el tamaño del camión es:" +camiones.tamaño); // se imprime el tamaño del camión 
        System.out.println(" el precio del camión es:" +camiones.precio); // se imprime el precio del camión
        System.out.println(" \n"); // se imprime un salto de linea 
        
              
         Atributar campero= new Atributar(); // se crea el segundo obejto llamado campero 
   
         
        
        campero.marca="toyota"; // se crea un nuevo valor al atributo marca para el objeto campero 
        campero.modelo="2016"; // se crea un nuevo valor al atributo modelo para el objeto campero 
        campero.color="rojo";  // se crea un nuevo valor al atributo color  para el objeto campero 
        campero.tamaño="pequeño"; // se crea un nuevo valor al atributo tamaño para el objeto campero 
        campero.precio=150000000; // se crea un nuevo valor al atributo precio para el objeto campero 
        System.out.println("  ----------------------CAMPERO---------------------- ");
        System.out.println(" la marca del campero es:" +campero.marca); // se imprime la marca del campero
        System.out.println(" el modelo del campero es:" +campero.modelo); // se imprime el modelo del campero
        System.out.println(" el color del campero es:" +campero.color); // se imprime el color del campero
        System.out.println(" el tamaño del campero es:" +campero.tamaño); // se imprime el tamaño del campero
        System.out.println(" el precio del campero es:" +campero.precio); // se imprime el precio del campero
        System.out.println(" \n"); // se realiza un salto de linea 
        
        Atributar automovil= new Atributar(); // se crea un tercer obejto llamado automovil
   
        
        
        automovil.marca="nissan"; // se crea un nuevo valor al atributo marca para el objeto automovil 
        automovil.modelo="2018"; // se crea un nuevo valor al atributo modelo para el objeto automovil 
        automovil.color="azul"; // se crea un nuevo valor al atributo color para el objeto automovil 
        automovil.tamaño="pequeño"; // se crea un nuevo valor al atributo tamaño para el objeto automovil 
        automovil.precio=70000000; // se crea un nuevo valor al atributo precio  para el objeto automovil 
        System.out.println("  ----------------------AUTOMOVIL----------------------");
        System.out.println(" la marca del automovil es:" +automovil.marca); // se imprime la marca del automovil
        System.out.println(" el modelo dle automovil es:" +automovil.modelo); // se imprime el modelo del automovil
        System.out.println(" el color del automovil es:" +automovil.color); // se imprime el color del automovil
        System.out.println(" el tamaño del automovil es:" +automovil.tamaño); // se imprime el tamaño del automovil
        System.out.println(" el precio del automovil es:" +automovil.precio); // se imprime el precio del automovil
         System.out.println(" \n"); // se realiza un salto de linea 
         
         
        Atributar clasico= new Atributar();
   
        
        
        clasico.marca="renault"; // se crea un nuevo valor al atributo marca para el objeto clasico
        clasico.modelo="2017"; // se crea un nuevo valor al atributo modelo para el objeto clasico
        clasico.color="blanco"; // se crea un nuevo valor al atributo color para el objeto clasico
        clasico.tamaño="mediano"; // se crea un nuevo valor al atributo tamaño para el objeto clasico
        clasico.precio=95000000; // se crea un nuevo valor al atributo  precio para el objeto clasico
        System.out.println("  ----------------------AUTO CLASICO ---------------------- ");
        System.out.println(" la marca del auto clasico es:" +clasico.marca); // se imprime la marca del auto clasico
        System.out.println(" el modelo del auto clasico es:" +clasico.modelo); // se imprime el modelo del auto clasico
        System.out.println(" el color del auto clasico es:" +clasico.color); // se imprime el color del auto clasico 
        System.out.println(" el tamaño del auto clasico es:" +clasico.tamaño); // se imprime el tamaño del auto clasico
        System.out.println(" el precio del auto clasico  es:" +clasico.precio); // se imprime el precio del auto clasico 
        
        System.out.println(" \n"); // se realiza un salto de linea 
        System.out.println(" EL PROGRAMA HA FINALIZADO"); // impresión por consola 

    }
    
}
