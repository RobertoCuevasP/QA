package ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class CalcularHoraFecha {

    private List<String> months = new ArrayList<>();

    public void addMonths(){
        months.add("Enero");
        months.add("Febrero");
        months.add("Marzo");
        months.add("Abril");
        months.add("Mayo");
        months.add("Junio");
        months.add("Agosto");
        months.add("Septiembre");
        months.add("Octubre");
        months.add("Noviembre");
        months.add("Diciembre");

    }

    public String CalcularFecha(int day, String month, int year, int hour, int min, int sec){

        addMonths();

        String result;

        if(day <= 0 || year <= 0 || hour > 23 || hour < 0 || min > 59 || min < 0 || sec > 59 || sec < 0 ){
            return "*** INGRESE DATOS CORRECTOS ***";
        }

        if(!month.equals("Enero") && !month.equals("Febrero") && !month.equals("Marzo") && !month.equals("Abril") && !month.equals("Mayo") && !month.equals("Junio") && !month.equals("Julio") && !month.equals("Agosto") && !month.equals("Septiembre") && !month.equals("Octubre") && !month.equals("Noviembre") && !month.equals("Diciembre")){
            return "*** INGRESE DATOS CORRECTOS ***";
        }

        if(month.equals("Enero") || month.equals("Marzo") || month.equals("Mayo") || month.equals("Julio") || month.equals("Septiembre") || month.equals("Octubre") || month.equals("Diciembre")){
            if(day > 31){
                return "*** INGRESE DATOS CORRECTOS ***";
            }
        } else if(month.equals("Febrero")){
            if (year%4 == 0){
                if (day > 29){
                    return "*** INGRESE DATOS CORRECTOS ***";
                }
            } else {
                if (day > 28){
                    return "*** INGRESE DATOS CORRECTOS ***";
                }
            }
        }

        int tempDay = day;
        int tempHour = hour;
        int tempSec = sec;
        int tempMin = min;
        String tempMonth = month;
        int tempYear = year;

        tempSec = sec + 1;
        if(tempSec == 60){
            tempSec = 0;
            tempMin = min + 1;
            if (tempMin == 60){
                tempMin = 0;
                tempHour = hour + 1;
                if (tempHour == 24){
                    tempHour = 0;
                    tempDay = day + 1;
                    if ((tempDay == 29 && month.equals("Febrero") && year % 4 != 0)
                            || (tempDay == 30 && month.equals("Febrero"))
                            || (tempDay == 31 && (month.equals("Abril") || month.equals("Junio") || month.equals("Agosto") || month.equals("Noviembre")))
                            || (tempDay == 32)){
                        tempDay = 1;
                        if(!month.equals("Diciembre")) {
                            tempMonth = months.get(months.indexOf(month) + 1);
                        } else {
                            tempMonth = "Enero";
                            tempYear = year + 1;
                        }
                    }
                }
            }
        }

        result = tempDay + " " + tempMonth + " " + tempYear + " " + tempHour + ":" + tempMin + ":" + tempSec;
        return result;
    }
}
