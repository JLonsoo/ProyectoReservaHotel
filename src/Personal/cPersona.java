/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

public class cPersona {
    private String nombreCompleto, DNI, telefono, correoElec;
    
    public cPersona(String nombreCompleto, String DNI, String telefono, String correoElec){
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.telefono = telefono;
        this.correoElec = correoElec;
    }
    
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
    
}
