/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoscarros;

/**
 *
 * @author manuela garcia
 */
public class MetodosConAtributos {
    
     public static void main(String[] args) {
      
        
        
        MetodosCarros camiones= new MetodosCarros();
        
        System.out.println(" -----------------------CAMIONES--------------------------");
        System.out.println(" \n");
        
        camiones.ArrancarCarro("Dodge", "2018", "rojo", "mediano", 15000000);
        camiones.AcelerarCarro("Dodge", "2018", "rojo", "mediano", 15000000);
        camiones.FrenarCarro("Dodge", "2018", "rojo", "mediano", 15000000);
        camiones.RetrocederCarro("Dodge", "2018", "rojo", "mediano", 15000000);
        camiones.ApagarCarro("Dodge", "2018", "rojo", "mediano", 15000000);
        System.out.println(" \n");
        
        
        System.out.println(" -----------------------CARROS--------------------------");
        System.out.println(" \n");
          MetodosCarros  automoviles= new MetodosCarros ();
        
        automoviles.ArrancarCarro("chevrolet", "2017", "azul", "pequeño", 13000000);
        automoviles.AcelerarCarro("chevrolet", "2017", "azul", "pequeño", 13000000);
        automoviles.FrenarCarro("chevrolet", "2017", "azul", "pequeño", 13000000);
        automoviles.RetrocederCarro("chevrolet", "2017", "azul", "pequeño", 13000000);
        automoviles.ApagarCarro("chevrolet", "2017", "azul", "pequeño", 13000000);
        System.out.println(" \n");
       
        
        System.out.println(" -----------------------CLASICO--------------------------");
        System.out.println(" \n");
         MetodosCarros  clasico = new MetodosCarros ();
      
        clasico.ArrancarCarro("ford","2016", "negro", "pequeño", 5000000);
        clasico.AcelerarCarro("ford","2016", "negro", "pequeño", 5000000);
        clasico.FrenarCarro("ford","2016", "negro", "pequeño", 5000000);
        clasico.RetrocederCarro("ford","2016", "negro", "pequeño", 5000000);
        clasico.ApagarCarro("ford","2016", "negro", "pequeño", 5000000);
        System.out.println(" \n");
        
        
        
        System.out.println(" -----------------------CAMPERO--------------------------");
        System.out.println(" \n");
        MetodosCarros  campero = new MetodosCarros ();
        
        campero.ArrancarCarro("toyota", "2016","amarillo", "mediano", 70000000);
        campero.AcelerarCarro("toyota", "2016","amarillo", "mediano", 70000000);
        campero.FrenarCarro("toyota", "2016","amarillo", "mediano", 70000000);
        campero.RetrocederCarro("toyota", "2016","amarillo", "mediano", 70000000);
        campero.ApagarCarro("toyota", "2016","amarillo", "mediano", 70000000);
    }
}
   
