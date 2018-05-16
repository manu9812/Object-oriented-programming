/*
 *en este proyecto vamos a usar los metodos get y set para encapsular 
atributos de las diferentes clases
 */
package emcapsulamiento;

/**
 *
 * @author Manuela Garcia Monsalve
 * 16 mayo 2018
 */
public class Emcapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creando nuestros objetos
       /**
        * se crean 5 objetos que pertenecen a 5 usuarios distintos
        */
        Usuario usu1= new Usuario();
         Usuario usu2= new Usuario();
         Usuario usu3= new Usuario();
         Usuario usu4= new Usuario();
         Usuario usu5= new Usuario();
         
         //se invoca cada unos de los objetos y se les asignan valores a los atributos 
         
         usu1.setUsuario("jorge123");
         usu1.setNombre("jorge");
         usu1.setApellidos("lopez");
         usu1.setClave("12345");
         usu1.setEmail("jorgep23@gmail.com");
         usu1.setCedula("123464776");
         
         usu2.setUsuario("daniela34");
         usu2.setNombre("Daniela");
         usu2.setApellidos("Roldan");
         usu2.setClave("84578934");
         usu2.setEmail("danielr@gmail.com");
         usu2.setCedula("12389789");
         
         
         usu3.setUsuario("esteban123");
         usu3.setNombre("Esteban");
         usu3.setApellidos("perez");
         usu3.setClave("12343fsd5");
         usu3.setEmail("este435@gmail.com");
         usu3.setCedula("1234645234");
         
         usu4.setUsuario("nora454");
         usu4.setNombre("Nora");
         usu4.setApellidos("Estrada");
         usu4.setClave("12345#45");
         usu4.setEmail("noel672@gmail.com");
         usu4.setCedula("12398034");
         
         
         usu5.setUsuario("fernando8988");
         usu5.setNombre("fernando");
         usu5.setApellidos("Garcia");
         usu5.setClave("12345#garcia");
         usu5.setEmail("ferGAR@gmail.com");
         usu5.setCedula("12346456");
         
         
       // se invoca el metodo mostrar datos para cada uno de los objetos para asi poder obeservar sus datos en pantalla  
       usu1.mostrarDatos();
       usu2.mostrarDatos();
       usu3.mostrarDatos();
       usu4.mostrarDatos();
       usu5.mostrarDatos();
        
        
    }
    
}
