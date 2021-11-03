public class TP{

   private Subject materia;
   private Student estudiante;
   private int id;
   private String nombreDePrueba;

    public TP(Subject materia, Student estudiante, int id, String nombreDePrueba) {
        this.materia = materia;
        this.estudiante = estudiante;
        this.id = id;
        this.nombreDePrueba = nombreDePrueba;
    }


    public Student getStudent() {
        return estudiante;
    }

    @Override
    public String toString() {
        return "TP  from:  "+ estudiante+"  Name:  " + nombreDePrueba;

    }
}
