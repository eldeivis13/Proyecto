import java.util.*;
public class PrincipalApp {
	 
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("# ----- GENERADOR DE CONTRASEÑA ALEATORIA ----- #");
		System.out.println("Escoge la longitud de tu contraseña: ");
		int longc = sc.nextInt();
		
		Password contraseña = new Password();
		
		if(longc < 4) {
			System.out.println("Introduce una longitud de caracteres correcta");
		}else {
			System.out.println(contraseña.generarPassword(longc));
		}
		
		System.out.println(contraseña.passwordValida());
	}
}