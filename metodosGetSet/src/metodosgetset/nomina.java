/*
 * en esta clase se pretende trabajar con constructores
 */
package metodosgetset;

/**
 *
 * @author Manuela Garcia Monsalve
 * 7 mayo 2018
 * */
public class nomina {
    int cedula,salario,deducciones;
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
    
    
    
     int totalSalario(){
        
        return salario-deducciones;
    }
    /**
     * 
     * metodo que permite mostrar los datos de cada uno de los empleados 
     */
    void mostrardatos(){
        System.out.println("-------------------------------------");
    System.out.println("los datos de pago del empleados son:");
    System.out.println("el numero de cedula es:"+ cedula);
    System.out.println("el nombre es:"+ nombre+" "+ apellidos);
    System.out.println("el salario es:"+ salario);
    System.out.println("las deducciones son:"+ deducciones);
    System.out.println("el salario total es:"+ totalSalario());
        System.out.println("\n");
    
  
    }
    
    //metodos GET
    
    int getCedula()
    {
         return this.cedula;  
    }
    
    
     String getNombre()
    {
         return this.nombre;  
    }
     
     String getApellido()
    {
         return this.apellidos; 
    }
     
     int getSalario()
    {
         return this.salario;  
    }
     
       int getDeducciones()
    {
         return this.deducciones;  
    }
       
       
    // metodos set
     
     void setCedula(int CED)
     {
         this.cedula=CED;
     }
    
     
     void setNombre(String NOM)
     {
         this.nombre=NOM;
     }
     
     
      void setApellido(String APE)
     {
         this.apellidos=APE;
     }
      
       void setSalario(int SAL)
     {
         this.salario=SAL;
     }
    
       
          void setDeducciones(int DEDUC)
     {
         this.deducciones=DEDUC;
     }
          
           
      
}
