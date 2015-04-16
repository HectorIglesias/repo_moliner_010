package ejemplo1;

public class Profesor {

	private String nombreProfesor;
	private String apellidosProfesor;
	private int edad;
	
	public Profesor(String a, int b){
		nombreProfesor = a;
		edad = b;		
	}
	
	public Profesor(String a, int b, String c){
		nombreProfesor = a;
		edad = b;	
		apellidosProfesor = c;
	}
	/**
	 * @return el nombreProfesor
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	/**
	 * @return el apellidosProfesor
	 */
	public String getApellidosProfesor() {
		return apellidosProfesor;
	}
	
	/**
	 * 
	 * @return edad
	 */
	public int getEdad(){
		return edad;
	}
	
}
