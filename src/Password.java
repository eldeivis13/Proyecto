
public class Password {
	
	private String contraseña;
	private String MAYUSCULAS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String minusculas="abcdefghijklmnopqrstuvwxyz";
	private String numros = "0123456789";
	
	public Password() {
		super();
		this.contraseña = contraseña;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String generarPassword(int longitud) {
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
	
	public boolean passwordValida() {
        String contraseña = " ";
        boolean valida = false;

        char[] cadena_div = contraseña.toCharArray();

        int mayus = 0;
        int minus = 0;
        int numeros = 0;

        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                numeros++;
            }

            if (Character.isUpperCase(cadena_div[i])) {
                mayus++;
            }

            if (Character.isLowerCase(cadena_div[i])) {
                minus++;
            }
        }

        if (numeros >= 1 && mayus >= 1 && minus > 2) {
            valida = true;
        } else {
            valida = false;
        }

        return valida;
	}

}
