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

    /**
     * He creado la clase mostrar infomacion para que nos muestre tanto la marca como la velocidad
     */
    public void mostrarInformacion(){
        System.out.println("Marca del procesador: "+marca);
        System.out.println("Velocidad del procesador: " +velocidadGHz +"GHz");
    }

    /**
     * @deprecated
     * @return
     */
    /**
     *
     * He creado la clase prueba rendimiento para hacerla inservible porque ya no se usa con tanta frecuencia
     */
    public double pruebaRendimiento(){
        double solucion = velocidadGHz / 30;
        return solucion;
    }
}
