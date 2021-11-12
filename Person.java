//Una clase base llamada Person, se va a utilizar tanto para student y teacher(los 2 usan dni y name)
public class Person { 

    //Tenemos un int para el DNI y un string para el nombre de la persona
    //Protected es tipo un private pero que podes acceder desde la clase que heredas o implementas
    protected int dni;
    protected String name;

    public Person(int id, String name) {
        this.dni = id;//En int dni se va a guardar el id que pongamos para la persona
        this.name = name;//En string name se va a guardar el nombre que pongamos para la persona
    }

    public String getName() {//devuelve el nombre
        return name;
    }
}
