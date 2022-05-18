import java.util.*;
public class PrincipalApp {
	 
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("# ----- GENERADOR DE CONTRASE�A ALEATORIA ----- #");
		System.out.println("Escoge la longitud de tu contrase�a: ");
		int longc = sc.nextInt();
		
		Password contrase�a = new Password();
		
		if(longc < 4) {
			System.out.println("Introduce una longitud de caracteres correcta");
		}else {
			System.out.println(contrase�a.generarPassword(longc));
		}
		
		System.out.println(contrase�a.passwordValida());
	}
}