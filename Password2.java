
public class Password2 {
	// esto lo copias y lo pegas en el main joseto Password2.getPassword(Password2.MINUSCULAS+Password2.MAYUSCULAS+Password2.ESPECIALES,10);
	private static String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
	private static String ESPECIALES = "._��";
	private static String contrase�a;
	
	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public String generarPassword2(int longitud) {
		String contra = "", max = "", min = "", num = "";
		int cont;
		
		for(int i = 0; i < longitud; i++) {
			cont = (int)(1 + Math.random()*3);
			if(cont == 1) {
				max +=(MAYUSCULAS.charAt((int)(Math.random()*MAYUSCULAS.length())));
			} else if (cont == 2) {
				min +=(minusculas.charAt((int)(Math.random()*minusculas.length())));
			}else if(cont == 3) {
				num +=(numros.charAt((int)(Math.random()*numros.length())));
			}
		}
		contra = contra.concat(max) + contra.concat(min) + contra.concat(num);
		
		return contra;
	}
	
	public boolean passwordValida2() {
		int longitud = contrase�a.length();
		boolean validar = false;
		
		for(int i = 0; i < contrase�a.charAt(i); i++) {
			if(MAYUSCULAS.indexOf(contrase�a.charAt(i),0)!=1) {
				validar = true;
			}else {
				validar = false;
			}
		}
		
		return validar;
	}
}
