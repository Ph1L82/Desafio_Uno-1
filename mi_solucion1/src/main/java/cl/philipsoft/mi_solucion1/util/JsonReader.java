package cl.philipsoft.mi_solucion1.util;

import cl.philipsoft.mi_solucion1.model.Periodo;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    public Periodo read(String json) {
        Periodo periodo = new Periodo();
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("\n\nArchivo: " + json);
        try {
            periodo = objectMapper.readValue(new File(json), Periodo.class);
            String prettyPeriodo = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(periodo);
            System.out.println(prettyPeriodo);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return periodo;
        }

    }
}
