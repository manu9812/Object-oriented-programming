/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accionescarro;

/**
 *
 * @author manuela garcia
 * frecha : 28 de abril 2018
 * clase main donde se invocan los metodoa creados en la clase acciones carro
 */
public class Main {
    
    public static void main(String []args) throws InterruptedException
    {
        
        
        /**
         * se crea un objeto llamado carro 
         * se invocan todos los metodos creados en la clase acciones carro
         */
          AccionesCarro Carro = new AccionesCarro(); 
          Carro.MostrarDatosCarro("ferrari", 2018,"mediano", "rojo", 30000000);
          Carro.ApagarCarro();
          Carro.EncenderCarro();
          Carro.AcelerarCarro(60);
          Carro.FrenarCarro(60);
          Carro.ApagarCarro();
          
          
    }
   
}
