/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Manuela Garcia Monsalve
 * 7 mayo 2018
 * */


/**
 * 
 * 
 */
public class nomina {
    int cedula,salario,deducciones,totalsalario;
    String nombre,apellidos;
    //aqui voy a crear mi constructor
    
    nomina(int ced, String nom,String ape, int sal, int deduc){
   /*cedula=ced;
    nombre=nom;
    apellidos=ape;
    salario=sal;
    deducciones=deduc;
    totalsalario=total; */
    //segunda forma de notar atributos en un clase
    
    this.cedula=ced;
    this.nombre=nom;
    this.apellidos=ape;
    this.salario=sal;
    this.deducciones=deduc;
  
    
    }
    
   // funcion para calcular el salario total del empleado 
    // se resta el salario con las deducciones 
    int totalSalario(){
        
        return salario-deducciones;
    }
    
    
    //funcion  para mostrar los datos de cada empleado
    void mostrardatos(){
    System.out.println(" ");
    System.out.printf("el numero de cedula es:"+ "     "+ cedula);
    System.out.printf("      "+"el nombre es :"+"     "+ nombre+" "+ apellidos);
    System.out.printf("      "+"el salario es :"+ "     "+salario);
    System.out.printf("      " +"las deducciones son :"+"     "+ deducciones);
    System.out.printf("      " +"el salario total es :"+"     "+ totalSalario() );
    
    
    
    
    
    }
    
}
