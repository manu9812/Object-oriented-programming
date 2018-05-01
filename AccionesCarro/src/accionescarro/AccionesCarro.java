/*
 * 
 */
package accionescarro;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.time.Clock;
/**
 *
 * @author manuela garcia
 * fecha: 28 abril 2018
 */
public class AccionesCarro {

    /**
     * @param args the command line arguments
     * en esta clase se pretende crear los metodos de las acciones qu realizara el carro
     */
  
   
    // se declaran los atributos que tendra el carro
    String marca, color ;
        String    tamano;
        int modelo;
    long precio;
    
    /**
     * este metodo ermite mostrar todos los atributos que tiene el carro
     * @param marka
     * @param modelo
     * @param color
     * @param tamano
     * @param precio 
     */
    void MostrarDatosCarro (String marka, int modelo, String color, String tamano, long precio)
    {
        System.out.println(" la marca del carro es: " + marka);
        System.out.println(" el modelo del carro es: " + modelo);
        System.out.println(" el color del carro es:" + color);
        System.out.println(" el tamaño del carro es:"+ tamano);
        System.out.println(" el precio del carro es:"+ precio);
        System.out.println(" \n");
    }
    
    
    /**
     * este metodo genera un mensaje que muestra que el carro esta apagado
     */
    void ApagarCarro ()
    {
        
      System.out.println(" EL CARRO SE HA APAGADO");
      System.out.println(" \n");
    }
    
    /**
     * este metodo genera un mensaje que muestra que el carro se ha encendido
     */
    void EncenderCarro ()
    {
        
      System.out.println(" EL CARRO SE HA ENCENDIDO");
      System.out.println(" \n");
    }
    
    /**
     * este metodo permite incrementar la velicidad del carro en un rango dado
     * ademas imprime un mensaje por pantalla que visualiza dicho procedimiento
     * @param velocidad
     * @throws InterruptedException 
     */
    void AcelerarCarro (int velocidad) throws InterruptedException
    {
        for(int i=0;i<velocidad;i+=2)
        {
            System.out.println(" EL CARRO HA ACELERADO HASTA :" + i +"km/h");
           Thread.sleep(125);
        }

      System.out.println(" \n");
    }
    
    
    /**
     * este metodo permite frenar el carro en un rando dado
     * ademas imprime un mensaje por pantalla que visualiza dicho procedimiento de decremento de velocidad
     * @param frenado
     * @throws InterruptedException 
     */
    void FrenarCarro( int frenado) throws InterruptedException
    {
       
        for (int i=frenado; i>=0;i=i-2)
        {
            System.out.println(" EL CARRO ESTA FRENANDO A:" +   i + "km/h"); 
            Thread.sleep( 100);
        }
        
    }
   
}
