package segundoTrimestre;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Calendarios {
	public static void main(String[] args)
	{
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.toString());
		/* Sale
java.util.GregorianCalendar[time=1488813871794,areFieldsSet=true,areAllFieldsSet=tr
ue,lenient=true,zone=sun.util.calendar.ZoneInfo
[id="Europe/Paris",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=1
84,lastRule=java.util.SimpleTimeZone
[id=Europe/Paris,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,sta
rtMode=2,startMonth=2,startDay=-
1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-
1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]],firstDayOfWeek=2,minimalDaysInFirs
tWeek=4,ERA=1,YEAR=2017,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MON
TH=6,DAY_OF_YEAR=65,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=4,HOUR_OF_DAY
=16,MINUTE=24,SECOND=31,MILLISECOND=794,ZONE_OFFSET=3600000,DST_OFFSET=0]
		 */
		// Ahora sacar datos poco a poco
		// Fecha completa
		System.out.println(c1.getTime()); // Sale Mon Mar 06 16:26:51 CET 2017
		//Crear una fecha concreta con GregorianCalendar(año. mes. día, hora, minutos, segundos)
Calendar c2 = new GregorianCalendar(2010, Calendar.FEBRUARY, 22, 23, 11, 44);
System.out.println("Fecha concreta : " + c2.getTime());
//Cambios varios
Calendar c3 = Calendar.getInstance();
c3.set(Calendar.YEAR, 2010);
//Meses: 0 es Enero, 11 es Noviembre
c3.set(Calendar.MONTH, Calendar.AUGUST);
c3.set(Calendar.DAY_OF_MONTH, 23);
//Poner formato AM/PM
c3.set(Calendar.HOUR, 10);
c3.set(Calendar.AM_PM, Calendar.PM);
//O formato 24H
c3.set(Calendar.HOUR_OF_DAY, 22);
c3.set(Calendar.MINUTE, 36);
c3.set(Calendar.SECOND, 22);
c3.set(Calendar.MILLISECOND, 123);
System.out.println("Otra fecha : " + c3.getTime());
//Completo
//Establecer franja horaria
Locale locale = Locale.getDefault();
Calendar hoy = Calendar.getInstance();
System.out.println("\n** Ejemplo completo **");
System.out.println("Año : " + hoy.get(Calendar.YEAR));
System.out.println("Mes (0 es Enero): " + hoy.get(Calendar.MONTH));
System.out.println("Mes (Cadena): " + hoy.getDisplayName(Calendar.MONTH,
		Calendar.SHORT, locale));
System.out.println("Día del Mes : " + hoy.get(Calendar.DAY_OF_MONTH));
System.out.println("Día de la Semana (1 es Domingo): " +
		hoy.get(Calendar.DAY_OF_WEEK));
System.out.println("Día de la Semana (Cadena): " +
		hoy.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG,locale));
System.out.println("Semana del año : " + hoy.get(Calendar.WEEK_OF_YEAR));
System.out.println("Semana del Mes : " + hoy.get(Calendar.WEEK_OF_MONTH));
System.out.println("Día del año : " + hoy.get(Calendar.DAY_OF_YEAR));
System.out.println("Hora formato 24H : " + hoy.get(Calendar.HOUR_OF_DAY));
System.out.println("Hora formato 12H : " + hoy.get(Calendar.HOUR));
System.out.println("AM/PM : " + hoy.get(Calendar.AM_PM));
System.out.println("AM/PM : " + hoy.getDisplayName(Calendar.AM_PM, Calendar.LONG,
		locale));
System.out.println("Minutos : " + hoy.get(Calendar.MINUTE));
System.out.println("Segundos : " + hoy.get(Calendar.SECOND));
System.out.println("MiliSegundos : " + hoy.get(Calendar.MILLISECOND));
// Sumar y restar fechas
System.out.println("\n** Sumar y Restar **");
Calendar hoy2 = Calendar.getInstance();
hoy2.add(Calendar.DAY_OF_MONTH, 20);
System.out.println("Hoy más 20 días : " + hoy2.getTime());
hoy2 = Calendar.getInstance();
hoy2.add(Calendar.DAY_OF_MONTH, -20);
System.out.println("Hoy menos 20 días : " + hoy2.getTime());
// Comparar fechas
System.out.println("\n** Comparar fechas **");
Calendar c4 = Calendar.getInstance();
Calendar despues = Calendar.getInstance();
despues.add(Calendar.HOUR_OF_DAY, 2);
System.out.println("La fecha es posterior al incremento:" + c4.after(despues));
System.out.println("La fecha es posterior al incremento:" + c4.before(despues));
// Días de diferencia
System.out.println("\n** Días de diferencia **");
Calendar unDia = Calendar.getInstance();
unDia.set(Calendar.MONTH, Calendar.MARCH);
Calendar otroDia = Calendar.getInstance();
otroDia.set(Calendar.MONTH, Calendar.FEBRUARY);
long milisegundos = unDia.getTimeInMillis()-otroDia.getTimeInMillis();
long dias = milisegundos/1000/60/60/24;
System.out.println("Días : "+dias);
	}
}
