package cl.philipsoft.mi_solucion1;

import cl.philipsoft.mi_solucion1.cli.Command;
import cl.philipsoft.mi_solucion1.model.Resultado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.shell.standard.ShellComponent;

@ShellComponent
@SpringBootConfiguration
public class MiSolucion1Application {

    public static void main(String[] args) {
        SpringApplication.run(MiSolucion1Application.class, args);
        Command command = new Command();
        Resultado resultado = command.openFile(args[0]);
        command.writeFile(resultado, args[1]);
    }

}
