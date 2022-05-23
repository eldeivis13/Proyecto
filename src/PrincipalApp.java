import java.util.*;
public class PrincipalApp {
	 
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("# ----- GENERADOR DE CONTRASEŅA ALEATORIA ----- #");
		System.out.println("Escoge la longitud de tu contraseņa: ");
		int longc = sc.nextInt();
		
		Password contraseņa = new Password();
		Password2 contraseņa2 = new Password2();
		
		if(longc < 4) {
			System.out.println("Introduce una longitud de caracteres correcta");
		}else {
			System.out.println(contraseņa.generarPassword(longc));
			System.out.println(contraseņa.passwordValida());
		}
		
		if(longc < 4) {
			System.out.println("Introduce una longitud de caracteres correcta");
		}else {
			System.out.println(contraseņa2.generarPassword2(longc));
			System.out.println(contraseņa2.passwordValida2());
		}
	}
}