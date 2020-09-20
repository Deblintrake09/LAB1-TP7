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
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String ciudad;
    private long dni;

    public Cliente(String n, String a, String c, long dni)
    {
        this.nombre=n;
        this.apellido=a;
        this.ciudad=c;
        this.dni=dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public long getDni() {
        return dni;
    }    
            
    
}
