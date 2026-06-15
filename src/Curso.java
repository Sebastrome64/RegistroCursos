public class Curso {

    private String idCurso;
    private String nombre;
    private String horario;
    private String profesor;
    private String aula;
    private int cupos;
    private int tipo;

    public Curso(String idCurso, String nombre, String horario, String profesor, String aula, int cupos, int tipo) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.horario = horario;
        this.profesor = profesor;
        this.aula = aula;
        this.cupos = cupos;
        this.tipo = tipo;
    }
    public String getIdCurso() {
        return idCurso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getHorario() {
        return horario;
    }
    public String getProfesor() {
        return profesor;
    }
    public String getAula() {
        return aula;
    }
    public int getCupos() {
        return cupos;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

}
