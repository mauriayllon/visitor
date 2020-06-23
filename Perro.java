package ejercicios5.ej2;


public class Perro implements IAnimal {
    private int attribute1;
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

    public int getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
}