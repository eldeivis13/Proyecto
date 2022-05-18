
public class Password {
	
	private static String contraseña;

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
	
	public static void passwordValida() {
		int longitud = contraseña.length();
	}

}
