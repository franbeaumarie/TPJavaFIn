public class Student extends Person {

   private final int promedio;

   public static int orden;

   private int myOrden = 0;

    public Student(int dni, String name, int promedio) {
        super(dni,name);
        this.promedio = promedio;
        myOrden =  orden++;
    }

    public int getPromedio(){
        return promedio;
    }

    public int getOrden(){
        return myOrden;
    }

    @Override
    public String toString() {
        return name;
    }


}
