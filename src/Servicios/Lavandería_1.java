
package Servicios;


public class Lavandería_1 extends ServicioAdicional {
    public Lavandería_1() {
        super(15.00);
    }
    public void lavarRopaDelicada() {
        System.out.println("Lavado especial...");
        registrarUso(); 
    }
}
