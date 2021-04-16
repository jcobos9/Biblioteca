package biblioteca;

public class Revista extends Publicacion{

	private int numero;
	
	public static final int EJEMPLARES=2;

	public int getNumero() {
		return numero;
	}

	public static int getEjemplares() {
		return EJEMPLARES;
	}

	public Revista(int codigo, String titulo, int a�oPublicacion, String editorial, int numero) {
		super(codigo, titulo, a�oPublicacion, editorial);
		this.numero = numero;
	}

	public Revista(int codigo, String titulo, int a�oPublicacion, int numero) {
		super(codigo, titulo, a�oPublicacion, EDITORIAL);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", codigo=" + codigo + ", titulo=" + titulo + ", a�oPublicacion="
				+ a�oPublicacion + ", editorial=" + editorial + "]";
	}
	
	
	
	
}
