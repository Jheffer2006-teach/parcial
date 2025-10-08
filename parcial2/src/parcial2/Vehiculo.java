/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

/**
 *
 * @author jose
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo (String marca, String modelo, double precio) {
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
   }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String toString() {
    return "Marca: " + this.getMarca() + " | Modelo: " + this.getModelo() + " | Precio: " + this.getPrecio();
    }
}
