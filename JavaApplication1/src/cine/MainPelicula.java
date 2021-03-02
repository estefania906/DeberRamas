package cine;

public class MainPelicula {
	
	public static void main(String args[]) {
		Pelicula matrix = new Pelicula();
		
		matrix.setNombre("Matrix");
		
		matrix.setCategoria(categoria);
	}
	
	public static Categoria obtenerCategoriaDeBDD() {
		Categoria categoria = new Categoria();
		categoria.setId(0);
		categoria.setNombre("Acción");
		categoria.setDescripcion("Full armas y peleas");
		categoria.setEstado(true);
		return categoria;
		
	}

}



