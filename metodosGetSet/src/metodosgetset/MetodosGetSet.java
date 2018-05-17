/*
 * esta clase va a permitir usar los metodos get (obtner) y set 
 */
package metodosgetset;

/**
 *
 * @author Manuela garcia Monsalve
 */
public class MetodosGetSet {

    /** metodo main 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         nomina empleado1=new nomina(1019142678," mauro","landazuri",670000000,67000);
         nomina empleado2= new nomina(52344499,"sofia","aguirre",880000,400000);
         nomina empleado3= new nomina(87346285,"jose","perez",300000,400000);
         nomina empleado4= new nomina(98137872,"jorge","lopez",880300,4050000);
         nomina empleado5= new nomina(64567456,"sofia","aguirre",880000,4050000);
         
        
        // se invocan cada uno de los objetos y se llama al metodo mostrar datos 
        empleado1.mostrardatos();
        empleado2.mostrardatos();
        empleado3.mostrardatos();
        empleado4.mostrardatos();
        empleado5.mostrardatos();
      
        
        // vamos a llamar los metodos get y set 
       // cambiando datos de informacion del empleado 1 
        
        System.out.println("\n");
        empleado1.setCedula(1321848);
        empleado1.setNombre("jorge");
        empleado1.setApellido("garcia");
        empleado1.setSalario(20000000);
        empleado1.setDeducciones(30000);
        
        
        
        System.out.println("ACTUALIZACION DE INFORMACION DEL EMPLEADO 1");
        System.out.println("la nueva cedula del empleado 1 es :"+ empleado1.getCedula());
        System.out.println("el nuevo nombre  del empleado 1 es : " +empleado1.getNombre());
        System.out.println("el nuevo apellido del empleado 1 es: " +empleado1.getApellido());
        System.out.println("el  nuevo salario del empleado 1 es: " + empleado1.getSalario());
        System.out.println("las nuevas deducciones del empleado 1 son: " + empleado1.getDeducciones());
        System.out.println("el nuevo salario del empleado 1 es: "+ empleado1.totalSalario());
        System.out.println("\n");
        
         // cambiando datos de informacion del empleado 2
        
        System.out.println("\n");
        empleado2.setCedula(8436223);
        empleado2.setNombre("manuela");
        empleado2.setApellido("garcia");
        empleado2.setSalario(70000000);
        empleado2.setDeducciones(300000);
      
         
        System.out.println("ACTUALIZACION DE INFORMACION DEL EMPLEADO 2");
        System.out.println("la nueva cedula del empleado 2 es :"+ empleado2.getCedula());
        System.out.println("el nuevo nombre  del empleado 2 es : " +empleado2.getNombre());
        System.out.println("el nuevo apellido del empleado 2 es: " +empleado2.getApellido());
        System.out.println("el  nuevo salario del empleado 2 es: " + empleado2.getSalario());
        System.out.println("las nuevas deducciones del empleado 2 son: " + empleado2.getDeducciones());
        System.out.println("el nuevo salario del empleado 2 es: "+ empleado2.totalSalario());
        System.out.println("\n");
        
        
        // cambiando datos de informacion del empleado 3
       
        System.out.println("\n");
        empleado3.setCedula(482342);
        empleado3.setNombre("alejandra");
        empleado3.setApellido("mendoza");
        empleado3.setSalario(7000000);
        empleado3.setDeducciones(100000);
        
        
        System.out.println("ACTUALIZACION DE INFORMACION DEL EMPLEADO 3");
        System.out.println("la nueva cedula del empleado 3 es :"+ empleado3.getCedula());
        System.out.println("el nuevo nombre  del empleado 3 es : " +empleado3.getNombre());
        System.out.println("el nuevo apellido del empleado 3 es: " +empleado3.getApellido());
        System.out.println("el  nuevo salario del empleado 3 es: " + empleado3.getSalario());
        System.out.println("las nuevas deducciones del empleado 3 son: " + empleado3.getDeducciones());
        System.out.println("el nuevo salario del empleado 3 es: "+ empleado3.totalSalario());
        System.out.println("\n");
        
        
          // cambiando datos de informacion del empleado 4
        System.out.println("\n");
        empleado4.setCedula(724232);
        empleado4.setNombre("sergio");
        empleado4.setApellido("grimaldo");
        empleado4.setSalario(80000000);
        empleado4.setDeducciones(100000);
        
        
        System.out.println("ACTUALIZACION DE INFORMACION DEL EMPLEADO 4");
        System.out.println("la nueva cedula del empleado 4 es :"+ empleado4.getCedula());
        System.out.println("el nuevo nombre  del empleado 4 es : " +empleado4.getNombre());
        System.out.println("el nuevo apellido del empleado 4 es: " +empleado4.getApellido());
        System.out.println("el  nuevo salario del empleado 4 es: " + empleado4.getSalario());
        System.out.println("las nuevas deducciones del empleado 4 son: " + empleado4.getDeducciones());
        System.out.println("el nuevo salario del empleado 4 es: "+ empleado4.totalSalario());
        System.out.println("\n");
        
        
          // cambiando datos de informacion del empleado 5
        System.out.println("\n");
        empleado5.setCedula(4439209);
        empleado5.setNombre("pilar");
        empleado5.setApellido("garcia");
        empleado5.setSalario(80000000);
        empleado5.setDeducciones(400000);
        
        System.out.println("ACTUALIZACION DE INFORMACION DEL EMPLEADO 5");
        System.out.println("la nueva cedula del empleado 5 es :"+ empleado5.getCedula());
        System.out.println("el nuevo nombre  del empleado 5 es : " +empleado5.getNombre());
        System.out.println("el nuevo apellido del empleado 5 es: " +empleado5.getApellido());
        System.out.println("el  nuevo salario del empleado 5 es: " + empleado5.getSalario());
        System.out.println("las nuevas deducciones del empleado 5 son: " + empleado5.getDeducciones());
        System.out.println("el nuevo salario del empleado 5 es: "+ empleado5.totalSalario());
        
        
    }
}
