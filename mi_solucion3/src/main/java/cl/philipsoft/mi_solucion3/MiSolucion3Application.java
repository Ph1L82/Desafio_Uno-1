package cl.philipsoft.mi_solucion3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "cl.philipsoft.mi_solucion3.client",
        "cl.philipsoft.mi_solucion3.controller",
        "cl.philipsoft.mi_solucion3.model",
        "cl.philipsoft.mi_solucion3.service"
})
public class MiSolucion3Application {

    public static void main(String[] args) {
        SpringApplication.run(MiSolucion3Application.class, args);
    }

}
