
package Servicios;


public class ServicioAdicional {
    protected int conteoUso;
    protected double precioxUso;
    public ServicioAdicional(double precioxUso) {
        this.precioxUso = precioxUso;
        this.conteoUso = 0;}
    public void registrarUso() {
        this.conteoUso++;
    }
    public double calcularTotal() {
        return this.conteoUso * this.precioxUso;
    }
    public int getConteoUso() {
        return conteoUso;
    }
    public double getPrecioxUso() {
        return precioxUso;
    }
}
