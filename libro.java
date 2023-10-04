/**
 * clase libro
 */
public class libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

    /**
     * Método constuctor para inicializar los atributos de la clase
     * @param titulo
     * @param autor
     * @param numeroPaginas
     *
     * Complejidad temporal: O(1) Tiempo constante
     */
    public libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * Método getter que permite buscar el autor, titulo y numero de paginas del respectivo libro
     */

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

