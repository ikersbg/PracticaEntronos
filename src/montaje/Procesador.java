package montaje;
/**
 * @author Iker
 * @version 1.0
 * @since 01-04-2024
 * @see Ordenadores
 * @see Main
 */
public class Procesador {
    private String marca;
    private double velocidadGHz;
    
    public Procesador(String marca, double velocidadGHz) {
        this.marca = marca;
        this.velocidadGHz = velocidadGHz;
    }

    public String getMarca() {
        return marca;
    }

    public double getVelocidadGHz() {
        return velocidadGHz;
    }


    public void mostrarInformacion(){
        System.out.println("Marca del procesador: "+marca);
        System.out.println("Velocidad del procesador: " +velocidadGHz +"GHz");
    }

    /**
     * @deprecated
     * @return
     */
    public double pruebaRendimiento(){
        double solucion = velocidadGHz / 30;
        return solucion;
    }
}
