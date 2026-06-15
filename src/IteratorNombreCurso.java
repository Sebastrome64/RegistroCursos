public class IteratorNombreCurso implements Iterator{

    private Nodo current;

    public IteratorNombreCurso(Nodo head) {
        current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        Curso curso = current.getCurso();
        current = current.getSiguiente();
        return curso.getNombre();
    }
}
