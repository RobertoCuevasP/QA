package ejercicio2;

public class CalcularHoraFecha {
    public String CalcularFecha(int day, String month, int year, int hour, int min, int sec){
        String result;

        if(day <= 0 || year <= 0 || hour > 23 || hour < 0 || min > 59 || min < 0 || sec > 59 || sec < 0 ){
            return "*** INGRESE DATOS CORRECTOS ***";
        }

        if(!month.equals("Enero") && !month.equals("Febrero") && !month.equals("Marzo") && !month.equals("Abril") && !month.equals("Mayo") && !month.equals("Junio") && !month.equals("Julio") && !month.equals("Agosto") && !month.equals("Septiembre") && !month.equals("Octubre") && !month.equals("Noviembre") && !month.equals("Diciembre")){
            return "*** INGRESE DATOS CORRECTOS ***";
        }

        int tempSec = sec + 1;
        if(tempSec == 60){
            tempSec = 0;
            int tempMin
        }


        return result;
    }
}
