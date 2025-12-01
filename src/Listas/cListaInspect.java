package Listas;

import Personal.cInspector; // Asegúrate de importar la clase cInspector
import java.util.ArrayList;
import java.util.List;

public class cListaInspect {
    
    private final List<cInspector> inspectores;

    public cListaInspect() {
        this.inspectores = new ArrayList<>();
        
        // --- Inspector 1 (Datos Aleatorios) ---
        // cInspector(Nombre, DNI, Teléfono, Correo, NumContrato, PisosACargo, HabInspeccionadas)
        this.inspectores.add(new cInspector(
                "Elena Guzmán Ruiz",    // 1. Nombre
                "11223344E",            // 2. DNI
                "933445566",            // 3. Teléfono
                "elena.g@hotel.com",    // 4. Correo
                "IN001",                // 5. NumContrato
                4,                      // 6. PisosACargo
                20                      // 7. HabInspeccionadas
        ));
        
        // --- Inspector 2 (Datos Aleatorios) ---
        this.inspectores.add(new cInspector(
                "Carlos Soto Vargas",   // 1. Nombre
                "99887766C",            // 2. DNI
                "966778899",            // 3. Teléfono
                "carlos.s@hotel.com",   // 4. Correo
                "IN002",                // 5. NumContrato
                8,                      // 6. PisosACargo
                2                       // 7. HabInspeccionadas
        ));
    }

    public void agregarInspector(cInspector inspector) {
        this.inspectores.add(inspector);
    }
    
    /**
     * Retorna la lista completa de inspectores.
     * @return List<cInspector> La lista de inspectores.
     */
    public List<cInspector> obtenerInspectores() {
        return this.inspectores;
    }

    /**
     * Retorna la cantidad total de inspectores en la lista.
     * (Método creado para reflejar el nombre corto de la clase 'Inspect')
     * @return int El número de inspectores.
     */
    public int getCantidadInspect() {
        return this.inspectores.size();
    }
}
