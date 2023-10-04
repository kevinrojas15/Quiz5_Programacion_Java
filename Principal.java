public class Principal {
    /**
     * primera clase que se ejecuta
     */
    public static void main(String[] args) {
        /**
         * Crear la biblioteca con una capacidad máxima de 5 libros
         */
        Biblioteca bibliotecaKonradLorenz = new Biblioteca(5);
        /**
         *  Crear 5 objetos de la clase Libro
         */

        libro libro1 = new libro("Cien años de soledad", "Gabriel García Márquez", 496);
        libro libro2 = new libro("El código Da Vinci", "Dan Brown", 656);
        libro libro3 = new libro("1984", "George Orwell", 326);
        libro libro4 = new libro("El Hobbit", "J.R.R. Tolkien", 310);
        libro libro5 = new libro("La Odisea", "Homero", 448);

        /**
         *  Registrar los libros en la biblioteca
         */
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        /**
         *  Mostrar los libros disponibles en la biblioteca
         */
        bibliotecaKonradLorenz.mostrarLibrosDisponibles();
    }
}