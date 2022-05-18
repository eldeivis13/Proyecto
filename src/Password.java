
public class Password {
	
	private static String contrase�a;
	private static String MAYUSCULAS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String minusculas="abcdefghijklmnopqrstuvwxyz";
	private static String numros = "0123456789";
	
	public Password(String contrase�a) {
		super();
		this.contrase�a = contrase�a;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public String generarPassword(String clave, int longitud) {
		String contra = "";
		int max, min, esp;
		
		for(int i = 0; i < longitud; i++) {
			contra+=(MAYUSCULAS.charAt((int)(Math.random()*MAYUSCULAS.length()))) + (minusculas.charAt((int)(Math.random()*minusculas.length()))) + (numros.charAt((int)(Math.random()*numros.length())));
		}
		
		return contra;
	}
	
	public boolean passwordValida() {
		int longitud = contrase�a.length();
		boolean validar = false;
		
		for(int i = 0; i < longitud; i++) {
			if(contrase�a.contains(MAYUSCULAS) && contrase�a.contains(minusculas) && contrase�a.contains(numros)) {
				validar = true;
			}else {
				validar = false;
			}
		}
		
		return validar;
	}

}
