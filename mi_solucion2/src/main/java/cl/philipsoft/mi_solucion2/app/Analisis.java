package cl.philipsoft.mi_solucion2.app;

import cl.philipsoft.mi_solucion2.model.Periodo;
import cl.philipsoft.mi_solucion2.model.Resultado;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class Analisis {
    public Resultado analizar(Periodo periodo) {

        List<String> fechasFaltantes = new ArrayList<>();
        List<String> fechas = periodo.getFechas();
        fechas.add(periodo.getFechaCreacion());
        fechas.add(periodo.getFechaFin());

        Resultado resultado = new Resultado();
        resultado.setId(periodo.getId());
        resultado.setFechaCreacion(periodo.getFechaCreacion());
        resultado.setFechaFin(periodo.getFechaFin());
        resultado.setFechasRecibidas(periodo.getFechas());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startPeriod = Calendar.getInstance();
        Calendar endPeriod = Calendar.getInstance();
        try {
            startPeriod.setTime(dateFormat.parse(periodo.getFechaCreacion()));
            endPeriod.setTime(dateFormat.parse(periodo.getFechaFin()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        while (startPeriod.before(endPeriod)) {
            String date = dateFormat.format(startPeriod.getTime()).toUpperCase();
            fechasFaltantes.add(date);
            startPeriod.add(Calendar.MONTH, 1);
        }

        fechasFaltantes.removeAll(fechas);

        resultado.setFechasFaltantes(fechasFaltantes);
        System.out.println("\n\nRESULTADO:\n\n");
        Stream.of(resultado.getFechasFaltantes().toString()).forEach(System.out::println);

        return resultado;

    }
}
