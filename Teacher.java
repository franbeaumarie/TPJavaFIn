import java.util.*;

public class Teacher extends Person{


    HashSet<Subject> materias= new HashSet<Subject>();

    TreeSet<Student> alumnos= new TreeSet<Student>((
            new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
                }
            }));

    public Teacher(int id, String name) {
        super(id,name);
    }

    public void addStudent(Student alumno){
        alumnos.add(alumno);
    }

    public String studentsInOrder() {
        return alumnos.toString() ;
    }

    public void addSubject(Subject materia) {
        materias.add(materia);
    }

}
