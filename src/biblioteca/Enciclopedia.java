package biblioteca;
//Este es el comentario
public class Enciclopedia extends Libro {

	
	private String tematica;
	
	private String nivel_conocimientos;
	
	public static final String NIVEL_DEF="medio";

	public String getTematica() {
		return tematica;
	}

	public String getNivel_conocimientos() {
		return nivel_conocimientos;
	}
	//CONSTRUCTOR
	public Enciclopedia(int codigo, String titulo, int añoPublicacion, int numeroEjemplares, String tematica) {
		super(codigo, titulo, añoPublicacion, numeroEjemplares);
		this.tematica=tematica;
		this.nivel_conocimientos=NIVEL_DEF;
	}

	//otro comentario mas
}
