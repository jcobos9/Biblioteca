package biblioteca;

public class Libro extends Publicacion{

	/**
	 * numero de ejemplares q se tienen de un libro
	 */
	private int numeroEjemplares;
	/**
	 * muestra el estado de un libro si esta prestado o no
	 */
	private boolean prestado;
	
	private int vecesPrestado;
	
	//GETTERS
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public int getVecesPrestado() {
		return vecesPrestado;
	}
	
	//constructores
	/**
	 * constructor con todos los campos
	 * @param codigo
	 * @param titulo
	 * @param a�oPublicacion
	 * @param editorial
	 * @param numeroEjemplares
	 * @param prestado
	 */
	public Libro(int codigo, String titulo, int a�oPublicacion, String editorial, int numeroEjemplares,
			boolean prestado) {
		super(codigo, titulo, a�oPublicacion, editorial);
		this.numeroEjemplares = numeroEjemplares;
		this.prestado = prestado;
		this.vecesPrestado=0;
	}
	
	/**
	 * constructor con editorial por defecto
	 * @param codigo
	 * @param titulo
	 * @param a�oPublicacion
	 * @param numeroEjemplares
	 * @param prestado
	 */
	public Libro(int codigo, String titulo, int a�oPublicacion, int numeroEjemplares) {
		super(codigo, titulo, a�oPublicacion, EDITORIAL);
		this.numeroEjemplares = numeroEjemplares;
		this.prestado = false;
		this.vecesPrestado=0;
	}
	
	//metodos
	/**
	 * presta un libro
	 */
	public void prestar() {
		this.prestado=true;
		this.vecesPrestado++;
	}
	
	public void devolver() {
		this.prestado=false;
	}
	@Override
	public String toString() {
		return "Libro [numeroEjemplares=" + numeroEjemplares + ", prestado=" + prestado + ", vecesPrestado="
				+ vecesPrestado + ", codigo=" + codigo + ", titulo=" + titulo + ", a�oPublicacion=" + a�oPublicacion
				+ ", editorial=" + editorial + "]";
	}
	
	
}
