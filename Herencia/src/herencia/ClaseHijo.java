/*
 *en esta clase se recibe la herencia de atributos y metodos
por parte de las super clases. esta clase hijo es una sub-clase
 */

package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @Manuela Garcia Monsalve
 * 21 mayo 2018
 */
public class ClaseHijo extends ClasePadre {
    
    // aqui crearemos atributos y metodos propios de la sub clase
   
     @Override
     void hacerOficio(){
        JOptionPane.showMessageDialog(null,"soy la sub clase y hago chicharrones con estilo");
    }
}
