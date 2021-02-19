package ejercicio2Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(value= Parameterized.class)
public class CalcularHoraFechaTest {

    private int dia;
    private String mes;
    private int year;
    private int hour;
    private int minute;
    private int second;

    public CalcularHoraFechaTest(int dia, String mes, int year, int hour, int minute, int second){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]>objects= new ArrayList<>();
        objects.add(new Object[]{1,"Enero", 2021, 0, 0, 0, "1 Enero 1 00:00:01"}); //Dia, mes, año, hora, minuto, segundo
        objects.add(new Object[]{31,"Enero", 2021, 23, 59, 59, "1 Febrero 1 00:00:00"});
        objects.add(new Object[]{0,"Enero", 2021, 0, 0, 0, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{2,"Enero", 2021, 0, 0, 0, "2 Enero 1 00:00:01"});
        objects.add(new Object[]{30,"Enero", 2021, 23, 59, 59, "31 Enero 1 00:00:00"});
        objects.add(new Object[]{32,"Enero", 2021, 23, 59, 59, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 0, 23, 59, 59, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, -1, 0, 0, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, 24, 59, 59, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, 0, -1, 0, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, 0, 60, 0, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, 0, 0, -1, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Enero", 2021, 0, 0, 60, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{1,"Febrero", 1, 0, 0, 0, "1 Febrero 1 00:00:01"}); //Dia, mes, año, hora, minuto, segundo
        objects.add(new Object[]{28,"Febrero", 2021, 23, 59, 59, "1 Marzo 2021 00:00:00"});
        objects.add(new Object[]{27,"Febrero", 2021, 23, 59, 59, "28 Febrero 1 00:00:00"});
        objects.add(new Object[]{29,"Febrero", 2021, 23, 59, 59, "*** INGRESE DATOS CORRECTOS ***"});
        objects.add(new Object[]{28,"Febrero", 2020, 23, 59, 59, "29 Febrero 2020 00:00:00"});

        return objects;
    }


}
