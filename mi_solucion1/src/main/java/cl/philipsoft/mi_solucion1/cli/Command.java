package cl.philipsoft.mi_solucion1.cli;

import cl.philipsoft.mi_solucion1.app.Analisis;
import cl.philipsoft.mi_solucion1.model.Resultado;
import cl.philipsoft.mi_solucion1.util.JsonReader;
import cl.philipsoft.mi_solucion1.util.JsonWriter;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


@ShellComponent
public class Command {

    @ShellMethod("Abrir arvhivo")
    public Resultado openFile(String archivoEntrada) {
        Analisis analisis = new Analisis();
        FileInputStream fileInputStream = null;
        JsonReader jsonReader = new JsonReader();

        try {
            fileInputStream = new FileInputStream(archivoEntrada);

            System.out.println("\nArchivo: " + archivoEntrada + "\nBytes: " + fileInputStream.available());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return analisis.analizar(jsonReader.read(archivoEntrada));
    }

    @ShellMethod("Escribir Archivo")
    public void writeFile(Resultado resultado, String archivoSalida) {
        JsonWriter jsonWriter = new JsonWriter();
        jsonWriter.write(resultado, archivoSalida);
    }
}