package Interfaz;

import Listas.cListaClientes;
import Reservas.cCliente;
import java.util.List;

public class cAutenticador {

    private final cListaClientes listaClientes;
    // private final cListaRecepcionistas listaRecepcionistas; // Lista de Recepcionistas (Opcional)
    // private final cListaAdministradores listaAdministradores; // Lista de Administradores (Opcional)

    // Constructor que recibe y almacena las listas de usuarios.
    public cAutenticador(cListaClientes listaClientes) {
        // <--- NOTA: Inicializa la lista de clientes
        this.listaClientes = listaClientes; 
        // Inicializa las otras listas aquí si las tienes
    }

    /**
     * Verifica las credenciales de un Cliente contra la lista cargada.
     * @param usuario El nombre de usuario a buscar.
     * @param contrasena La contraseña a verificar.
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    public boolean autenticarCliente(String usuario, String contrasena) {
        // <--- NOTA: Obtiene la lista de clientes (con los 10 usuarios cargados)
        List<cCliente> clientes = listaClientes.obtenerClientes(); 
        
        for (cCliente cliente : clientes) {
            // <--- NOTA: La lógica de autenticación está correcta: compara usuarioC() y contraseñaC()
            if (cliente.usuarioC().equals(usuario) && cliente.contraseñaC().equals(contrasena)) {
                return true; // Autenticación exitosa
            }
        }
        return false; // Usuario o contraseña no encontrados/incorrectos
    }

    /**
     * Placeholder para autenticar otros roles (Recepcionista/Admin).
     * @param usuario El nombre de usuario.
     * @param contrasena La contraseña.
     * @param rol El rol a autenticar ("recepcionista" o "admin").
     * @return true si la autenticación es exitosa, false en caso contrario.
     */
    public boolean autenticarOtroRol(String usuario, String contrasena, String rol) {
        // <--- NOTA: Lógica de autenticación Fija para Recepcionista
        if (rol.equals("recepcionista") && usuario.equals("recep1") && contrasena.equals("123")) {
            return true;
        }
        
        // <--- NOTA: Lógica de autenticación Fija para Administrador
        if (rol.equals("admin") && usuario.equals("admin1") && contrasena.equals("321")) {
            return true;
        }
        
        // Aquí se podría añadir lógica para buscar en otras listas (recepcionistas, administradores)
        
        return false;
    }
}
