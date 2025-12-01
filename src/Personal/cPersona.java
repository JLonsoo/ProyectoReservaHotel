package Personal;

public class cPersona {
    
    private String nombreCompleto, DNI, telefono, correoElec;
    
    public cPersona(String nombreCompleto, String DNI, String telefono, String correoElec){
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.telefono = telefono;
        this.correoElec = correoElec;
    }
    
    // --- Getters ---
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setNombreCompleto(String nuevoNombre) {
        this.nombreCompleto = nuevoNombre;
    }
}
