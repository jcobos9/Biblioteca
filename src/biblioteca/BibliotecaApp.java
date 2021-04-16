package biblioteca;

public class BibliotecaApp {

	public static void main(String[] args) {
		
		Libro rulo = new Libro(001, "Las ruloaventuras", 1999, 7);
		Libro cofe = new Libro(002, "Cofe y a soñar", 1876,4);
		Libro caraflan = new Libro(003, "Flanes y mas cosas",2020,2);
		Revista escapatrajo = new Revista(004, "Escapatrajos y mas fauna salvaje",1090,7);
		Revista fauno = new Revista(005,"series y leyendas",2019,9);
		
		Publicacion lista [] = new Publicacion []{rulo, cofe, caraflan ,escapatrajo, fauno};
		
		for (int i=0; i<lista.length;i++) {
			System.out.println(lista[i].toString());
		}
		
		rulo.prestar();
		rulo.devolver();
		rulo.prestar();
		for (int i=0; i<lista.length;i++) {
			System.out.println(lista[i].toString());
		}
		
		System.out.println(getTopLibro(lista));
		
		
		
		
		
	}
	private static Libro getTopLibro(Publicacion[] lista) {
		int cuenta=0;
		int max=0;
		for(int i=0;i<lista.length;i++) {
			if( lista[i] instanceof Libro) {
				
				if( ((Libro) lista[i]).getVecesPrestado()>cuenta ) {
					cuenta=((Libro) lista[i]).getVecesPrestado();
					max=i;
				}
			}
			
		}return ((Libro)lista[max]);
	}


}
