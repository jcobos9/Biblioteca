package biblioteca;

public class Publicacion {

	/*
	 * codigo de identificacion de cada objeto publicacion 
	 */
	protected int codigo;
	/*
	 * Titulo del objeto
	 */
	protected String titulo;
	/*
	 * Año en el que se publico el objeto
	 */
	protected int añoPublicacion;
	/*
	 * editorial en la que se ha publicado el objeto
	 */
	protected String editorial;
	
	//CONSTANTES
	
	public static final String EDITORIAL="desconocido";
	
	public static final int AÑOACTUAL=2021;
	//GETTERS
	
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}


	//CONSTRUCTORES
	
	public Publicacion(int codigo, String titulo, int añoPublicacion, String editorial) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.editorial = editorial;
	}
	
	public Publicacion(int codigo, String titulo, int añoPublicacion) {
		this.codigo=codigo;
		this.añoPublicacion=añoPublicacion;
		this.titulo=titulo;
		this.editorial=EDITORIAL;
		
	}

	//metodos
	
	public boolean equals(Object otro){
		
		if (otro == null || !(otro instanceof Publicacion)) {
			return false;
		}
		 Publicacion otra = (Publicacion) otro;
		 
		 boolean ret=false;
		 
		 if ((this.codigo==otra.codigo)) {
			 ret=true;
		 }
			 return ret;
		}

	@Override
	public String toString() {
		return "Publicacion tiene un codigo=" + codigo + ", su titulo es titulo=" + titulo + ", su año de publicacion es añoPublicacion=" + añoPublicacion
				+ ", su editorial es editorial=" + editorial + "]";
	}
	/**
	 * 
	 * @return antiguedad te devuelve la antiguedad de la publicacion
	 */
	public int getAntiguedad() {
	int antiguedad=AÑOACTUAL-añoPublicacion;
	return antiguedad;
	
	}
	
	
	
	
}
