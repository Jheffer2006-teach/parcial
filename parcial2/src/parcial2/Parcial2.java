/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial2;
import java.util.*;

/**
 *
 * @author jose
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    
        
        int opcion;
        
            do{
                System.out.println("Seleccione la opcion: ");
                System.out.println("1. Agregar carro");
                System.out.println("2. Agregar moto");
                System.out.println("3. Agregar camion");
                System.out.println("4. Mostrar vehiculos");
                System.out.println("5. Salir");                            
                opcion = entrada.nextInt();
                entrada.nextLine();
                
                switch(opcion){
                    case 1:
                        System.out.println("Ingresar la marca del carro: ");
                        String mar1 = entrada.nextLine();                       
                        if(mar1.matches(".*\\d.*") || mar1.isEmpty()){
                            System.out.println("ERROR. No se permiten números o el campo esta vacio");
                        }else{                                            
                            System.out.println("Ingresar el modelo del carro: ");
                            String mod1 = entrada.nextLine();   
                        if(mod1.isEmpty()){
                            System.out.println("ERROR. El campo esta vacio");  
                        }else{                       
                            System.out.println("Ingresar el precio del carro: ");
                            String precioTexto1 = entrada.nextLine();
                            
                        if (precioTexto1.matches(".*[A-Za-z].*") || precioTexto1.isEmpty()) {
                            System.out.println("ERROR. No se permiten letras o el campo esta vacio");
                        }else{
                        double pre1 = Double.parseDouble(precioTexto1);                                           
                        System.out.println("Ingresar el color del carro: ");
                        String color = entrada.nextLine();
                        if(color.matches(".*\\d.*") || color.isEmpty()){
                            System.out.println("ERROR. No se permiten números o el campo esta vacio");
                        }else{
                        vehiculos.add(new Carro(mar1, mod1, pre1, color));
                        System.out.println("Carro agregado exitosamente");
                        }
                    }
                }
            }
                    break;
                    case 2:  
                        System.out.println("Ingresar la marca de la moto: ");
                        String mar2 = entrada.nextLine();
                        if(mar2.matches(".*\\d.*") || mar2.isEmpty()){
                            System.out.println("ERROR. No se permiten números o el campo esta vacio");
                        }else{
                        System.out.println("Ingresar el modelo de la moto: ");
                        String mod2 = entrada.nextLine();
                        if(mod2.isEmpty()){
                            System.out.println("ERROR. El campo esta vacio");  
                        }else{
                        System.out.println("Ingresar el precio de la moto: ");
                        String precioTexto2 = entrada.nextLine();
                        if (precioTexto2.matches(".*[A-Za-z].*") || precioTexto2.isEmpty()) {
                            System.out.println("ERROR. No se permiten letras o el campo esta vacio");
                        }else{
                        double pre2 = Double.parseDouble(precioTexto2);                        
                        System.out.println("Ingresar la velocidad maxima: ");
                        String cor1 = entrada.nextLine();
                        if (cor1.matches(".*[A-Za-z].*") || cor1.isEmpty()) {
                            System.out.println("ERROR. No se permiten letras o el campo esta vacio");
                        }else{
                            int cor = Integer.parseInt(cor1);                                            
                            vehiculos.add(new Moto(mar2, mod2, pre2, cor));
                            System.out.println("Moto agregada exitosamente");
                            }
                        }
                    }
                }
                    break;
                    case 3: 
                        System.out.println("Ingresar la marca del camion: ");
                        String mar3 = entrada.nextLine();
                        if(mar3.matches(".*\\d.*") || mar3.isEmpty()){
                            System.out.println("ERROR. No se permiten números o el campo esta vacio");
                        }else{
                        System.out.println("Ingresar el modelo del camion: ");
                        String mod3 = entrada.nextLine();
                        if(mod3.isEmpty()){
                            System.out.println("ERROR. El campo esta vacio");  
                        }else{
                        System.out.println("Ingresar el precio del camion: ");
                        String precioTexto3 = entrada.nextLine();
                        if (precioTexto3.matches(".*[A-Za-z].*") || precioTexto3.isEmpty()) {
                            System.out.println("ERROR. No se permiten letras o el campo esta vacio");
                        }else{
                        double pre3 = Double.parseDouble(precioTexto3);
                        System.out.println("Ingresar el peso del camion: ");
                        String pes1 = entrada.nextLine();
                        if (pes1.matches(".*[A-Za-z].*") || pes1.isEmpty()) {
                            System.out.println("ERROR. No se permiten letras o el campo esta vacio");
                        }else{
                        double pes = Double.parseDouble(pes1);
                        
                        vehiculos.add(new Camion(mar3, mod3, pre3, pes));
                        System.out.println("Carro agregado exitosamente");
                        }
                    }
                }
            }
                    break;
                    case 4:
                        System.out.println("\n Lista vehiculos:");
                        if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehiculos registrados.");
                            }else{
                                for (Vehiculo vehi : vehiculos) {
                                System.out.println(vehi.toString());               
                        }
                    }
                    break;
                    case 5:                 
                    System.out.println("Salir...");
                    break;
                    default:
                    System.out.println("ERROR. Dato invalido");
                        }        
                    }while(opcion != 5);
    
    }   
}

