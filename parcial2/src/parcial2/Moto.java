/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author jose
 */
public class Moto extends Vehiculo {
    private int correr;
    public Moto(String marca, String modelo, double precio, int correr) {
        super(marca, modelo, precio);
        this.correr = correr;
    }

    /**
     * @return the correr
     */
    public int getCorrer() {
        return correr;
    }

    /**
     * @param correr the correr to set
     */
    public void setCorrer(int correr) {
        this.correr = correr;
    }
    
    public String toString() {
    return super.toString() + " | La velocidad maxima de la moto es: " + this.getCorrer() + " km/h";
    }
}
