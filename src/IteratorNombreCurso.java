public class IteratorNombreCurso implements Iterator {

    private Curso[] cursosOrdenados;
    private int posicion;

    public IteratorNombreCurso(Nodo inicio) {
        this.cursosOrdenados = convertirListaEnArreglo(inicio);
        ordenarPorNombre();
        this.posicion = 0;
    }

    private Curso[] convertirListaEnArreglo(Nodo inicio) {
        int cantidad = contarCursos(inicio);
        Curso[] cursos = new Curso[cantidad];

        Nodo actual = inicio;
        int indice = 0;

        while (actual != null) {
            cursos[indice] = actual.getCurso();
            actual = actual.getSiguiente();
            indice++;
        }

        return cursos;
    }

    private int contarCursos(Nodo inicio) {
        int contador = 0;
        Nodo actual = inicio;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    private void ordenarPorNombre() {
        for (int i = 0; i < cursosOrdenados.length - 1; i++) {
            for (int j = 0; j < cursosOrdenados.length - i - 1; j++) {
                String nombreActual = cursosOrdenados[j].getNombre();
                String nombreSiguiente = cursosOrdenados[j + 1].getNombre();

                if (nombreActual.compareToIgnoreCase(nombreSiguiente) > 0) {
                    Curso temporal = cursosOrdenados[j];
                    cursosOrdenados[j] = cursosOrdenados[j + 1];
                    cursosOrdenados[j + 1] = temporal;
                }
            }
        }
    }

    @Override
    public boolean hasNext() {
        return posicion < cursosOrdenados.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Curso curso = cursosOrdenados[posicion];
            posicion++;
            return curso;
        }

        return null;
    }
}