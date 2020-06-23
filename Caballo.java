package ejercicios5.ej2;

public class Caballo implements IAnimal {
    private String nombre;
    private int attribute2;

    // implementando patron visitor
    @Override
    public void curarEnfermedad1(IVisitor visitor) {
         visitor.curar(this,"enfermedad1");
    }

    @Override
    public void curarEnfermedad2(IVisitor visitor) {
         visitor.curar(this, "enfermedad2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}