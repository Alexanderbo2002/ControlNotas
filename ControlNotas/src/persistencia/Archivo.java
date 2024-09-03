package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    public void guardarDatos(String datos) {
        // Ruta donde se guardará el archivo
        String rutaArchivo = "estudiantes.txt";
        
        // Escribir los datos en el archivo, agregando en lugar de sobrescribir
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Agregar una línea de separación antes y después de los datos
            writer.write("****************************************************");
            writer.newLine();
            writer.write(datos);
            writer.newLine();
            writer.write("****************************************************");
            writer.newLine();
            writer.newLine(); // Agregar un salto de línea extra entre registros
            System.out.println("Datos guardados exitosamente en " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}
