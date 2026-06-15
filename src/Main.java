public class Main {
    public static void main(String[] args) {
        RegistroCurso registroCurso = new RegistroCurso();

        registroCurso.agregarCurso(new Curso(
                "NRC001",
                "Programacion Orientada a Objetos",
                "Lunes 08:00 - 10:00",
                "Carlos Ramirez",
                "Aula 201",
                30,
                1
        ));

        registroCurso.agregarCurso(new Curso(
                "NRC002",
                "Base de Datos",
                "Martes 10:00 - 12:00",
                "Maria Lopez",
                "Laboratorio 3",
                25,
                2
        ));

        registroCurso.agregarCurso(new Curso(
                "NRC003",
                "Algoritmos",
                "Miercoles 14:00 - 16:00",
                "Jose Torres",
                "Aula 105",
                35,
                1
        ));

        registroCurso.agregarCurso(new Curso(
                "NRC004",
                "Redes",
                "Jueves 16:00 - 18:00",
                "Ana Castillo",
                "Laboratorio 1",
                20,
                2
        ));

        registroCurso.agregarCurso(new Curso(
                "NRC005",
                "Calculo",
                "Viernes 08:00 - 10:00",
                "Luis Mendoza",
                "Aula 302",
                40,
                3
        ));

        Iterator iterator = registroCurso.crearIterator();

        System.out.println("Cursos ordenados por nombre en orden alfabetico: ");
        System.out.println();

        while (iterator.hasNext()) {
            Curso curso = (Curso) iterator.next();
            System.out.println(curso);
        }
    }
}