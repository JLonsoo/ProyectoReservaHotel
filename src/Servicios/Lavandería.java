
package Servicios;


public class Lavandería extends ServicioAdicional {
    public Lavandería() {
        super(15.00);
    }
    public void lavarRopaDelicada() {
        System.out.println("Lavado especial...");
        registrarUso(); 
    }
}
