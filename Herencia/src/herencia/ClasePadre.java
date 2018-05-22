/*
 esta clase sirve como super clase para heredar sus atributos
y sus metodos a las subclases
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @Manuela Garcia Monsalve
 * 21 mayo 2018
 */
public class ClasePadre {
    
    // aqui crearemos nuestros atributos como superClase
    public String oficio = "COCINERO";
    
    
    // aqui vamos a crear metodos para heredar
    
     void hacerOficio(){
        JOptionPane.showMessageDialog(null,"soy la super clase padre y hago fritanga con buen sabor");
    }
    
}
