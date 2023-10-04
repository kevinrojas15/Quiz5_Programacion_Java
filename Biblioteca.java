/**
 * clase Biblioteca
 */
public class Biblioteca {
    private libro[] librosDisponibles;
    private int cantidadLibros;

    public Biblioteca(int capacidadMaxima) {
        this.librosDisponibles = new libro[capacidadMaxima];
        this.cantidadLibros = 0;
    }

    public void registrarLibro(libro libro) {
        if (cantidadLibros < librosDisponibles.length) {
            librosDisponibles[cantidadLibros] = libro;
            cantidadLibros++;
        } else {
            System.out.println("La biblioteca está llena, no se puede registrar más libros.");
        }
    }

    public libro buscarlibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (librosDisponibles[i].getTitulo().equalsIgnoreCase(titulo)) {
                return librosDisponibles[i];
            }
        }
        return null;
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Título: " + librosDisponibles[i].getTitulo());
            System.out.println("Autor: " + librosDisponibles[i].getAutor());
            System.out.println("Número de Páginas: " + librosDisponibles[i].getNumeroPaginas());
            System.out.println("------------------------");
        }
    }

    public void registrarlibro(libro libro1) {
    }
}