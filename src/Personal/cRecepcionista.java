package Personal;

// cRecepcionista hereda de cEmpleado
public class cRecepcionista extends cEmpleado { 
    
    private String usuarioR;
    private String contraseñaR;


    public cRecepcionista(
            String nombreCompleto, 
            String DNI, 
            String telefono, 
            String correoElec, 
            String numContrato, 
            String usuarioR, 
            String contraseñaR
    ) {
        super(nombreCompleto, DNI, telefono, correoElec, "Recepcionista", numContrato); 
        
        this.usuarioR = usuarioR;
        this.contraseñaR = contraseñaR;
    }
    
    // Métodos de Acceso (Getters) requeridos por el Autenticador
    public String usuarioR() {
        return usuarioR;
    }
    
    public String contraseñaR() {
        return contraseñaR;
    }

    // Métodos específicos de Recepcionista
    
    public double AdicionarCostoServicio() {
        // Retorna un monto adicional que se sumará
        return 5.0; 
    }
    
    public boolean moverCitas(Object listaCitas, Object listaHabitaciones) {
        // Lógica para enlazar a listas de citas y habitaciones
        System.out.println("Moviendo citas y habitaciones.");
        return true; 
    }
    
    public String DatosRecibo(double montoTotal) {
        // Traspasa los datos de nombre, DNI (heredados) y MontoTotal.
        return "Recibo - Nombre: " + super.getNombreCompleto() + 
               " | DNI: " + super.getDNI() + 
               " | Monto Total: " + montoTotal;
    }
}