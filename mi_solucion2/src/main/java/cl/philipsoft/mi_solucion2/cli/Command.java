package cl.philipsoft.mi_solucion2.cli;

import cl.philipsoft.mi_solucion2.app.Analisis;
import cl.philipsoft.mi_solucion2.model.Periodo;
import cl.philipsoft.mi_solucion2.model.Resultado;
import cl.philipsoft.mi_solucion2.util.JsonWriter;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.web.client.RestTemplate;


@ShellComponent
public class Command {

    @ShellMethod("Consumir servicio @GET @REST ")
    public Resultado fetchJson() {
        RestTemplate restTemplate = new RestTemplate();
        Periodo periodo = restTemplate.getForObject("http://localhost:8080/periodos/api", Periodo.class);
        Analisis analisis = new Analisis();
        return analisis.analizar(periodo);
    }

    @ShellMethod("Escribir Archivo")
    public void writeFile(Resultado resultado, String archivoSalida) {
        JsonWriter jsonWriter = new JsonWriter();
        jsonWriter.write(resultado, archivoSalida);
    }
}