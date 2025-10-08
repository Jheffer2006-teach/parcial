/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author jose
 */
public class Camion extends Vehiculo{
    private double peso;
    public Camion(String marca, String modelo, double precio, double peso) {
        super(marca, modelo, precio);
        this.peso = peso;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString() {
    return super.toString() + " | El peso del camion es: " + this.getPeso() + " kg";
    }
}
