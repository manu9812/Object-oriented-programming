/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Administrador
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nuestros objetos
         System.out.printf("los datos de pago del empleados son:");
        nomina empleado1= new nomina(10191426,"mauro","landazuri",670000000,67000);
        nomina empleado2= new nomina(52344499,"daniel","aguirre",39000000,400000);
        nomina empleado3= new nomina(12345677,"jorge","lopez",789488390,400000);
        nomina empleado4= new nomina(83475345,"sergio","perez",3000000,400000);
        nomina empleado5= new nomina(23748632,"maria","garcia",88000000,400000);
        nomina empleado6= new nomina(37594358,"sara","monsalve",89000003,400000);
        nomina empleado7= new nomina(76548783,"angela","caceres",880000400,400000);
        nomina empleado8= new nomina(54683763,"edison","guerrero",88000000,400000);
        nomina empleado9= new nomina(57834535,"felipe","cadavid",88000090,400000);
        nomina empleado10= new nomina(87258643,"andrea","hernandez",88000000,400000);
        
        
        
        //con la ayuda de los objetos se invoca la funcion mostrar datos
        empleado1.mostrardatos();
        empleado2.mostrardatos();
        empleado3.mostrardatos();
        empleado4.mostrardatos();
        empleado5.mostrardatos();
        empleado6.mostrardatos();
        empleado7.mostrardatos();
        empleado8.mostrardatos();
        empleado9.mostrardatos();
        empleado10.mostrardatos();
    }
    
}
