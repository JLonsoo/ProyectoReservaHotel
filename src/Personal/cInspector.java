package Personal;


public class cInspector extends cEmpleado {
    

    private int numPisosACargo;
    private int numHabInspeccionadas;

    public cInspector(
            String nombreCompleto,
            String DNI,
            String telefono,
            String correoElec,
            String numContrato,
            int numPisosACargo,
            int numHabInspeccionadas
    ) {
        super(nombreCompleto, DNI, telefono, correoElec, "Inspector", numContrato);
        
        // Inicialización de los nuevos atributos
        this.numPisosACargo = numPisosACargo;
        this.numHabInspeccionadas = numHabInspeccionadas;
    }


    
    public int NumPisosACargo() {
        return numPisosACargo;
    }

    public int NumHabInspeccionadas() {
        return numHabInspeccionadas;
    }


    public void setNumPisosACargo(int numPisosACargo) {
        this.numPisosACargo = numPisosACargo;
    }
    
    // Método para incrementar el contador de habitaciones inspeccionadas
    public void registrarInspeccion() {
        this.numHabInspeccionadas++;
        System.out.println("Inspección registrada. Total: " + this.numHabInspeccionadas);
    }
}