package Personal;

// cPersonalLimpieza hereda de cEmpleado
public class cPersonalLimpieza extends cEmpleado {
    
    // Atributos específicos del Personal de Limpieza
    private String turno; // Mañana, Tarde, Noche
    private int habitacionesAsignadas;
    private int habitacionesLimpiadas;

    public cPersonalLimpieza(
            String nombreCompleto,
            String DNI,
            String telefono,
            String correoElec,
            String numContrato,
            String turno,
            int habitacionesAsignadas,
            int habitacionesLimpiadas
    ) {
        // Llama al constructor de cEmpleado, fijando el rol
        // super(nombreCompleto, DNI, telefono, correoElec, rol, numContrato);
        super(nombreCompleto, DNI, telefono, correoElec, "Personal de Limpieza", numContrato);
        
        // Inicialización de los nuevos atributos
        this.turno = turno;
        this.habitacionesAsignadas = habitacionesAsignadas;
        this.habitacionesLimpiadas = habitacionesLimpiadas;
    }
    
    public String getTurno() {
        return turno;
    }

    public int getHabitacionesAsignadas() {
        return habitacionesAsignadas;
    }

    public int getHabitacionesLimpiadas() {
        return habitacionesLimpiadas;
    }

    // --- Métodos de Modificación (Setters y Funcionales) ---

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setHabitacionesAsignadas(int habitacionesAsignadas) {
        this.habitacionesAsignadas = habitacionesAsignadas;
    }
    
    /**
     * Incrementa el contador de habitaciones limpiadas.
     */
    public void registrarLimpieza() {
        this.habitacionesLimpiadas++;
        System.out.println("Habitación limpiada. Progreso: " + this.habitacionesLimpiadas + "/" + this.habitacionesAsignadas);
    }
}