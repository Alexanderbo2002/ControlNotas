package logica; 
/**
 * La clase ControlNotas es la clase principal de la aplicacion
 * Es responsable de iniciar la interfaz grafica de usuario (GUI).
 */
import igu.Pantalla;

    /**
     * El método main es el punto de entrada de la aplicacion
     * Aquí se inicializa la GUI estableciendo la visibilidad y la ubicación de la ventana
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
public class ControlNotas {

    public static void main(String[] args) {
        // Creamos una instancia de la clase Pantalla que representa la ventana principal de la GUI
        Pantalla panta = new Pantalla(); 
        // Hacer visible la ventana de la GUI
        panta.setVisible(true);
        // Centrar la ventana en la pantalla
        panta.setLocationRelativeTo(null);
        
        
    }   
}
