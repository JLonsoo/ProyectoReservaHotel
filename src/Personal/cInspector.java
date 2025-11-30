
package Personal;

public class cInspector extends cEmpleado{
    private int numHabInspeccionadas;

    public cInspector(String nombreCompleto, String DNI, String telefono, String correoElec, String numContrato, int numHabInspeccionadas) {
        
        
        super(nombreCompleto, DNI, telefono, correoElec, "Inspector", numContrato);
        

        this.numHabInspeccionadas = numHabInspeccionadas;
    }
    
    public cInspector(String nombreCompleto, String DNI, String telefono, String correoElec, String numContrato) {
        this(nombreCompleto, DNI, telefono, correoElec, numContrato, 0);
    }

    public int getNumHabInspeccionadas() {
        return numHabInspeccionadas;
    }

    public void setNumHabInspeccionadas(int numHabInspeccionadas) {
        this.numHabInspeccionadas = numHabInspeccionadas;
    }
}
