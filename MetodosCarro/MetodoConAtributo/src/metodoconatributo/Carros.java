/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoconatributo;

/**
 *
 * @author Administrador
 */
public class Carros {
    
    String marca, modelo, color ;
        String    tamano;
    long precio;
    
    void ArrancarCarro (String marka, String modelo, String color, String tamaño, long precio)
    {
        System.out.println(" el carro " + marka + " de modelo " + modelo + " , color "+ color + " , tamaño  " + tamaño + " de precio " + precio + " ha arrancado ");
        System.out.println(" \n");
    }
    
    
    void AcelerarCarro ( String marka, String modelo, String color, String tamaño, long precio)
    {
        
      System.out.println(" el carro " + marka + " de modelo " + modelo + " , color "+ color + " , tamaño es " + tamaño + " de precio " + precio + " ha acelerado ");
      System.out.println(" \n");
    }
     
    void FrenarCarro ( String marka, String modelo, String color, String tamaño, long precio)
    {
      System.out.println(" el carro " + marka + " de modelo " + modelo + " , color "+ color + " ,  tamaño es " + tamaño + " de precio " + precio + " ha frenado ");
      System.out.println(" \n");
    }
    
    
     
     
      void  RetrocederCarro( String marka, String modelo, String color, String tamaño, long precio)
    {
      System.out.println(" el carro " + marka + " de modelo " + modelo + " , color "+ color + " , tamaño es " + tamaño + " de precio " + precio + " ha retrocedido ");
      System.out.println(" \n");
    }
      
      
       void ApagarCarro ( String marka, String modelo, String color, String tamaño, long precio)
    {
      System.out.println(" el carro " + marka + " de modelo " + modelo + " , color "+ color + " , tamaño es " + tamaño + "  de precio " + precio + " se ha apagado  ");
    }
    
    
}
