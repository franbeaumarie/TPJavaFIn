public class Subject {

    private final TPManager manager;
    private final Teacher teacher;

    private String name;
    private int id;

    public Subject(Teacher teacher, int i, String s) {
        this.teacher = teacher;
        manager = new TPManager();
        name = s;
        id  = i;
    }

    public void addStudent(Student student) {
        teacher.addStudent(student);
    }

    public TPManager getTpManagment() {
        return manager ;
    }
}
