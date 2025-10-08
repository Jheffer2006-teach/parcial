/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author jose
 */
public class Carro extends Vehiculo {
    private String color_carro; 
    public Carro(String marca, String modelo, double precio, String color_carro) {
        super(marca, modelo, precio);
        this.color_carro = color_carro;
    }

    /**
     * @return the color_carro
     */
    public String getColor_carro() {
        return color_carro;
    }

    /**
     * @param color_carro the color_carro to set
     */
    public void setColor_carro(String color_carro) {
        this.color_carro = color_carro;
    }
    
    public String toString() {
    return super.toString() + " | El color del carro es: " + this.getColor_carro();
    }
}
