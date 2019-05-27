package cl.philipsoft.mi_solucion3.service;

import cl.philipsoft.mi_solucion3.client.CallRestService;
import cl.philipsoft.mi_solucion3.model.Periodo;
import cl.philipsoft.mi_solucion3.model.Resultado;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

@Service
public class AnalysisService {

    public Resultado analyze() {
        CallRestService callRestService = new CallRestService();
        Periodo periodo = callRestService.callRestService();

        List<String> fechasFaltantes = new ArrayList<>();
        List<String> fechasTMP = periodo.getFechas();
        fechasTMP.add(periodo.getFechaCreacion());
        fechasTMP.add(periodo.getFechaFin());
        Collections.sort(fechasTMP); //just for kicks

        Resultado resultado = new Resultado();
        resultado.setId(periodo.getId());
        resultado.setFechaCreacion(periodo.getFechaCreacion());
        resultado.setFechaFin(periodo.getFechaFin());
        resultado.setFechas(periodo.getFechas());

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

        fechasFaltantes.removeAll(fechasTMP);
        resultado.setFechasFaltantes(fechasFaltantes);

        return resultado;
    }
}
