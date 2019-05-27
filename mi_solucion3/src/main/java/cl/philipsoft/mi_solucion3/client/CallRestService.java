package cl.philipsoft.mi_solucion3.client;

import cl.philipsoft.mi_solucion3.model.Periodo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.stream.Stream;

@Component
public class CallRestService implements CommandLineRunner {
    public Periodo callRestService() {
        RestTemplate restTemplate = new RestTemplate();
        Periodo periodo = restTemplate.getForObject("http://localhost:8080/periodos/api", Periodo.class);
        System.out.println("\nID: " + periodo.getId());
        System.out.println("\nFecha Creacion: " + periodo.getFechaCreacion());
        System.out.println("\nFecha Fin: " + periodo.getFechaFin());
        System.out.println("\nFechas: \n");
        Stream.of(periodo.getFechas().toString()).forEach(System.out::print);
        return periodo;
    }

    @Override
    public void run(String... args) throws Exception {
        callRestService();
    }
}
