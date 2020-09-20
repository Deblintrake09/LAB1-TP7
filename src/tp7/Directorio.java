package tp7;


import java.util.*;


/**
 *
 * @author jackd
 */
public class Directorio {
    
    private TreeMap<Long,Cliente> directorio; // Pares de Clientes y teléfonos
    
    public Directorio()   
    {
        directorio = new TreeMap<>();
        
    }
   
    
    //agrega un nuevo cliente a la lista**
    public void agregarCliente(Long tel, Cliente c)
    {
        directorio.put(tel,c);
    }
    
        //Busca un cliente en base al N° de telefono
    public Cliente buscarCliente(long tel)
    {
        if(directorio.containsKey(tel))
        {
            return directorio.get(tel);
        }
        System.out.println("No hay cliente en el directorio con el N° solicitado");
        return null;
    }
    

    
    //Retorna un Set de Telefonos, en base al apellido de los clientes
    //Además imprime en consola la lista, para facilitar ver lo que devuelve.
    public Set<Long> buscarTelefono(String ape)
    {
        HashSet<Long> telefonos =new HashSet<>();
        for (Map.Entry<Long,Cliente> cli: directorio.entrySet())
        {
            long clave = cli.getKey();
            String apellido = cli.getValue().getApellido();
            if(apellido.equals(ape))
                    {telefonos.add(clave);}
        }
        for(long l: telefonos)
        {   
            verCliente(l);
        }
        return telefonos;
    }
    
    //Retorna un TreeMap con todos de clientes que vivan en una ciudad dada
    public TreeMap<Long,Cliente> buscarClientes(String ciudad)
    {
        TreeMap<Long,Cliente> clieCiudad= new TreeMap<>();
        Set<Long> keys= directorio.keySet();
        for (Long tel:keys)
        {
            if(directorio.get(tel).getCiudad() == null ? ciudad == null : directorio.get(tel).getCiudad().equals(ciudad))
            {
                clieCiudad.put(tel, directorio.get(tel));
            }
        
        }
        if(clieCiudad.isEmpty())
        { System.out.println("No hay clientes en la ciudad ingresada");}
        for(Long tel: clieCiudad.keySet())
        {
            System.out.println(clieCiudad.get(tel).getApellido()+" "+ clieCiudad.get(tel).getNombre()+" "+tel);
        }
        return clieCiudad;
    }
    
    

    
    //borra la primera instancia un cliente por su dni y retorna el cliente
    // Si una persona tuviera más de un telefono, solo se borraría el primero.
    public Cliente borrarCliente(long dni)
    {       
        Cliente c;
        for (Long l: directorio.keySet())
        {
            
            if(directorio.get(l).getDni()==dni)
                {
                    c=directorio.get(l);
                    directorio.remove(l);
                    return c;
                }
        }    
        
        System.out.println("No hay cliente en el directorio con el DNI ingresado");
        return null;   
    }
    
    
    
    
    //Metodo que imprime por pantalla el cliente
    public void verCliente(long tel)
    {
       
       Cliente c = buscarCliente(tel);
       if(c==null)
       {
           System.out.println("No hay cliente en el directorio con el N° solicitado");
           return;
       }
       System.out.println(c.getApellido() +" "+ c.getNombre()+" "+tel+" "+ c.getCiudad());
    }
    
    // Imprime todo el directorio
    public void listarClientes()
    {
        System.out.println("Nombre y Apellido   Tel      Ciudad");
        for(Long tel :directorio.keySet())
        {
            verCliente(tel);
        }
    }
    
    
}
