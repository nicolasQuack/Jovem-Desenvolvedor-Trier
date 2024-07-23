package aula_introducao;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ExemploDatas {
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dtAtual = new Date();
		
//		String dataUsuario = "21/04/2004";
		
//		Date dataUsuarioDate = null;
//		try {
//			dataUsuarioDate = df.parse(dataUsuario);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(dtAtual);
		cl.add(Calendar.DAY_OF_MONTH, 83);
	
		System.out.println(cl.getTime());
	}
}
