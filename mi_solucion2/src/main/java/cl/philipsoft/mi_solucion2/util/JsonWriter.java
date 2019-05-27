package cl.philipsoft.mi_solucion2.util;

import cl.philipsoft.mi_solucion2.model.Resultado;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonWriter {

    public void write(Resultado resultado, String archivoSalida) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            System.out.println("\nEscribiendo resultado a: " + archivoSalida + "\n");
            objectMapper.writeValue(new File(archivoSalida), resultado);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
