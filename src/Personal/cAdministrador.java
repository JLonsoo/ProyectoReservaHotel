package Personal;

public class cAdministrador extends cEmpleado {
    
    
    private final String usuarioA; 
    private final String contraseñaA; 

    public cAdministrador(
            String nombreCompleto, 
            String DNI, 
            String telefono, 
            String correoElec, 
            String numContrato,
            String usuarioA, 
            String contraseñaA 
    ) {
        
        super(nombreCompleto, DNI, telefono, correoElec, "Administrador", numContrato);
        
       
        this.usuarioA = usuarioA; 
        this.contraseñaA = contraseñaA;
    }

   
    public String getUsuarioA() {
        return usuarioA;
    }

    public String getContraseñaA() {
        return contraseñaA;
    }
    

    public boolean autenticar(String usuario, String contrasena) {
        return this.usuarioA.equals(usuario) && this.contraseñaA.equals(contrasena);
    }
}