/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

public class cEmpleado extends cPersona{
    private String rol;
    private String numContrato;
    

    public cEmpleado(String nombreCompleto, String DNI, String telefono, String correoElec, String rol, String numContrato) {
        super(nombreCompleto, DNI, telefono, correoElec);
        this.rol = rol;
        this.numContrato = numContrato;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String nuevoRol) {
        this.rol = nuevoRol;
    }
    public String getNumContrato() {
        return numContrato;
    }
}
