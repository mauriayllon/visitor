package ejercicios5.ej2;


public interface IVisitor {

    void curar(Perro perro, String msg);
    void curar(Gato gato,String msg);
    void curar(Caballo caballo,String msg);
}
