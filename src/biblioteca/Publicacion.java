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
	 * A�o en el que se publico el objeto
	 */
	protected int a�oPublicacion;
	/*
	 * editorial en la que se ha publicado el objeto
	 */
	protected String editorial;
	
	//CONSTANTES
	
	public static final String EDITORIAL="desconocido";
	
	public static final int A�OACTUAL=2021;
	//GETTERS
	
	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getA�oPublicacion() {
		return a�oPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}


	//CONSTRUCTORES
	
	public Publicacion(int codigo, String titulo, int a�oPublicacion, String editorial) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�oPublicacion = a�oPublicacion;
		this.editorial = editorial;
	}
	
	public Publicacion(int codigo, String titulo, int a�oPublicacion) {
		this.codigo=codigo;
		this.a�oPublicacion=a�oPublicacion;
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
		return "Publicacion tiene un codigo=" + codigo + ", su titulo es titulo=" + titulo + ", su a�o de publicacion es a�oPublicacion=" + a�oPublicacion
				+ ", su editorial es editorial=" + editorial + "]";
	}
	/**
	 * 
	 * @return antiguedad te devuelve la antiguedad de la publicacion
	 */
	public int getAntiguedad() {
	int antiguedad=A�OACTUAL-a�oPublicacion;
	return antiguedad;
	
	}
	
	
	
	
}
