
public class Password2 {
<<<<<<< HEAD
	private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	private static String ESPECIALES = "._ñÑ";
	private static String contraseña;
	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String generarPassword2(int longitud) {
		String contra = "", max = "", min = "", esp = "";
		int cont;
		
		for(int i = 0; i < longitud; i++) {
			cont = (int)(1 + Math.random()*3);
			if(cont == 1) {
				max +=(MAYUSCULAS.charAt((int)(Math.random()*MAYUSCULAS.length())));
			} else if (cont == 2) {
				min +=(MINUSCULAS.charAt((int)(Math.random()*MINUSCULAS.length())));
			}else if(cont == 3) {
				esp +=(ESPECIALES.charAt((int)(Math.random()*ESPECIALES.length())));
			}
		}
		contra = contra.concat(max) + contra.concat(min) + contra.concat(esp);
		
		return contra;
	}
	
	public boolean passwordValida2() {
		String contraseña = " ";
        boolean valida = false;

        char[] cadena_div = contraseña.toCharArray();

        int mayus = 0;
        int minus = 0;
        int caracteres = 0;

        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
            	caracteres++;
            }

            if (Character.isUpperCase(cadena_div[i])) {
                mayus++;
            }

            if (Character.isLowerCase(cadena_div[i])) {
                minus++;
            }
        }

        if (caracteres >= 1 && mayus >= 1 && minus > 2) {
            valida = true;
        } else {
            valida = false;
        }

        return valida;
	}
=======
	// esto lo copias y lo pegas en el main joseto Password2.getPassword(Password2.MINUSCULAS+Password2.MAYUSCULAS+Password2.ESPECIALES,10);
	
	public static String NUMEROS = "0123456789";
	 
	public static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 
	public static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
 
	public static String ESPECIALES = "._ñÑ";
 
	
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
		String contraseña = "";
 
		for (int i = 0; i < longitud; i++) {
			contraseña+=(clave.charAt((int)(Math.random() * clave.length())));
		}
		return contraseña;
	}	
>>>>>>> branch 'master' of https://github.com/eldeivis13/Proyecto.git
}
