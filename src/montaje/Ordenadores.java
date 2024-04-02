
package montaje;
/**
 * @author Iker
 * @version 1.0
 * @since 01-04-2024
 */
public class Ordenadores {
  private int ramGB;
  private String modelo;

    public Ordenadores(int ramGB, String modelo) {
        this.ramGB = ramGB;
        this.modelo = modelo;
        /**
         * @param modelo  Este valor devuelve el modelo de ordenador
         * @param ramGB Este valor devuelve la cantidad de ram del ordenador
         */

        }

    /**
     *
     * @return ramGB devuelve la cantidad de RAM
     */
    public int getRamGB() {
        return ramGB;
    }

    /**
     *
     * @return modelo devuelve el modelo de ordenador
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Esta clase muestra la información del ordenador, tanto el modelo como la cantidad de RAM
     */
        public void mostrarInformacion(){
            System.out.println("Modelo: " +modelo);
            System.out.println("RAM: "+ramGB + " GB");
        }
    }

