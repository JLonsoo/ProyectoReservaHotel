package Interfaz;

import Listas.cListaClientes;
import Listas.cListaRecepcionistas; 
import Reservas.cCliente;
import Personal.cRecepcionista; 
import Personal.cAdministrador; 
import java.util.List;

public class cAutenticador {

    private final cListaClientes listaClientes;
    private final cListaRecepcionistas listaRecepcionistas;
    
    private final cAdministrador administrador; 

    
    public cAutenticador(cListaClientes listaClientes, cListaRecepcionistas listaRecepcionistas) {
        this.listaClientes = listaClientes;
        this.listaRecepcionistas = listaRecepcionistas;
        
        
        this.administrador = new cAdministrador(
             "Juan Pérez López", 
             "12345678J",        
             "999111222",        
             "juan.perez@hotel.com", 
             "AD007",            
             "juanP",            
             "789admin"          
        );
    }

    
    public boolean autenticarCliente(String usuario, String contrasena) {
        
        List<cCliente> clientes = listaClientes.obtenerClientes();
        
        for (cCliente cliente : clientes) {
            
            if (cliente.usuarioC().equals(usuario) && cliente.contraseñaC().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    
    public boolean autenticarOtroRol(String usuario, String contrasena, String rol) {
        
        if (rol.equals("recepcionista")) {
            List<cRecepcionista> recepcionistas = listaRecepcionistas.obtenerRecepcionistas();
            
            for (cRecepcionista recepcionista : recepcionistas) {
                if (recepcionista.usuarioR().equals(usuario) && recepcionista.contraseñaR().equals(contrasena)) {
                    return true;
                }
            }
            return false;
        }
        
        if (rol.equals("admin")) {
            
            return this.administrador.autenticar(usuario, contrasena);
        }
        
        return false;
    }
}