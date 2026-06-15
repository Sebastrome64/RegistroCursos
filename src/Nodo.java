public class Nodo {

    private Curso curso;
    private Nodo siguiente;

    public Nodo(Curso curso) {
        this.curso = curso;
        this.siguiente = null;
    }

    public Curso getCurso() {
        return curso;
    }
    public Nodo getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
