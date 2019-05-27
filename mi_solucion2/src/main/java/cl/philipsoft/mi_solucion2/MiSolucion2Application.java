package cl.philipsoft.mi_solucion2;

import cl.philipsoft.mi_solucion2.cli.Command;
import cl.philipsoft.mi_solucion2.model.Resultado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
public class MiSolucion2Application {

    public static void main(String[] args) {
        SpringApplication.run(MiSolucion2Application.class, args);
        String archivoSalida = null;
        Command command = new Command();
        Resultado resultado = command.fetchJson();
        if (args.length == 0) {
            archivoSalida = "resultado.json";
        }
        else{
            archivoSalida = args[0].toString();
        }
        command.writeFile(resultado, archivoSalida);
    }

}
