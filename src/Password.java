
public class Password {
	
	private static String contrase�a;

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
	
	public static void passwordValida() {
		int longitud = contrase�a.length();
	}

}
