/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;
import Personal.cPersona;

public class cCliente extends cPersona{
    private String idCliente;
    private String numTarjeta;
    private String usuarioC;     
    private String contraseñaC;  

    
    public cCliente(String nombreCompleto, String DNI, String telefono, String correoElec, String idCliente, String numTarjeta, String usuarioC, String contraseñaC) {
        super(nombreCompleto, DNI, telefono, correoElec);
        this.idCliente = idCliente;
        this.numTarjeta = numTarjeta;
        this.usuarioC = usuarioC;
        this.contraseñaC = contraseñaC;
    }

    
    public cCliente() {
        super("Desconocido", "00000000", "000000000", "desconocido@mail.com");
        this.idCliente = "NO ID";
        this.numTarjeta = "NO CARD";
        this.usuarioC = "NO USER";       
        this.contraseñaC = "NO PASS";     
    }

    

    public String idCliente() {
        return idCliente;
    }
    
    public void idCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String numTarjeta() {
        return numTarjeta;
    }
    
    public void numTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
 
    public String usuarioC() {
        return usuarioC;
    }

    public void usuarioC(String usuarioC) {
        this.usuarioC = usuarioC;
    }

    public String contraseñaC() {
        return contraseñaC;
    }

    public void contraseñaC(String contraseñaC) {
        this.contraseñaC = contraseñaC;
    }
}
