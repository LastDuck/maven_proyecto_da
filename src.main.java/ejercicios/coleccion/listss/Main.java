package ejercicios.coleccion.listss;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer n1=25;
		Integer n2=26;
		Integer n3=21;
		Integer n4=27;
		Integer n5=29;
		
		List<Integer> listaNueva=new ArrayList<>();
		listaNueva.add(n1);
		listaNueva.add(n2);
		listaNueva.add(n3);
		listaNueva.add(n4);
		listaNueva.add(n5);
		
		Date dt = new Date();
        System.out.println("Today:    "+dt);
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 5);
        dt = (Date) c.getTime();
        System.out.println("Tomorrow: "+dt);
	}

}
