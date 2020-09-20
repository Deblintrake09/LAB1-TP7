/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author jackd
 */
public class TP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Directorio dir1= new Directorio();
        Cliente c1 = new Cliente("Andres","Micalizzi","San Luis",30157082);
        Cliente c2 = new Cliente("Andres","Micaliz","San Luis",30157087);
        Cliente c3 = new Cliente("Gisela","Quevedo","Villa Mercedes",32456767);
        Cliente c4 = new Cliente("Candela","Micalizzi","San Luis",53454333);
        dir1.agregarCliente(2657620444L, c1);
        dir1.agregarCliente(2657620455L, c2);
        dir1.agregarCliente(2657505029L, c3);
        dir1.agregarCliente(2664426345L, c4);
        
        
        //Buscar Cliente 
        dir1.buscarCliente(26574426345L); //No existe
        dir1.buscarCliente(2657620444L); // si existe
        
        
        // Buscar por apellidos
        dir1.buscarTelefono("Micalizzi"); 
        
        
        //Buscar por Ciudad
        dir1.buscarClientes("San Luis");
        dir1.buscarClientes("Villa Mercedes");
        dir1.buscarClientes("Donovan");
        
        //Borrar cliente
        dir1.borrarCliente(30157082);
        dir1.verCliente(26570620444L); // comprobamos que el cliente borrado ya no existe
        
        
    }
    
}
