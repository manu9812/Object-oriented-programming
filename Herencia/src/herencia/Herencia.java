/*
 * herencia 
 * este proyecto sirve para explicar el uso de la herencia entre clases de java
   se hereda atributos y metodos etre dos objetos 
 */
package herencia;

import javax.swing.JOptionPane;

/**
 *
 * @Manuela Garcia  Monsalve 
 * 21 mayo 2018
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aqui crearemos nuestros objetos 
        
        
        
        ClasePadre cp= new ClasePadre();
        cp.hacerOficio();
         JOptionPane.showMessageDialog(null,"soy la  super clase padre :");
        
        
        
        ClaseMadre md= new ClaseMadre();
        md.hacerOficio();
         JOptionPane.showMessageDialog(null,"soy la  super clase madre :");
        
        
        ClaseHijo ch= new ClaseHijo();
        ch.hacerOficio();
        
        JOptionPane.showMessageDialog(null,"soy la sub clase hijo y herede el oficio de mi padre que es:" );
        JOptionPane.showMessageDialog(null,"cocinero");
        
        
        ClaseHijo2 ch2= new ClaseHijo2();
        ch2.hacerOficio();
        JOptionPane.showMessageDialog(null,"soy la sub clase hijo 2 y herede el oficio de mi padre que es:");
        JOptionPane.showMessageDialog(null,"cocinero");
        
        
         ClaseHija cha= new ClaseHija();
        cha.hacerOficio();
        JOptionPane.showMessageDialog(null,"soy la sub clase hija y herede el oficio de mi madre que es:");
        JOptionPane.showMessageDialog(null,"tamalera");
        
        
        
         ClaseHija2 cha2= new ClaseHija2();
        cha2.hacerOficio();
        JOptionPane.showMessageDialog(null,"soy la sub clase hija 2  y herede el oficio de mi madre que es:");
        JOptionPane.showMessageDialog(null,"tamalera");
        
        
        
        

    }
    
}
