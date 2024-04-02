package montaje;
/**
 * @author Iker
 * @version 1.0
 * @since 01-04-2024
 * @see Procesador
 * @see Ordenadores
 */
public class Main {
    public static void main(String[] args) {

        Ordenadores ordenadores = new Ordenadores(32, "MSI Katana");
        System.out.println("Informacion del ordenador: ");
        ordenadores.mostrarInformacion();
        System.out.println();


        Procesador procesador=new Procesador("Intel Core i9", 4.1);
        System.out.println("Informacion del procesador: ");
        procesador.mostrarInformacion();

       }
    }
