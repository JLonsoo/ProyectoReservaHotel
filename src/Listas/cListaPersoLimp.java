package Listas;

import Personal.cPersonalLimpieza; 
import java.util.ArrayList;
import java.util.List;

public class cListaPersoLimp {
    
    private final List<cPersonalLimpieza> personalLimpieza;

    public cListaPersoLimp() {
        this.personalLimpieza = new ArrayList<>();
        
        // --- Empleado de Limpieza 1 (Datos Aleatorios) ---
        // cPersonalLimpieza(Nombre, DNI, Teléfono, Correo, NumContrato, Turno, HabAsignadas, HabLimpiadas)
        this.personalLimpieza.add(new cPersonalLimpieza(
                "Carmen López Arias",     // 1. Nombre
                "55667788L",              // 2. DNI
                "944556677",              // 3. Teléfono
                "carmen.l@hotel.com",     // 4. Correo
                "PL001",                  // 5. NumContrato
                "Mañana",                 // 6. Turno
                12,                       // 7. Habitaciones Asignadas
                9                         // 8. Habitaciones Limpiadas
        ));
        
        // --- Empleado de Limpieza 2 (Datos Aleatorios) ---
        this.personalLimpieza.add(new cPersonalLimpieza(
                "Ricardo Blanco Mora",    // 1. Nombre
                "33221100R",              // 2. DNI
                "977889900",              // 3. Teléfono
                "ricardo.b@hotel.com",    // 4. Correo
                "PL002",                  // 5. NumContrato
                "Tarde",                  // 6. Turno
                10,                       // 7. Habitaciones Asignadas
                1                         // 8. Habitaciones Limpiadas
        ));
    }

    /**
     * Agrega un nuevo personal de limpieza a la lista.
     * @param empleado El objeto cPersonalLimpieza a agregar.
     */
    public void agregarPersonalLimpieza(cPersonalLimpieza empleado) {
        this.personalLimpieza.add(empleado);
    }
    
    /**
     * Retorna la lista completa del personal de limpieza.
     * @return List<cPersonalLimpieza> La lista del personal.
     */
    public List<cPersonalLimpieza> obtenerPersonalLimpieza() {
        return this.personalLimpieza;
    }
    
    /**
     * Retorna la cantidad total de personal de limpieza en la lista.
     * (Método actualizado para reflejar el nombre corto de la clase)
     * @return int El número de personal de limpieza.
     */
    public int getCantidadPersoLimp() {
        return this.personalLimpieza.size();
    }
}