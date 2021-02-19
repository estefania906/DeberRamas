/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelicula;

/**
 *
 * @author Estefi Mantilla
 */
public class MainPelicula {
     
    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String args[]) {
		Pelicula matrix = new Pelicula();
		
		matrix.setNombre("Matrix");
		
		matrix.setCategoria(obtenerCategoriaDeBDD());
                
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
