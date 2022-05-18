
public class Password2 {
	// esto lo copias y lo pegas en el main joseto Password2.getPassword(Password2.MINUSCULAS+Password2.MAYUSCULAS+Password2.ESPECIALES,10);
	
	public static String NUMEROS = "0123456789";
	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
	public static String ESPECIALES = "._��";
 
	
	public static String getPinNumber() {
		return getPassword(NUMEROS, 4);
	}
 
	public static String getPassword() {
		return getPassword(8);
	}
 
	public static  String getPassword(int length) {
		return getPassword(NUMEROS + MAYUSCULAS + MINUSCULAS, length);
	}
 
	public static String getPassword(String clave, int longitud) {
		String contrase�a = "";
 
		for (int i = 0; i < longitud; i++) {
			contrase�a+=(clave.charAt((int)(Math.random() * clave.length())));
		}
		return contrase�a;
	}	
}
