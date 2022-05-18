
public class Password {
	
	private static String contraseña;
	private static String MAYUSCULAS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String minusculas="abcdefghijklmnopqrstuvwxyz";
	private static String numros = "0123456789";
	
	public Password(String contraseña) {
		super();
		this.contraseña = contraseña;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
		int longitud = contraseña.length();
		boolean validar = false;
		
		for(int i = 0; i < longitud; i++) {
			if(contraseña.contains(MAYUSCULAS) && contraseña.contains(minusculas) && contraseña.contains(numros)) {
				validar = true;
			}else {
				validar = false;
			}
		}
		
		return validar;
	}

}
