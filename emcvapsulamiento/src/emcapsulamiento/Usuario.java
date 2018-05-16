/*
 *en esta clase vamos a crear los metodos get and set y nuestros atributos a en´capsular
 */
package emcapsulamiento;

/**
 *
 * @author Manuela Garcia Monsalve
 * 16 mayo 2018
 */
public class Usuario {
   public  String usuario, nombre, apellidos;
    private String clave, email;
    private String cedula;
    
      String getUsuario(){
        return this.usuario;
       }
     
     void setUsuario(String usu){
         usuario=usu;
     }
    //--------------------------------- 
      String getNombre(){
        return this.nombre;
       }
     
     void setNombre(String nom){
         nombre=nom;
     }
    //--------------------------------- 
     
      String getApellidos(){
        return this.apellidos;
       }
     
     void setApellidos(String ape){
         apellidos=ape;
     }
    //--------------------------------- 
    
     String getClave(){
        return this.clave;
       }
     
     void setClave(String cla){
         clave=cla;
     }
     //--------------------------------- 
     
      String getEmail(){
        return this.email;
       }
     
     void setEmail(String ema){
         email=ema;
     }
     
     //--------------------------------- 
      String getCedula(){
        return this.cedula;
       }
     
     void setCedula(String ced){
         cedula=ced;
     }
     
     
     
    /**
     * este metodo permite mostrar los datos de cada uno de los usuarios 
     */
    void mostrarDatos(){
        System.out.println("--------------------------------------");
        System.out.println("los datos de usuario son: ");
        System.out.println("nombre del usuario: "+ usuario);
        System.out.println("bombre de la persona: "+ nombre + " "+ apellidos);
        System.out.println("clave del usuario : "+ clave);
        System.out.println("email del usuario : " + email);
        System.out.println("cedula del usuario : " +cedula);
        System.out.println("\n");
        
        
      
    }
    
}
