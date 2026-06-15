public class RegistroCurso implements Agregado{

    private Nodo inicio;

    public RegistroCurso() {
        this.inicio = null;
    }

    public void agregarCurso(Curso curso) {
        Nodo nuevoNodo = new Nodo(curso);

        if(inicio == null) {
            inicio = nuevoNodo;
        } else {
            Nodo actual = inicio;

            while(actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public Nodo getInicio() {
        return inicio;
    }

    @Override
    public Iterator crearIterator() {
        return new IteratorNombreCurso(inicio);
    }
}
