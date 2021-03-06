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

	public Revista(int codigo, String titulo, int aņoPublicacion, String editorial, int numero) {
		super(codigo, titulo, aņoPublicacion, editorial);
		this.numero = numero;
	}

	public Revista(int codigo, String titulo, int aņoPublicacion, int numero) {
		super(codigo, titulo, aņoPublicacion, EDITORIAL);
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", codigo=" + codigo + ", titulo=" + titulo + ", aņoPublicacion="
				+ aņoPublicacion + ", editorial=" + editorial + "]";
	}
	
	
	
	
}
