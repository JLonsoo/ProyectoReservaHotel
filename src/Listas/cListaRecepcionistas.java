package Listas;

import Personal.cRecepcionista; 
import java.util.ArrayList;
import java.util.List;

public class cListaRecepcionistas {
    
    private final List<cRecepcionista> recepcionistas;

    public cListaRecepcionistas() {
        this.recepcionistas = new ArrayList<>();
        
        // --- Recepcionista 1 (8 Argumentos) ---
        // cRecepcionista(Nombre, DNI, Teléfono, Correo, NumContrato, UsuarioR, ContraseñaR)
        this.recepcionistas.add(new cRecepcionista(
                "Marta Solis",      // 1. Nombre
                "22334455R",        // 2. DNI
                "987654321",        // 3. Teléfono
                "marta.s@hotel.com",// 4. Correo
                "RC001",            // 5. NumContrato (Nuevo)
                "martaS",           // 6. UsuarioR
                "solis123"          // 7. ContraseñaR
        ));
        
        // --- Recepcionista 2 (8 Argumentos) ---
        this.recepcionistas.add(new cRecepcionista(
                "Raúl Diaz", 
                "44556677D", 
                "912345678", 
                "raul.d@hotel.com", 
                "RC002", 
                "raulD", 
                "diaz456"
        ));
        
        // --- Recepcionista 3 (8 Argumentos) ---
        this.recepcionistas.add(new cRecepcionista(
                "Sofia Vera", 
                "66778899V", 
                "955887744", 
                "sofia.v@hotel.com", 
                "RC003", 
                "sofiaV", 
                "vera789"
        ));
    }

    public void agregarRecepcionista(cRecepcionista recepcionista) {
        this.recepcionistas.add(recepcionista);
    }
    
    public List<cRecepcionista> obtenerRecepcionistas() {
        return this.recepcionistas;
    }
}