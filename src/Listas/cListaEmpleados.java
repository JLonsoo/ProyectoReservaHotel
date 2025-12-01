package Listas;

import Personal.cAdministrador;
import Personal.cEmpleado;
import Personal.cRecepcionista;
import Personal.cPersonalLimpieza;
import Personal.cInspector;

import java.util.ArrayList;
import java.util.List;

public class cListaEmpleados {
    
    // Lista de las clases de personal especializado
    private final cListaRecepcionistas listaRecepcionistas;
    private final cListaPersoLimp listaPersonalLimpieza;
    private final cListaInspect listaInspectores;
    
    // Lista local de Administradores
    private final List<cAdministrador> listaAdministradores; 
    
    private int numPersonal; 

    // 1. Constructor: Inicializa las listas de personal especializado.
    public cListaEmpleados() {
        // Inicializar las listas de personal
        this.listaRecepcionistas = new cListaRecepcionistas();
        this.listaPersonalLimpieza = new cListaPersoLimp();
        this.listaInspectores = new cListaInspect();
        
        // Inicialización de la lista de Administradores (datos de ejemplo)
        this.listaAdministradores = new ArrayList<>();
        this.listaAdministradores.add(new cAdministrador(
                "Juan Perez Gómez", 
                "100200300A", 
                "999888777", 
                "juan.p@hotel.com", 
                "AD001", 
                "adminJuan", 
                "pass123"
        ));
        this.listaAdministradores.add(new cAdministrador(
                "Ana María Soto", 
                "111222333B", 
                "955443322", 
                "ana.s@hotel.com", 
                "AD002", 
                "adminAna", 
                "pass456"
        ));
        
        // Calcular el total de personal al inicializar la clase
        this.numPersonal = calcularNumPersonal();
    }
    
    // 2. Método que calcula el total de personal.
    /**
     * Calcula la suma total de todos los empleados contados por cada clase de lista.
     * @return int El número total de personal.
     */
    public final int calcularNumPersonal() {
        int total = 0;
        
        total += this.listaRecepcionistas.getCantidadRecepcionistas();
        total += this.listaPersonalLimpieza.getCantidadPersoLimp();
        total += this.listaInspectores.getCantidadInspect();
        total += this.listaAdministradores.size();
        
        this.numPersonal = total;
        return total;
    }
    
    // Getter para el total de personal
    public int getNumPersonal() {
        return this.numPersonal;
    }

    // 3. Método para generar una lista de nombres y DNI de todos los empleados
    /**
     * Genera una lista de Strings con el Nombre Completo y el DNI de todos los empleados
     * usando bucles for-each.
     * @return List<String> Lista de nombres y DNI (ej: "Nombre (Rol) - DNI: 12345678A").
     */
    public List<String> obtenerNombresDNI() {
        List<String> listaNombresDNI = new ArrayList<>();
        
        // Recorrer Recepcionistas usando for-each
        for (cRecepcionista recepcionista : this.listaRecepcionistas.obtenerRecepcionistas()) {
            listaNombresDNI.add(recepcionista.getNombreCompleto() + " (" + recepcionista.getRol() + ") - DNI: " + recepcionista.getDNI());
        }
        
        // Recorrer Personal de Limpieza usando for-each
        for (cPersonalLimpieza limp : this.listaPersonalLimpieza.obtenerPersonalLimpieza()) {
            listaNombresDNI.add(limp.getNombreCompleto() + " (" + limp.getRol() + ") - DNI: " + limp.getDNI());
        }
        
        // Recorrer Inspectores usando for-each
        for (cInspector inspector : this.listaInspectores.obtenerInspectores()) {
            listaNombresDNI.add(inspector.getNombreCompleto() + " (" + inspector.getRol() + ") - DNI: " + inspector.getDNI());
        }
        
        // Recorrer Administradores usando for-each
        for (cAdministrador admin : this.listaAdministradores) {
            listaNombresDNI.add(admin.getNombreCompleto() + " (" + admin.getRol() + ") - DNI: " + admin.getDNI());
        }
        
        return listaNombresDNI;
    }
    
// --------------------------------------------------------------------------------------------------
// LÓGICA DE GESTIÓN DE EMPLEADOS
// --------------------------------------------------------------------------------------------------

    /**
     * Busca un empleado en todas las listas por su DNI usando bucles for-each.
     * @param dni DNI a buscar.
     * @return cEmpleado El objeto encontrado o null.
     */
    public cEmpleado encontrarEmpleadoPorDNI(String dni) {
        
        // Buscar en Administradores
        for (cAdministrador admin : this.listaAdministradores) {
            if (admin.getDNI().equals(dni)) {
                return admin;
            }
        }

        // Buscar en Recepcionistas
        for (cRecepcionista recepcionista : this.listaRecepcionistas.obtenerRecepcionistas()) {
            if (recepcionista.getDNI().equals(dni)) {
                return recepcionista;
            }
        }

        // Buscar en Personal de Limpieza
        for (cPersonalLimpieza limp : this.listaPersonalLimpieza.obtenerPersonalLimpieza()) {
            if (limp.getDNI().equals(dni)) {
                return limp;
            }
        }

        // Buscar en Inspectores
        for (cInspector inspector : this.listaInspectores.obtenerInspectores()) {
            if (inspector.getDNI().equals(dni)) {
                return inspector;
            }
        }

        return null; // No encontrado
    }

    /**
     * Elimina el objeto empleado de la lista a la que pertenece.
     * @param empleado El objeto cEmpleado a eliminar.
     * @param rol Rol actual del empleado.
     * @return boolean True si se eliminó, False en caso contrario.
     */
    public boolean eliminarEmpleadoDeLista(cEmpleado empleado, String rol) {
         try {
            switch (rol) {
                case "Administrador":
                    return this.listaAdministradores.remove(empleado);
                case "Recepcionista":
                    return this.listaRecepcionistas.obtenerRecepcionistas().remove(empleado);
                case "Inspector":
                    return this.listaInspectores.obtenerInspectores().remove(empleado);
                case "Personal de Limpieza":
                    return this.listaPersonalLimpieza.obtenerPersonalLimpieza().remove(empleado);
                default:
                    return false;
            }
         } catch (Exception e) {
             System.err.println("Error al eliminar empleado con rol " + rol + ": " + e.getMessage());
             return false;
         }
    }
    
// --------------------------------------------------------------------------------------------------
// GETTERS
// --------------------------------------------------------------------------------------------------
    
    /**
     * Getter para la lista de Administradores
     */
    public List<cAdministrador> getListaAdministradores() {
        return this.listaAdministradores;
    }
    
    public cListaRecepcionistas getListaRecepcionistas() {
        return this.listaRecepcionistas;
    }
    
    public cListaPersoLimp getListaPersonalLimpieza() {
        return this.listaPersonalLimpieza;
    }
    
    public cListaInspect getListaInspectores() {
        return this.listaInspectores;
    }
}